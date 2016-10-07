package jp.ac.dendai.c.jtp.spi.Scene;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.DialogInterface.OnClickListener;
import jp.ac.dendai.c.jtp.spi.Handler;
import jp.ac.dendai.c.jtp.spi.R;

public abstract class AbstractScene implements Scene {
    private int index;
    private Handler handler;
    private static Activity activity;

    protected int size() {
        return getMessage().length;
    }

    public static void setActivity(Activity _activity) {
        activity = _activity;
    }

    @Override
        public void onClick(View v) {
        index++;
        if (index < size()) {
           writeMessage();
        } else {
            if (getQuestionId() != 0) {
                ImageView imageView = (ImageView) activity.findViewById(R.id.imageView1);
                imageView.setOnClickListener(null);
                askQuestion();
            } else {
                GameState n = next(0);
                Scene scene = n == null ? null : n.getScene();
                handler.step(scene);
            }
        }
    }

    private void askQuestion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setPositiveButton(getQuestion()[0], new Answer(0));
        builder.setNegativeButton(getQuestion()[1], new Answer(1));
        AlertDialog alert = builder.create();
        alert.show();
    }

    private class Answer implements OnClickListener {
        private int no;

        public Answer(int i) {
            no = i;
        }

        @Override
        public void onClick(DialogInterface dialog, int which) {
            handler.step(next(no).getScene());
        }
    }

    @Override
    public void start(Handler h) {
        handler = h;
        index = 0;
        activity.setContentView(R.layout.activity_story);
        ImageView imageView = (ImageView) activity.findViewById(R.id.imageView1);
        imageView.setOnClickListener(this);
        imageView.setImageResource(getImageId());
        writeMessage();
    }


    private void writeMessage() {
        TextView textView = (TextView) activity.findViewById(R.id.textarea);
        textView.setText(getMessage()[index]);
        TextView textdate = (TextView) activity.findViewById(R.id.textdate);
        textdate.setText(activity.getResources().getString(getDateId()));

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