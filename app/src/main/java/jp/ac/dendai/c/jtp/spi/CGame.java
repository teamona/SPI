package jp.ac.dendai.c.jtp.spi;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import jp.ac.dendai.c.jtp.spi.Choice.ChoiceGameState;
import jp.ac.dendai.c.jtp.spi.Choice.ChoiceScene;

/**
 * Created by teamona on 2016/10/07.
 */

public class CGame implements ChoiceHandler {
    private ActionBarActivity activity;
    private Title title;
    private ChoiceScene cscene;
    public CGame(ActionBarActivity mainActivity) {
        this.activity = mainActivity;
        title = new Title();
    }

    @Override
    public void step(ChoiceScene s) {
        cscene = s;
        start();
    }


    public void start() {
        if(cscene==null) {
            activity.setContentView(R.layout.activity_choice); //activity_choiceをセット

        }
        else{
            activity.setContentView(R.layout.activity_story);
            cscene.start(this);
        }
    }
    class OnStartButtonClickListener implements View.OnClickListener {
        private boolean intialize;
        public OnStartButtonClickListener(boolean b) {
            intialize = b;
        }
        @Override
        public void onClick(View v) {
            if(intialize || cscene==null){
                cscene= jp.ac.dendai.c.jtp.spi.Choice.ChoiceGameState.getInitialScene();
            }
            start();
            showToast("OK2");
        }
    }

    public void start2(){
        activity.setContentView(R.layout.activity_choice);
        cscene = ChoiceGameState.getInitialScene();
    }
    private void showToast(String text){
        Toast.makeText(this.activity, text, Toast.LENGTH_SHORT).show();
    }
}
