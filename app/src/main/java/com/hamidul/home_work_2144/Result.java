package com.hamidul.home_work_2144;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Result extends AppCompatActivity {
    TextView resultToolbar, tPercentage, Grade;
    public static int Total, color;
    float Percentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //======================================================================================================================

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++
        resultToolbar = findViewById(R.id.resultToolbar);
        tPercentage = findViewById(R.id.Percentage);
        Grade = findViewById(R.id.Grade);
        //=====================================================

        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Percentage = (float) Total/5;
        //tvPercentage = Float.valueOf(decimalFormat.format(tvPercentage));

        tPercentage.setText("Percentage = "+Percentage+"%");
        
        if (Percentage>=80){
            Grade.setText("Grade : A");
        } else if (Percentage>=70) {
            Grade.setText("Grade : B");
        } else if (Percentage>=60) {
            Grade.setText("Grade : C");
        } else if (Percentage>=50) {
            Grade.setText("Grade : D");
        } else if (Percentage>=40) {
            Grade.setText("Grade : E");
        } else if (Percentage<40) {
            resultToolbar.setText("FAILED");
            resultToolbar.setTextColor(Color.RED);
            Grade.setText("Grade : F");
        }

        //tPercentage.setTextColor(color);

    }
}