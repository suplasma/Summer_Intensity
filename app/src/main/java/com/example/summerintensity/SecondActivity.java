package com.example.summerintensity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (EditText)findViewById(R.id.editText);
    }

    public void onClick(View view){
        try {
            Progress.colorF1 = Color.parseColor(text.getText().toString());
            Progress.colorF2 = Color.parseColor(text.getText().toString());
            Intent intent = new Intent(getApplicationContext(),FirstActivity.class);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "Пример цвета: #056f5d", Toast.LENGTH_LONG).show();
        }
    }
}
