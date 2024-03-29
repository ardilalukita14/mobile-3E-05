package org.aplas.colorgamex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.Toast;
import android.os.CountDownTimer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import java.util.concurrent.TimeUnit;

public class MyActivity extends AppCompatActivity {

    TextView timer, clrText, scoreText;
    EditText passwd;
    Button submit, start;
    ViewGroup accessbox, colorbox, buttonbox1, buttonbox2, scorebox, progressbox;
    ProgressBar progress;
    Switch isMinus;
    CountDownTimer countDown;
    final String FORMAT = "%d:%d";
    String[] clrList;
    HashMap charList = new HashMap();
    boolean isStarted = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        timer = (TextView) findViewById(R.id.timerText);
        clrText = (TextView) findViewById(R.id.clrText);
        scoreText = (TextView) findViewById(R.id.scoreText);
        passwd = (EditText) findViewById(R.id.appCode);
        submit = (Button) findViewById(R.id.submitBtn);
        start = (Button) findViewById(R.id.startBtn);
        accessbox = (ViewGroup) findViewById(R.id.accessBox);
        colorbox = (ViewGroup) findViewById(R.id.colorBox);
        buttonbox1 = (ViewGroup) findViewById(R.id.buttonBox1);
        buttonbox2 = (ViewGroup) findViewById(R.id.buttonBox2);
        scorebox = (ViewGroup) findViewById(R.id.scoreBox);
        progressbox = (ViewGroup) findViewById(R.id.progressBox);
        progress = (ProgressBar) findViewById(R.id.progressScore);
        isMinus = (Switch) findViewById(R.id.isMinus);

        initTimer();
        initColorList();
    }

    public void openGame(View v) {
        if (!passwd.getText().toString().equals(getString(R.string.keyword))) {
            Toast.makeText(getApplicationContext(), "Password is wrong", Toast.LENGTH_LONG).show();
        } else if (passwd.getText().toString().equals(getString(R.string.keyword))) {
            passwd.setVisibility(View.INVISIBLE);
            submit.setVisibility(View.INVISIBLE);
            accessbox.setVisibility(View.VISIBLE);
            colorbox.setVisibility(View.VISIBLE);
            buttonbox1.setVisibility(View.VISIBLE);
            buttonbox2.setVisibility(View.VISIBLE);
            scorebox.setVisibility(View.VISIBLE);
            progressbox.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
        }
    }

    public void startGame(View v){
        if (!isStarted){
            progress.setProgress(0);
            scoreText.setText("0");
            clrText.setText("");
            start.setVisibility(View.INVISIBLE);
            isStarted=true;
            newGameStage();
        }
    }

    int getNewRandomInt(int min, int max, int except){
        Random r = new Random();
        boolean found = false;
        int number;
        do{
            number = r.ints(min, (max+1)).findFirst().getAsInt();
            if (number != except) found = true;
        }while (!found);
        return number;
    }

    private void newGameStage() {
        initColorList();
    }

    public void submitColor(View v) {
        String charCode = ((Button)v).getText().toString();
        if (charCode.equals(charList.get(clrText.getText().toString()))) {
            correctSubmit();
        } else {
            wrongSubmit();
        }
    }

    private void initTimer() {
        int millisInFuture = getResources().getInteger(R.integer.maxtimer) * 1000;
        int countDownTimer = 1;
        countDown = new CountDownTimer(millisInFuture, countDownTimer) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("" + String.format(FORMAT, TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toMillis(millisUntilFinished) -
                                TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished))));
            }

            public void onFinish() {
                wrongSubmit();
            }
        };
    }

    private void initColorList() {
        clrList = getResources().getStringArray(R.array.colorList);
        String[] temp = getResources().getStringArray(R.array.charList);
        for (int i=0; i<clrList.length; i++) {
            charList.put(clrList[i],temp[i]);
        }
        if(isStarted) {
            String clrTxt = ((TextView)findViewById(R.id.clrText)).getText().toString();
            int lastNum = Arrays.asList(clrList).indexOf(clrTxt);
            int colorIdx = getNewRandomInt(0,5,lastNum);
            clrText.setText(clrList[colorIdx]);
            countDown.start();
        }
    }

    private void updateScore(int score) {
        progress.setProgress(score);
        scoreText.setText(Integer.toString(score));
    }

    private void correctSubmit() {
        int newScore = progress.getProgress()+getResources().getInteger(R.integer.counter);
        updateScore(newScore);
        if(progress.getProgress()==getResources().getInteger(R.integer.maxScore)) {
            countDown.cancel();
            timer.setText("COMPLETE");
            isStarted=false;
            start.setVisibility(View.VISIBLE);
        } else {
            newGameStage();
        }
    }

    private void wrongSubmit() {
        if (isMinus.isChecked() && progress.getProgress()>0) {
            updateScore(progress.getProgress() - getResources().getInteger(R.integer.counter));
            newGameStage();
        }
        newGameStage();
    }
}

