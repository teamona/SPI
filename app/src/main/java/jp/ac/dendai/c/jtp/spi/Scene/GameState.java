package jp.ac.dendai.c.jtp.spi.Scene;

public enum GameState {
    first(new First()),second(new Second()),
    ending(new Ending()), badend(new BadEnd()),finish(new Ending());
    private Scene scene;
    public Scene getScene(){
        return scene;
    }
    private GameState(Scene s){
        scene = s;
    }
    public static Scene getInitialScene(){
        return first.getScene();
    }
}
