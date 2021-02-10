package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollbutton;
        rollbutton = findViewById(R.id.rollbutton3);
        final ImageView leftdice = findViewById(R.id.image_leftdice);
        final ImageView rightdice = findViewById(R.id.image_rightdice);
        final int[] dicearray = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dice","button has been pressed!");
                Random Randomnumbergenerator = new Random();
                int number = Randomnumbergenerator.nextInt(6);
                Log.d("dice","the new random number is " + number);
                leftdice.setImageResource(dicearray[number]);

                number = Randomnumbergenerator.nextInt(6);
                rightdice.setImageResource(dicearray[number]);
            }
        });
    }
}