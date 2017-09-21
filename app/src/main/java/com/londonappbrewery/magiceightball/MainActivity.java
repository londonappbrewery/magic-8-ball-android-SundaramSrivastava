package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballar={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        final Button press=(Button)findViewById(R.id.ask);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random numbergenerator = new Random();
                int number = numbergenerator.nextInt(4);
                ball.setImageResource(ballar[number]);

            }
        });
    }
}
