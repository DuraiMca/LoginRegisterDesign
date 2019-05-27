package com.murugan.durai.loginregisterform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
 TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      textView=findViewById(R.id.registerid);
      textView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent register=new Intent(MainActivity.this,RegisterActivity.class);
              startActivity(register);
              finish();
          }
      });

    }
}