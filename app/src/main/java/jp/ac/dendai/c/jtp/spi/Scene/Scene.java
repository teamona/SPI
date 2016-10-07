package jp.ac.dendai.c.jtp.spi.Scene;


import android.view.View;
import jp.ac.dendai.c.jtp.spi.Handler;

public interface Scene extends View.OnClickListener {
    GameState next(int no);
    void start(Handler hand);
    int getMessageId();
    int getImageId();
    int getQuestionId();
    int getDateId();
}