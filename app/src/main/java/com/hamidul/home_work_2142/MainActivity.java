package com.hamidul.home_work_2142;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Home_Work_214.2

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //======================================================================================================================

        //+++++++++++++++++++++++++++++++++++++++
        editText = findViewById(R.id.editText);
        tvDisplay = findViewById(R.id.tvDisplay);
        //=======================================


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String sc = editText.getText().toString();

                if (sc.length()==4){

                    int year = Integer.parseInt(sc);

                    if (year%400==0){

                        tvDisplay.setVisibility(View.VISIBLE);
                        tvDisplay.setText(sc+" is leap year");

                    }else if (year%4==0 && year%100!=0){

                        tvDisplay.setVisibility(View.VISIBLE);
                        tvDisplay.setText(sc+" is leap year");

                    }else {

                        tvDisplay.setVisibility(View.VISIBLE);
                        tvDisplay.setText(sc+" is't leap year");

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
}