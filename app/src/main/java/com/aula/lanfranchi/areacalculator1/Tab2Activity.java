package com.aula.lanfranchi.areacalculator1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static java.lang.Math.PI;

public class Tab2Activity extends AppCompatActivity {


    private LinearLayout screenRadius;
    private LinearLayout screenOthers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        TextView fieldShape = (TextView) findViewById(R.id.shape);

        Intent intent = getIntent();
        if(intent.getStringExtra("shape").toString().equals(getString(R.string.square))){
            fieldShape.setText(getString(R.string.square));
            screenOthers = (LinearLayout) findViewById(R.id.screenOthers);
            screenOthers.setVisibility(View.VISIBLE);
        }
        if(intent.getStringExtra("shape").toString().equals(getString(R.string.triangle))){
            fieldShape.setText(getString(R.string.triangle));
            screenOthers = (LinearLayout) findViewById(R.id.screenOthers);
            screenOthers.setVisibility(View.VISIBLE);
        }
        if(intent.getStringExtra("shape").toString().equals(getString(R.string.circle))){
            fieldShape.setText(getString(R.string.circle));
            screenRadius = (LinearLayout) findViewById(R.id.screenRadius);
            screenRadius.setVisibility(View.VISIBLE);
        }
    }


    public void onBtnNextCalculate(){
        Intent intent = getIntent();
        if(intent.getStringExtra("shape").toString().equals(getString(R.string.square))){
            EditText baseTxt = (EditText) findViewById(R.id.baseValue);
            EditText heightTxt = (EditText) findViewById(R.id.heightValue);
            double base = Double.parseDouble(baseTxt.getText().toString());
            double height = Double.parseDouble(heightTxt.getText().toString());
            double area = base*height;

            Intent intent1 = new Intent(this, Tab3Activity.class);
            intent1.putExtra("shape", getString(R.string.square));
            intent1.putExtra("area", area);
            startActivity(intent1);
        }
        if(intent.getStringExtra("shape").toString().equals(getString(R.string.triangle))){
            EditText baseTxt = (EditText) findViewById(R.id.baseValue);
            EditText heightTxt = (EditText) findViewById(R.id.heightValue);
            double base = Double.parseDouble(baseTxt.getText().toString());
            double height = Double.parseDouble(heightTxt.getText().toString());
            double area = (base*height)/2;

            Intent intent1 = new Intent(this, Tab3Activity.class);
            intent1.putExtra("shape", getString(R.string.triangle));
            intent1.putExtra("area", area);
            startActivity(intent1);
        }
        if(intent.getStringExtra("shape").toString().equals(getString(R.string.circle))){
            EditText radiusTxt = (EditText) findViewById(R.id.radiusValue);
            double radius = Double.parseDouble(radiusTxt.getText().toString());
            double area = PI*(radius*radius);

            Intent intent1 = new Intent(this, Tab3Activity.class);
            intent1.putExtra("shape", getString(R.string.circle));
            intent1.putExtra("area", area);
            startActivity(intent1);
        }
    }
}
