package com.example.diu_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Detail extends AppCompatActivity {

    ImageView teacher_img;
    TextView nam,mail,cell,home;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("TEACHER DETAILS");



        teacher_img=findViewById(R.id.t_img);
        nam=findViewById(R.id.j_name);
        mail=findViewById(R.id.mail_info);
        cell=findViewById(R.id.contact);
        home=findViewById(R.id.place);
        back=findViewById(R.id.bck);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Detail.this,MainActivity.class);
                startActivity(intent);
            }
        });




        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String n,e,p,h,i;
            i=bundle.getString("img");

            Picasso.with(Detail.this).load(i).into(teacher_img);

            n=bundle.getString("name");
            nam.setText(n);
            e=bundle.getString("email");
            mail.setText(e);

            p=bundle.getString("phone");
            cell.setText(p);

            h=bundle.getString("room");
            home.setText(h);



        }

    }
}