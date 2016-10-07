package jp.ac.dendai.c.jtp.spi;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class QActivity  extends ActionBarActivity{

    int num;
    ArrayList<Question> questionArrayList;
    public QActivity(){

    }

    public QActivity(int num, ArrayList<Question> questionArrayList){
        this.num=num;
        this.questionArrayList = questionArrayList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q);

        TextView text1 = (TextView) findViewById(R.id.QText);



    }



}
