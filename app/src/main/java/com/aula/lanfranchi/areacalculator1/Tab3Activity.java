package com.aula.lanfranchi.areacalculator1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab3Activity extends AppCompatActivity {

    private ImageView ivShape;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);

        Bundle intent = getIntent().getExtras();

        tvResult = (TextView) findViewById(R.id.areaResult);

        if(intent.getString("shape").toString().equals(getString(R.string.square))){
            tvResult.setText(String.valueOf(intent.getDouble("area")));
            ivShape = (ImageView) findViewById(R.id.ivSquare);
            ivShape.setVisibility(View.VISIBLE);
        }
        if(intent.getString("shape").toString().equals(getString(R.string.triangle))){
            tvResult.setText(String.valueOf(intent.getDouble("area")));
            ivShape = (ImageView) findViewById(R.id.ivTriangle);
            ivShape.setVisibility(View.VISIBLE);
        }
        if(intent.getString("shape").toString().equals(getString(R.string.circle))){
            tvResult.setText(String.valueOf(intent.getDouble("area")));
            ivShape = (ImageView) findViewById(R.id.ivCircle);
            ivShape.setVisibility(View.VISIBLE);
        }

    }

    public void onClickRestart(View v){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
