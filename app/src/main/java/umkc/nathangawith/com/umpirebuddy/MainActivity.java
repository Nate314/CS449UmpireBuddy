package umkc.nathangawith.com.umpirebuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    public void btnClearClick(View view) {
        this.cntBall = 0;
        this.cntStrike = 0;
        this.updateLabels();
    }
}
