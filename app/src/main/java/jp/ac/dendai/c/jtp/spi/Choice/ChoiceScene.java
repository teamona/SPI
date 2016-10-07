package jp.ac.dendai.c.jtp.spi.Choice;

import android.app.SearchManager;
import android.view.View;

import jp.ac.dendai.c.jtp.spi.ChoiceHandler;

/**
 * Created by teamona on 2016/10/07.
 */

public interface ChoiceScene extends View.OnClickListener{
    ChoiceGameState next(int no);
    void start(ChoiceHandler hand);
    int getMessageId();
    int getImageId();
    int getQuestionId();
    int getDateId();
}
