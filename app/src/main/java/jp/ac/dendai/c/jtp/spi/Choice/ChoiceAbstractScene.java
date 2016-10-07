package jp.ac.dendai.c.jtp.spi.Choice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import jp.ac.dendai.c.jtp.spi.ChoiceHandler;
import jp.ac.dendai.c.jtp.spi.R;

/**
 * Created by teamona on 2016/10/07.
 */

public abstract class ChoiceAbstractScene implements ChoiceScene {
    private int index;
    private ChoiceHandler chandler;
    private static Activity activity;

    protected int size() {
        return getMessage().length;
    }

    public static void setActivity(Activity _activity) {
        activity = _activity;
    }

    @Override
    public void onClick(View v) {
        Button button1 = (Button) activity.findViewById(R.id.choice_button);
        Button button2 = (Button) activity.findViewById(R.id.choice_button2);
        Button button3 = (Button) activity.findViewById(R.id.choice_button3);
        Button button4 = (Button) activity.findViewById(R.id.choice_button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button bellowButton1 = (Button) activity.findViewById(R.id.belowMenue1);
        Button bellowButton2 = (Button) activity.findViewById(R.id.belowMenue2);
        Button bellowButton3 = (Button) activity.findViewById(R.id.belowMenue3);
        Button bellowButton4 = (Button) activity.findViewById(R.id.belowMenue4);
        Button bellowButton5 = (Button) activity.findViewById(R.id.belowMenue5);


        bellowButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bellowButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bellowButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bellowButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });bellowButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }



    @Override
    public void start(ChoiceHandler h) {
        chandler = h;
        index = 0;
        activity.setContentView(R.layout.activity_choice);
    }

    protected String[] getMessage() {
        return getStringArrayById(getMessageId());
    }

    protected String[] getQuestion() {
        return getStringArrayById(getQuestionId());
    }

    protected String[] getStringArrayById(int id) {
        return activity.getResources().getStringArray(id);
    }

}
