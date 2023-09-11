package com.hamidul.home_work_2145;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Home_Work_214.5

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //======================================================================================================================

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = editText.getText().toString();

                button.setEnabled(!s1.isEmpty());

                if (count<before){
                    tvDisplay.setVisibility(View.GONE);
                }else {
                    tvDisplay.setVisibility(View.GONE);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sUnit = editText.getText().toString();
                float units = Float.parseFloat(sUnit);
                float bill;

                if (units<=50) bill = (float) (units*0.50);
                else if (units<=150) bill = (float) (25 + (units-50) * 0.75);
                else if (units<=250) bill = (float) (25 + 75 + (units-150) * 1.20);
                else bill = (float) (25 + 75 + 120 + (units-250)*1.50);

                bill = (float) (bill + bill*0.20);

                tvDisplay.setText("Total Current Bill \n\n= "+bill+" Taka");
                tvDisplay.setVisibility(View.VISIBLE);


            }

        });

    }

}