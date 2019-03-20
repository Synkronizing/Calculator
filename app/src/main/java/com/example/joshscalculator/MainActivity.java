package com.example.joshscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        Button mulBtn = (Button) findViewById(R.id.mulBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button powBtn = (Button) findViewById(R.id.powBtn);
        Button cosBtn = (Button) findViewById(R.id.cosBtn);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resultTextView.setText((getNumberOne() + getNumberTwo())+ "");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resultTextView.setText((getNumberOne() / getNumberTwo())+ "");
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resultTextView.setText((getNumberOne() * getNumberTwo())+ "");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resultTextView.setText((getNumberOne() - getNumberTwo())+ "");
            }
        });
        powBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resultTextView.setText(Math.pow(getNumberOne() , getNumberTwo())+ "");
            }
        });
        cosBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                resultTextView.setText(Math.cos(getNumberOne()*getNumberTwo())+ "");
            }
        });
    }

    private double getNumberOne(){
        EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNumEditText);
        return  Double.parseDouble(FirstNumEditText.getText().toString());

    };
    private double getNumberTwo(){
        EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
        return  Double.parseDouble(SecondNumEditText.getText().toString());

    };

}
