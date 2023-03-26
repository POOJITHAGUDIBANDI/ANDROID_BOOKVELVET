package com.example.bookvelvetfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Shelves extends AppCompatActivity  implements View.OnClickListener{

    public CardView card1,card2,card3,card4,card5,card6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelves);
        getSupportActionBar().hide();
        card1=(CardView) findViewById(R.id.s1);
        card2=(CardView) findViewById(R.id.s2);
        card3=(CardView) findViewById(R.id.s3);
        card4=(CardView) findViewById(R.id.s4);
        card5=(CardView) findViewById(R.id.s5);
        card6=(CardView) findViewById(R.id.s6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()){

            case R.id.s1:
                i=new Intent(this,shelf1.class);
                startActivity(i);
                break;

            case R.id.s2:
                i=new Intent(this,shelf2.class);
                startActivity(i);
                break;

            case R.id.s3:
                i=new Intent(this,shelf3.class);
                startActivity(i);
                break;
            case R.id.s4:
                i=new Intent(this,shelf4.class);
                startActivity(i);
                break;
            case R.id.s5:
                i=new Intent(this,shelf5.class);
                startActivity(i);
                break;
            case R.id.s6:
                i=new Intent(this,shelf6.class);
                startActivity(i);
                break;



        }

    }
}