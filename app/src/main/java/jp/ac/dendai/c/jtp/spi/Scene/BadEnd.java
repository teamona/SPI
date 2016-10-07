package jp.ac.dendai.c.jtp.spi.Scene;

import jp.ac.dendai.c.jtp.spi.R;

public class BadEnd extends AbstractScene {
    @Override
    public GameState next(int no) {
        return null;
    }
    @Override
    public int getImageId() {
        return R.drawable.badend;
    }
    @Override
    public int getDateId(){
        return R.string.datebadend;
    }
    @Override
    public int getMessageId() {
        return R.array.messagebadend;
    }
    @Override
    public int getQuestionId() {
        return 0;
    }
}