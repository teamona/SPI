package jp.ac.dendai.c.jtp.spi;

public class Question {
    String unit;
    String id;
    String difficulty;
    String question;
    String time;
    String state101;
    String answer101;
    String select101;
    String select102;
    String select103;
    String select104;




    public Question(){
    }

    public Question( String unit,String id,String difficulty,String question,String time,String state101,String answer101,String select101,String select102,String select103,String select104){
        this.unit =unit;
        this.id = id;
        this.difficulty=difficulty;
        this.question=question;
        this.time=time;
        this.state101=state101;
        this.answer101=answer101;
        this.select101=select101;
        this.select102=select102;
        this.select103=select103;
        this.select104=select104;
    }
}
