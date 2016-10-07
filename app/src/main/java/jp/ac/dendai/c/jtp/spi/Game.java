package jp.ac.dendai.c.jtp.spi;

import jp.ac.dendai.c.jtp.spi.Choice.ChoiceScene;
import jp.ac.dendai.c.jtp.spi.Choice.Sentaku;
import jp.ac.dendai.c.jtp.spi.Scene.GameState;
import jp.ac.dendai.c.jtp.spi.Scene.Scene;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import static jp.ac.dendai.c.jtp.spi.Scene.GameState.finish;

public class Game implements Handler {
    private ActionBarActivity activity;
    private Title title;
    private Scene scene;
    private ChoiceScene cscene;
    public Game(ActionBarActivity mainActivity) {
        this.activity = mainActivity;
        title = new Title();
    }

    @Override
    public void step(Scene s) {
        scene = s;
        start();
    }


    public void start() {
        if(scene==null) {
            activity.setContentView(title.getContentView()); //activity_mainをセット
            title.init(activity,new OnStartButtonClickListener(true), new OnStartButtonClickListener(false));
        }
        else if(scene == finish.getScene()){
            activity.setContentView(R.layout.activity_choice);

            CGame cGame=new CGame(activity);

        }
        else{
            activity.setContentView(R.layout.activity_story);
            scene.start(this);
        }
    }
    class OnStartButtonClickListener implements View.OnClickListener {
        private boolean intialize;
        public OnStartButtonClickListener(boolean b) {
            intialize = b;
        }
        @Override
        public void onClick(View v) {
            if(intialize || scene==null){
                scene= jp.ac.dendai.c.jtp.spi.Scene.GameState.getInitialScene();
            }
            start();
            showToast("OK2");
        }
    }

    public void start2(){
        activity.setContentView(R.layout.activity_choice);
        scene = GameState.getInitialScene();
    }
    private void showToast(String text){
        Toast.makeText(this.activity, text, Toast.LENGTH_SHORT).show();
    }

}
