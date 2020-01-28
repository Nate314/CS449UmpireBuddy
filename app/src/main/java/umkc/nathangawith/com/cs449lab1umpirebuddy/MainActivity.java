package umkc.nathangawith.com.cs449lab1umpirebuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // counts
    private int cntBall = 0;
    private int cntStrike = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // update labels
    private void updateLabels() {
        TextView lblBall = (TextView) findViewById(R.id.lblBall);
        lblBall.setText("Balls: " + this.cntBall);
        TextView lblStrike = (TextView) findViewById(R.id.lblStrike);
        lblStrike.setText("Strikes: " + this.cntStrike);
    }

    // ball button click event
    public void btnBallClick(View view) {
        this.cntBall++;
        this.updateLabels();
    }

    // strike button click event
    public void btnStrikeClick(View view) {
        this.cntStrike++;
        this.updateLabels();
    }

    // clear button click event
    public void btnResetClick(View view) {
        this.cntBall = 0;
        this.cntStrike = 0;
        this.updateLabels();
    }

    // exit button click event
    public void btnExitClick(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
