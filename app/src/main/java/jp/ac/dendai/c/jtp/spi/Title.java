package jp.ac.dendai.c.jtp.spi;


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Title {
    public void init(ActionBarActivity activity, View.OnClickListener onStartButtonClickListener, View.OnClickListener onContinueButtonClickListener) {
        Button startButton = (Button) activity.findViewById(R.id.startButton);
        startButton.setOnClickListener(onStartButtonClickListener);
    }
    public int getContentView() {
        return R.layout.activity_main;
    }
}
