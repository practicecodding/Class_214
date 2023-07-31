package com.hamidul.home_work_2143;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView tvDisplay;
    int Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Home_Work_214.3

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //=====================================================================================================================

        //+++++++++++++++++++++++++++++++++++++++++++++++++
        editText = findViewById(R.id.editText);
        tvDisplay = findViewById(R.id.tvDisplay);
        //=================================================

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = editText.getText().toString();

                if (s1.length()==1){

                    Back=1;

                    tvDisplay.setVisibility(View.VISIBLE);

                    int weekNumber = Integer.parseInt(s1);

                    if (weekNumber==1) {

                        tvDisplay.setText("Sunday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else if (weekNumber==2) {

                        tvDisplay.setText("Monday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else if (weekNumber==3) {

                        tvDisplay.setText("Tuesday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else if (weekNumber==4) {

                        tvDisplay.setText("Wednessday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else if (weekNumber==5) {

                        tvDisplay.setText("Thursday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else if (weekNumber==6) {

                        tvDisplay.setText("Friday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else if (weekNumber==7) {

                        tvDisplay.setText("Saturday");
                        tvDisplay.setTextColor(Color.BLACK);

                    } else {

                        tvDisplay.setVisibility(View.GONE);
                        editText.setError("This Number Isn't Week Number");
                        editText.requestFocus();
                        return;

                    }

                }

                if (before>count){
                    tvDisplay.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void onBackPressed() {

        if (Back==1){
            editText.setText("");
            Back=0;
        }else {
            super.onBackPressed();
        }

    }


}