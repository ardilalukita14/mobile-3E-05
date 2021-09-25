package org.aplas.basicappx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import java.text.DecimalFormat;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {

    String typeStr;
    double value1;
    private AlertDialog startDialog;
    private Distance dist = new Distance();
    private Weight weight = new Weight();
    private Temperature temp = new Temperature();
    private Button convertBtn;
    private EditText inputTxt, outputTxt;
    private Spinner unitOri, unitConv;
    private RadioGroup unitType;
    private CheckBox roundBox, formBox;
    private ImageView imgView, imgFormula;

    protected double convertUnit(String type, String oriUnit, String convUnit, double value) {
        if (type.equals("Temperature") && oriUnit.equals("°F") && convUnit.equals("K")) {
            temp.setFahrenheit(value);
            return temp.getKelvins();
        } else if (type.equals("Temperature") && oriUnit.equals("K") && convUnit.equals("°C")) {
            temp.setKelvins(value);
            return temp.getCelcius();
        } else if (type.equals("Distance") && oriUnit.equals("Mtr") && convUnit.equals("Mil")) {
            dist.setMeter(value);
            return dist.getMile();
        } else if (type.equals("Distance") && oriUnit.equals("Mil") && convUnit.equals("Ft")) {
            dist.setMile(value);
            return dist.getFoot();
        } else if (type.equals("Distance") && oriUnit.equals("Inc") && convUnit.equals("Mtr")) {
            dist.setInch(value);
            return dist.getMeter();
        } else if (type.equals("Weight") && oriUnit.equals("Grm") && convUnit.equals("Pnd")) {
            weight.setGram(value);
            return weight.getPound();
        } else if (type.equals("Weight") && oriUnit.equals("Pnd") && convUnit.equals("Onc")) {
            weight.setPound(value);
            return weight.getOunce();
        }
        return value;
    }

    protected String strResult(double val, boolean rounded) {
        if (rounded) {
            DecimalFormat df = new DecimalFormat("#.##");
            return df.format(val);
        } else {
            DecimalFormat dff = new DecimalFormat("#.#####");
            return dff.format(val);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtn = (Button) findViewById(R.id.convertButton);
        inputTxt = (EditText) findViewById(R.id.inputText);
        outputTxt = (EditText) findViewById(R.id.outputText);
        unitOri = (Spinner) findViewById(R.id.oriList);
        unitConv = (Spinner) findViewById(R.id.convList);
        unitType = (RadioGroup) findViewById(R.id.radioGroup);
        roundBox = (CheckBox) findViewById(R.id.chkRounded);
        formBox = (CheckBox) findViewById(R.id.chkFormula);
        imgView = (ImageView) findViewById(R.id.img);
        imgFormula = findViewById(R.id.imgFormula);

        unitType.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton selectedRB = findViewById(checkedId);
                        typeStr = selectedRB.getText().toString();
                        switch (typeStr) {
                            case "Temperature":
                                ArrayAdapter<CharSequence> adpTemp = ArrayAdapter.createFromResource(unitType.getContext(),
                                        R.array.tempList, android.R.layout.simple_spinner_item);
                                imgView.setImageResource(R.drawable.temperature);
                                adpTemp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                unitOri.setAdapter(adpTemp);
                                unitConv.setAdapter(adpTemp);
                                inputTxt.setText("0");
                                outputTxt.setText("0");
                                break;
                            case "Distance":
                                ArrayAdapter<CharSequence> adpDist = ArrayAdapter.createFromResource(unitType.getContext(),
                                        R.array.distList, android.R.layout.simple_spinner_item);
                                imgView.setImageResource(R.drawable.distance);
                                adpDist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                unitOri.setAdapter(adpDist);
                                unitConv.setAdapter(adpDist);
                                inputTxt.setText("0");
                                outputTxt.setText("0");
                                break;
                            case "Weight":
                                ArrayAdapter<CharSequence> adpWeight = ArrayAdapter.createFromResource(unitType.getContext(),
                                        R.array.weightList, android.R.layout.simple_spinner_item);
                                imgView.setImageResource(R.drawable.weight);
                                adpWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                unitOri.setAdapter(adpWeight);
                                unitConv.setAdapter(adpWeight);
                                inputTxt.setText("0");
                                outputTxt.setText("0");
                                break;
                        }
                    }
                });
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doConvert();
            }
        });

        unitOri.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                doConvert();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                return;
            }
        });

        unitConv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                doConvert();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                return;
            }
        });

        roundBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doConvert();
            }
        });

        formBox.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            imgFormula.setVisibility(View.VISIBLE);
                        } else {
                            imgFormula.setVisibility(View.INVISIBLE);
                        }
                    }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        startDialog = new AlertDialog.Builder(MainActivity.this).create();
        startDialog.setTitle("Application started");
        startDialog.setMessage("This app can use to convert any units");
        startDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        startDialog.show();
    }

    public void doConvert() {
        RadioButton selectedRB = findViewById(unitType.getCheckedRadioButtonId());
        typeStr = selectedRB.getText().toString();
        String ori = unitOri.getSelectedItem().toString();
        String conv = unitConv.getSelectedItem().toString();
        double input = Double.parseDouble(inputTxt.getText().toString());
        value1 = convertUnit(typeStr, ori, conv, input);
        outputTxt.setText(strResult(value1, roundBox.isChecked()));
    }
}