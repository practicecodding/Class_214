package com.hamidul.home_work_2144;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edPhy, edChem, edBio, edMath, edCom;
    Button button, button2;
    int delete = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Home_Work_214.4

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //======================================================================================================================

        //++++++++++++++++++++++++++++++++++
        edPhy = findViewById(R.id.edPhy);
        edChem = findViewById(R.id.edChem);
        edBio = findViewById(R.id.edBio);
        edMath = findViewById(R.id.edMath);
        edCom = findViewById(R.id.edCom);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        //===================================

        //******************************************************************************************
        edPhy.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = edPhy.getText().toString();

                if (s1.length()==3) {

                    int i1 = Integer.parseInt(s1);

                    if (i1>100) {
                        edPhy.setError("Maximum Number 100");
                        edPhy.requestFocus();
                        button.setEnabled(false);
                        edChem.setEnabled(false);
                        edBio.setEnabled(false);
                        edMath.setEnabled(false);
                        edCom.setEnabled(false);
                    } else if (i1<=100) {
                        button.setEnabled(true);
                        edChem.setEnabled(true);
                        edBio.setEnabled(true);
                        edMath.setEnabled(true);
                        edCom.setEnabled(true);
                    }
                } else {
                    button.setEnabled(true);
                    edChem.setEnabled(true);
                    edBio.setEnabled(true);
                    edMath.setEnabled(true);
                    edCom.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edChem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = edChem.getText().toString();

                if (s1.length()==3) {

                    int i1 = Integer.parseInt(s1);

                    if (i1>100) {
                        edChem.setError("Maximum Number 100");
                        edChem.requestFocus();
                        button.setEnabled(false);
                        edPhy.setEnabled(false);
                        edBio.setEnabled(false);
                        edMath.setEnabled(false);
                        edCom.setEnabled(false);
                    } else if (i1<=100) {
                        button.setEnabled(true);
                        edPhy.setEnabled(true);
                        edBio.setEnabled(true);
                        edMath.setEnabled(true);
                        edCom.setEnabled(true);
                    }
                } else {
                    button.setEnabled(true);
                    edPhy.setEnabled(true);
                    edBio.setEnabled(true);
                    edMath.setEnabled(true);
                    edCom.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edBio.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = edBio.getText().toString();

                if (s1.length()==3) {

                    int i1 = Integer.parseInt(s1);

                    if (i1>100) {
                        edBio.setError("Maximum Number 100");
                        edBio.requestFocus();
                        button.setEnabled(false);
                        edChem.setEnabled(false);
                        edPhy.setEnabled(false);
                        edMath.setEnabled(false);
                        edCom.setEnabled(false);
                    } else if (i1<=100) {
                        button.setEnabled(true);
                        edChem.setEnabled(true);
                        edPhy.setEnabled(true);
                        edMath.setEnabled(true);
                        edCom.setEnabled(true);
                    }
                } else {
                    button.setEnabled(true);
                    edChem.setEnabled(true);
                    edPhy.setEnabled(true);
                    edMath.setEnabled(true);
                    edCom.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edMath.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = edMath.getText().toString();

                if (s1.length()==3) {

                    int i1 = Integer.parseInt(s1);

                    if (i1>100) {
                        edMath.setError("Maximum Number 100");
                        edMath.requestFocus();
                        button.setEnabled(false);
                        edChem.setEnabled(false);
                        edBio.setEnabled(false);
                        edPhy.setEnabled(false);
                        edCom.setEnabled(false);
                    } else if (i1<=100) {
                        button.setEnabled(true);
                        edChem.setEnabled(true);
                        edBio.setEnabled(true);
                        edPhy.setEnabled(true);
                        edCom.setEnabled(true);
                    }
                } else {
                    button.setEnabled(true);
                    edChem.setEnabled(true);
                    edBio.setEnabled(true);
                    edPhy.setEnabled(true);
                    edCom.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edCom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = edCom.getText().toString();

                if (s1.length()==3) {

                    int i1 = Integer.parseInt(s1);

                    if (i1>100) {
                        edCom.setError("Maximum Number 100");
                        edCom.requestFocus();
                        button.setEnabled(false);
                        edChem.setEnabled(false);
                        edBio.setEnabled(false);
                        edMath.setEnabled(false);
                        edPhy.setEnabled(false);
                    } else if (i1<=100) {
                        button.setEnabled(true);
                        edChem.setEnabled(true);
                        edBio.setEnabled(true);
                        edMath.setEnabled(true);
                        edPhy.setEnabled(true);
                    }
                } else {
                    button.setEnabled(true);
                    edChem.setEnabled(true);
                    edBio.setEnabled(true);
                    edMath.setEnabled(true);
                    edPhy.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        //******************************************************************************************

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String sPhy, sChem, sBio, sMath, sCom;

                    int Phy, Chem, Bio, Math, Com;

                    //++++++++++++++++++++++++++++++++++++
                    sPhy = edPhy.getText().toString();
                    sChem = edChem.getText().toString();
                    sBio = edBio.getText().toString();
                    sMath = edMath.getText().toString();
                    sCom = edCom.getText().toString();
                    //====================================


                    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    if (sPhy.equals("")) {
                        edPhy.setError("Please Enter Your Physics Number");
                        edPhy.requestFocus();
                        return;
                    } else if (sChem.equals("")) {
                        edChem.setError("Please Enter Your Chemistry Number");
                        edChem.requestFocus();
                        return;
                    } else if (sBio.equals("")) {
                        edBio.setError("Please Enter Your Biology Number");
                        edBio.requestFocus();
                        return;
                    } else if (sMath.equals("")) {
                        edMath.setError("Please Enter Your Mathematics Number");
                        edMath.requestFocus();
                        return;
                    } else if (sCom.equals("")) {
                        edCom.setError("Please Enter Your Computer Number");
                        edCom.requestFocus();
                        return;
                    }
                    //=======================================================

                    //++++++++++++++++++++++++++++++
                    Phy = Integer.parseInt(sPhy);
                    Chem = Integer.parseInt(sChem);
                    Bio = Integer.parseInt(sBio);
                    Math = Integer.parseInt(sMath);
                    Com = Integer.parseInt(sCom);
                    //==============================

                    //+++++++++++++++++++++++++++++++++++++++++++++
                    Result.Total = Phy + Chem + Bio + Math + Com;
                    //=============================================

                    Result.color = getResources().getColor(R.color.green);

                    Intent intent = new Intent(MainActivity.this, Result.class);
                    startActivity(intent);

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edPhy.setText("");
                edChem.setText("");
                edBio.setText("");
                edMath.setText("");
                edCom.setText("");
            }
        });

    }

}