package com.example.rollthedice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1;
    TextView tv_rollnumber;
    ImageView iv_dice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        tv_rollnumber = (TextView) findViewById(R.id.tv_rollnumber);
        iv_dice = (ImageView) findViewById(R.id.iv_dice);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int theRoll;

                theRoll = r.nextInt(6) + 1;
                tv_rollnumber.setText("You rolled a" + theRoll);

                switch (theRoll) {
                    case 1: {
                        iv_dice.setImageResource(R.drawable.dice1);
                        break;
                    }

                    case 2: {
                        iv_dice.setImageResource(R.drawable.dice2);
                        break;
                    }
                    case 3: {
                        iv_dice.setImageResource(R.drawable.dice3);
                        break;
                    }
                    case 4: {
                        iv_dice.setImageResource(R.drawable.dice4);
                        break;
                    }

                    case 5: {
                        iv_dice.setImageResource(R.drawable.dice5);
                        break;
                    }

                    case 6: {
                        iv_dice.setImageResource(R.drawable.dice6);
                        break;
                    }


                }

            }
   });
}
}