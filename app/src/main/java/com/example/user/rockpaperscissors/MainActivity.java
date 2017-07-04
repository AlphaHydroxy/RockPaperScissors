package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.user.rockpaperscissors.R.id.comprps;
import static com.example.user.rockpaperscissors.R.id.resultBox;
import static com.example.user.rockpaperscissors.R.id.rockbtn;
import static com.example.user.rockpaperscissors.R.id.rps;

public class MainActivity extends AppCompatActivity {

    TextView playerChoice, computerChoice, result;
    Button rockButton, paperButton, scissorButton;
    Game game;
    Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerChoice = (TextView)findViewById(rps);
        computerChoice = (TextView)findViewById(comprps);
        result = (TextView)findViewById(resultBox);
        rockButton = (Button)findViewById(rockbtn);
        paperButton = (Button)findViewById(R.id.paperbtn);
        scissorButton = (Button)findViewById(R.id.scissorbtn);
    }

    public void onRockClick(View rockButton) {
        TextView rock = (TextView)findViewById(R.id.rps);
        rock.setText("You chose: \n Rock");
        computerChoice();
    }

    public void onPaperClick(View paperButton) {
        TextView paper = (TextView)findViewById(R.id.rps);
        paper.setText("You chose: \nPaper");
        computerChoice();
    }

    public void onScissorClick(View scissorButton){
        TextView paper = (TextView)findViewById(R.id.rps);
        paper.setText("You chose: \n Scissors");
        computerChoice();
    }

    public void computerChoice(){
        Computer computer = new Computer();
        computer += computer.getMove();
    }

    }
