package com.hamidul.home_work_2141;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button button;
    EditText editText;
    int bcb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Home_Work_214.1

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //======================================================================================================================


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        editText = findViewById(R.id.edText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);
        //=============================================================


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Number = editText.getText().toString();
                if (Number.equals("")){
                    editText.setError("Please Enter Your Number");
                    editText.requestFocus();
                    return;
                }

                int myNumber = Integer.parseInt(Number);
                tvDisplay.setVisibility(View.VISIBLE);
                bcb = 1;

                if ( myNumber%5==0 && myNumber%11==0 ){
                    tvDisplay.setText(myNumber+" is divisible by 5 and 11");
                    tvDisplay.setTextColor(Color.GREEN);
                }else {
                    tvDisplay.setText(myNumber+" isn't divisible by 5 and 11");
                    tvDisplay.setTextColor(Color.RED);
                }

            }
        });


    }

    @Override
    public void onBackPressed() {
        if (bcb==1){
            tvDisplay.setVisibility(View.GONE);
            editText.setText("");
            tvDisplay.setText("");
            bcb = 0;
        }else {
            super.onBackPressed();
        }

    }
}