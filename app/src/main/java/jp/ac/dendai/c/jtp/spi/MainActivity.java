package jp.ac.dendai.c.jtp.spi;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import jp.ac.dendai.c.jtp.spi.Scene.AbstractScene;

public class MainActivity extends ActionBarActivity {

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CSVParser csvParser = new CSVParser(this,"language.csv");
        csvParser.parse();
        csvParser.getqArrayList();


        AbstractScene.setActivity(this);
        setContentView(R.layout.activity_main);
        game = new Game(this);
        game.start();
        showToast("OK");


    }
    private void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
