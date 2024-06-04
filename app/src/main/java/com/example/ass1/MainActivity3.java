package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView t1 =findViewById(R.id.textView3);
        TextView t4=findViewById(R.id.textView6);
        TextView t5=findViewById(R.id.textView7);
        t1.setText("  Coming    together    is    BEGINNING!  \n\n    Keeping  together  is  PROGRESS! \n\n      Working together is SUCCESS!");
        Intent in=getIntent();
        Bundle b=in.getExtras();
        Long ph=b.getLong("Phone Number");
        String mail=b.getString("Email");
        t4.setText("Your Phone Number is : "+Long.toString(ph));
        t5.setText("Your mail id is : "+mail);
        Toast.makeText(getApplicationContext(), "\nThank you for your registration!", Toast.LENGTH_LONG).show();
    }
}