package com.aula.lanfranchi.areacalculator1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.aula.lanfranchi.areacalculator1.R.id.sq;

public class MainActivity extends AppCompatActivity {

    private RadioButton sq;
    private RadioButton tri;
    private RadioButton cir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sq = (RadioButton) findViewById(R.id.sq);
        tri = (RadioButton) findViewById(R.id.tri);
        cir = (RadioButton) findViewById(R.id.cir);
    }

    public void onClickBtnNext(View v) {
        RadioGroup rd = (RadioGroup) findViewById(R.id.shapes);
        int checked = rd.getCheckedRadioButtonId();
        if (checked!=-1){
            // Check which radio button was clicked
            switch(checked) {
                case R.id.sq:
                    Intent intent = new Intent(this, Tab2Activity.class);
                    intent.putExtra("shape", sq.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.tri:
                    Intent intent2 = new Intent(this, Tab2Activity.class);
                    intent2.putExtra("shape", tri.getText().toString());
                    startActivity(intent2);
                    break;
                case R.id.cir:
                    Intent intent3 = new Intent(this, Tab2Activity.class);
                    intent3.putExtra("shape", cir.getText().toString());
                    startActivity(intent3);
                    break;
            }
        }else {
            Toast.makeText(this.getApplicationContext(),getString(R.string.error_radiobtn), Toast.LENGTH_LONG).show();
        }
    }
}
