package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in=getIntent();
        String name1=in.getStringExtra("Name");
        TextView t1=findViewById(R.id.textView);
        t1.setText("Your Name is : "+name1);
        Button bt=(Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1=(EditText) findViewById(R.id.editTextText);
                EditText et2=(EditText) findViewById(R.id.editTextText3);
                Long ph=Long.parseLong(et1.getText().toString());
                String mail=et2.getText().toString();
                Intent out=new Intent(getApplicationContext(), MainActivity3.class);
                Bundle b=new Bundle();
                b.putLong("Phone Number",ph);
                b.putString("Email",mail);
                out.putExtras(b);
                startActivity(out);
            }
        });
    }
}