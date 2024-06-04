package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=(Button) findViewById(R.id.bt);
        EditText et=findViewById(R.id.et1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("Name",name);
                startActivity(i);
            }
        });
    }
}