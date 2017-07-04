package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static behaviours.Moves.PAPER;
import static behaviours.Moves.ROCK;
import static behaviours.Moves.SCISSORS;
import static com.example.user.rockpaperscissors.R.id.comprps;
import static com.example.user.rockpaperscissors.R.id.resultBox;
import static com.example.user.rockpaperscissors.R.id.rockbtn;
import static com.example.user.rockpaperscissors.R.id.rps;

public class MainActivity extends AppCompatActivity {

    TextView playerMove, computerMove, result;
    Button rockButton, paperButton, scissorButton;
    Game game;
    Computer computer;

    public MainActivity(){
        this.game = new Game();
        this.computer = new Computer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerMove = (TextView)findViewById(rps);
        computerMove = (TextView)findViewById(comprps);
        result = (TextView)findViewById(resultBox);
        rockButton = (Button)findViewById(rockbtn);
        paperButton = (Button)findViewById(R.id.paperbtn);
        scissorButton = (Button)findViewById(R.id.scissorbtn);
    }

    public void onRockClick(View rockButton) {
        TextView playerMove = (TextView)findViewById(R.id.rps);
        playerMove.setText("Rock");
        computerChoice();
//        showResult();
    }

    public void onPaperClick(View paperButton) {
        TextView playerMove = (TextView)findViewById(R.id.rps);
        playerMove.setText("Paper");
        computerChoice();
//        showResult();
    }

    public void onScissorClick(View scissorButton){
        TextView playerMove = (TextView)findViewById(R.id.rps);
        playerMove.setText("Scissors");
        computerChoice();
//        showResult();
    }

    public void computerChoice() {
        TextView computerMove = (TextView)findViewById(R.id.comprps);
        computerMove.setText(this.computer.getMove().toString().toLowerCase());
    }

//    public String showResult(){
//        if(playerMove == computerMove){
//            return "It's a draw!";
//        } else if (computerMove == S){
//
//        }
//

    }

}

//        TextView result = (TextView)findViewById(R.id.resultBox);
//        result.setText(this.game.displayWinner().toString().toLowerCase());