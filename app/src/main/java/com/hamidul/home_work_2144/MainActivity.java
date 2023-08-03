package com.hamidul.home_work_2144;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edPhy, edChem, edBio, edMath, edCom;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Home_Work_214.4

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //======================================================================================================================

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        edPhy = findViewById(R.id.edPhy);
        edChem = findViewById(R.id.edChem);
        edBio = findViewById(R.id.edBio);
        edMath = findViewById(R.id.edMath);
        edCom = findViewById(R.id.edCom);
        button = findViewById(R.id.button);
        //=================================================================

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sPhy, sChem, sBio, sMath, sCom;
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

                Result.color=getResources().getColor(R.color.green);
                Intent intent = new Intent(MainActivity.this,Result.class);
                startActivity(intent);
            }
        });


    }
}