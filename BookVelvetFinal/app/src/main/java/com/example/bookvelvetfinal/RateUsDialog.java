package com.example.bookvelvetfinal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class RateUsDialog extends AppCompatActivity {

    private float userRate=0;
//    public RateUsDialog(@NonNull Context context) {
//        super(context);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rate_us_dialog_layout);



        final AppCompatButton rateNowBtn=findViewById(R.id.rateNowBtn);
        final AppCompatButton laterBtn=findViewById(R.id.laterBtn);
        final RatingBar ratingBar=findViewById(R.id.ratingBar);
        final ImageView ratingImage=findViewById(R.id.ratimgImage);
       rateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //code goes here
            }

           private void startActivity(Intent intent) {
           }
       });

        laterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hiding rating dialog
                Intent i=new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(i);
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating<=1){
                    ratingImage.setImageResource(R.drawable.angry);
                }
                else if(rating<=2){
                    ratingImage.setImageResource(R.drawable.verybad);
                }
                else if(rating<=3){
                    ratingImage.setImageResource(R.drawable.notbad);
                }
                else if(rating<=4){
                    ratingImage.setImageResource(R.drawable.smile);
                }
                else if(rating<=5){
                    ratingImage.setImageResource(R.drawable.fivestar);
                }

                //animating emoji
                animateImage(ratingImage);

                //selected rating by user
                userRate=rating;
            }
        });
    }

    private void animateImage(ImageView ratingImage){
        ScaleAnimation scaleAnimation=new ScaleAnimation(0,1f,0,1f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);

        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(200);
        ratingImage.startAnimation(scaleAnimation);
    }

}