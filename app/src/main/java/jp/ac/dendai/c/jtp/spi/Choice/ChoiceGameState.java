package jp.ac.dendai.c.jtp.spi.Choice;

/**
 * Created by teamona on 2016/10/07.
 */

public enum ChoiceGameState {
    sentaku(new Sentaku());

    private  ChoiceScene cscene;
    public ChoiceScene getScene(){
        return cscene;
    }
    private ChoiceGameState(ChoiceScene s){
        cscene = s;
    }
    public static ChoiceScene getInitialScene(){
        return sentaku.getScene();
    }
}
