package com.example.diu_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Intro extends AppCompatActivity {

    ImageView img;
    TextView text;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setTitle("Home");

        img=findViewById(R.id.intro_img);
        text=findViewById(R.id.intro_text);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intro.this,MainActivity.class);
                Toast.makeText(Intro.this,"Welcome",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}