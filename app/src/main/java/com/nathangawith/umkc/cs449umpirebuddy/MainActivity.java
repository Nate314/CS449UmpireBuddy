package com.nathangawith.umkc.cs449umpirebuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private enum Buttons { INIT, BALL, STRIKE, RESET }

    // counts
    private TextView lblBall;
    private TextView lblStrike;
    private Button btnBall;
    private Button btnStrike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.lblBall = findViewById(R.id.lblBall);
        this.lblStrike = findViewById(R.id.lblStrike);
        this.btnStrike = findViewById(R.id.btnStrike);
        this.btnBall = findViewById(R.id.btnBall);
        this.updateLabels(Buttons.INIT);
    }

    // update labels
    private void updateLabels(Buttons btn) {
        boolean strikeLimit = State.cntStrikes == 3;
        boolean ballLimit = State.cntBalls == 4;
        // show dialog if Out or Walk has been reached
        if (strikeLimit && btn == Buttons.STRIKE)
            new MyDialog("Out!").show(getSupportFragmentManager(), null);
        if (ballLimit && btn == Buttons.BALL)
            new MyDialog("Walk!").show(getSupportFragmentManager(), null);
        // update labels
        this.lblBall.setText("Balls: " + State.cntBalls);
        this.lblStrike.setText("Strikes: " + State.cntStrikes);
        // enable or disable buttons
        this.btnStrike.setEnabled(!strikeLimit);
        this.btnBall.setEnabled(!ballLimit);
    }

    // ball button click event
    public void btnBallClick(View view) {
        State.cntBalls++;
        this.updateLabels(Buttons.BALL);
    }

    // strike button click event
    public void btnStrikeClick(View view) {
        State.cntStrikes++;
        this.updateLabels(Buttons.STRIKE);
    }

    // clear button click event
    public void btnResetClick(View view) {
        State.cntBalls = 0;
        State.cntStrikes = 0;
        this.updateLabels(Buttons.RESET);
    }

    // about button click event
    public void btnAboutClick(View view) {
        System.out.println("testing . . .");
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
        System.out.println(AboutActivity.class);
    }

    // exit button click event
    public void btnExitClick(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
