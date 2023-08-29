package com.hamidul.home_work_2141;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button button,btnYes,btnNo;
    EditText editText;
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
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);
        //=============================================================

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String sc = editText.getText().toString();

                //if (sc.length()==0){
                //    button.setEnabled(false);
                //} else {
                //    button.setEnabled(true);
                //}

                button.setEnabled(!sc.isEmpty());

                if (sc.length()==0){
                    button.setTextColor(Color.parseColor("#4D000000"));
                } else {
                    button.setTextColor(Color.parseColor("#9C27B0"));
                }

                //if (sc.length()>0){
                  //  int i = Integer.parseInt(sc);
                    //if (i==0){
                      //  editText.setText("");
                       // button.setEnabled(false);
                        //button.setTextColor(Color.parseColor("#4D000000"));
                        //Toast.makeText(MainActivity.this, "Minimum Number 1", Toast.LENGTH_SHORT).show();
                    //}
                //}

                if (count<before){
                    tvDisplay.setVisibility(View.GONE);
                }else {
                    tvDisplay.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (s.toString().length() >0 && s.toString().startsWith("0")) {
                    s.clear();
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String sNumber = editText.getText().toString();

                    //if (sNumber.equals("")){
                    //editText.setError("Please Enter Your Number");
                    //editText.requestFocus();
                    //return;
                    //}

                    int myNumber = Integer.parseInt(sNumber);
                    tvDisplay.setVisibility(View.VISIBLE);

                    if (myNumber%5==0 && myNumber%11==0 ){
                        tvDisplay.setText(myNumber+" is divisible by 5 and 11");
                        tvDisplay.setTextColor(Color.GREEN);
                        //tvDisplay.setTextColor(Color.parseColor("#ffffff"));
                    } else if (myNumber==0) {
                        tvDisplay.setVisibility(View.GONE);
                    } else {
                        tvDisplay.setText(myNumber+" isn't divisible by 5 and 11");
                        tvDisplay.setTextColor(Color.RED);
                    }

            }

        });

    }

    public void customAlertDialog(){
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setView(view);

        btnYes = (Button) view.findViewById(R.id.yes);
        btnNo = (Button) view.findViewById(R.id.no);

        final AlertDialog dialog = builder.create();

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        customAlertDialog();
    }
}