package jp.ac.dendai.c.jtp.spi.Scene;

import jp.ac.dendai.c.jtp.spi.R;

public class Ending extends AbstractScene {
    @Override
    public int getImageId() {
        return R.drawable.ending;
    }
    @Override
    public int getMessageId() {
        return R.array.messageending;
    }
    @Override
    public int getQuestionId() {
        return 0;
    }
    @Override
    public GameState next(int no) {
        return GameState.finish;
    }
    @Override
    public int getDateId() {
        return R.string.dateending;
    }
}