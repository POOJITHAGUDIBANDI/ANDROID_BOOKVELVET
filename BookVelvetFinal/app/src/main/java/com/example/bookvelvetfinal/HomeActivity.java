package com.example.bookvelvetfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity  implements View.OnClickListener{

    public CardView card1,card2,card3,card4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        card1=(CardView) findViewById(R.id.c1);
        card2=(CardView) findViewById(R.id.c2);
        card3=(CardView) findViewById(R.id.c3);
        card4=(CardView) findViewById(R.id.c4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()){

            case R.id.c1:
                i=new Intent(this,Books.class);
                startActivity(i);
                break;

            case R.id.c2:
                i=new Intent(this,Shelves.class);
                startActivity(i);
                break;

            case R.id.c3:
                i=new Intent(this,Alert.class);
                startActivity(i);
                break;
            case R.id.c4:
                i=new Intent(this,Aboutus.class);
                startActivity(i);
                break;



        }

    }
}