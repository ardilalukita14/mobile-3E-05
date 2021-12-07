package org.aplas.latihanretrofitnew;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.aplas.latihanretrofitnew.models.Repo;
import org.aplas.latihanretrofitnew.services.GitHubService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    private AlertDialog.Builder errorDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        textView = findViewById(R.id.showText);
        editText = (EditText) findViewById(R.id.editText_username);
    }

        public void GetDataButton(View v) {
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        //Setting Title
            progressDialog.setTitle("Proses Mengambil Data Github");
         //Setting Message
            progressDialog.setMessage("Loading...");
         //Progress Dialog Style Spinner
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.show(); // Display Progress Dialog

            //Progress Dialog Max Value
            progressDialog.setMax(100);
            //Fetching max Value
            progressDialog.getMax();
            //Fetching current progress
            progressDialog.getProgress();
            //Incremented By Value 2
            progressDialog.incrementProgressBy(2);
            //Cannot Cancel Progress Dialog
            progressDialog.setCancelable(false);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    progressDialog.dismiss();
                }
            }).start();

            String username = editText.getText().toString();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<List<Repo>> repos = service.listRepos(username);

        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                Integer id = response.body().get(1).getId();
                String htmlUrl = response.body().get(1).getHtmlUrl();
                String desc = response.body().get(1).getDescription();

                Log.d("LatihanRetrofitNew", id + " : " +htmlUrl + " : " + desc);
                textView.setText("ID = " + id + "\n" + "URL = " + htmlUrl + "\n" + "Description = " + desc);
                //Dismiss the dialog
                progressDialog.dismiss();
                //binding.setRepo(response.body().get(0));
                // Log.d("Successful", repoList.body().get(0).getHtmlUrl());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

                errorDialog = new AlertDialog.Builder(MainActivity.this);
                errorDialog.setTitle("Gagal").setMessage("Maaf Proses Request API GitHub Gagal. Pastikan username GitHub yang Anda Masukkan Sudah Sesuai.");

                errorDialog.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog alertDialog = errorDialog.create();
                alertDialog.show();
            }
        });

        }
}