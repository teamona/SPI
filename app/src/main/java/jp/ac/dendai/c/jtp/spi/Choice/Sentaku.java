package jp.ac.dendai.c.jtp.spi.Choice;


import jp.ac.dendai.c.jtp.spi.R;

/**
 * Created by teamona on 2016/10/07.
 */

public class Sentaku extends ChoiceAbstractScene{

    @Override
    public int getImageId() {
        return R.drawable.first;
    }
    @Override
    public int getMessageId() {
        return R.array.message1;
    }
    @Override
    public int getQuestionId() {
        return 0;
    }
    @Override
    public ChoiceGameState next(int no) {
        return null;
    }
    @Override
    public int getDateId() {
        return R.string.date1;
    }

}
