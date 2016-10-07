package jp.ac.dendai.c.jtp.spi.Scene;


import jp.ac.dendai.c.jtp.spi.R;

public class First extends AbstractScene {
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
    public GameState next(int no) {
        return GameState.second;
    }
    @Override
    public int getDateId() {
        return R.string.date1;
    }
}