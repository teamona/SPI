package jp.ac.dendai.c.jtp.spi;


import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSVParser {

    private Context context;
    private String file;
    private ArrayList<Question> qArrayList;

    public CSVParser(Context context, String file){
        this.file = file;
        this.context = context;
    }

    public void parse() {
        // AssetManagerの呼び出し
        AssetManager assetManager = context.getResources().getAssets();
        try {
            // CSVファイルの読み込み
            InputStream is = assetManager.open(file);
            InputStreamReader inputStreamReader = new InputStreamReader(is);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line = "";

            while ((line = bufferReader.readLine()) != null) {

                String[] word = line.split(",",0);
                Question question = new Question(word[0],word[1],word[2],word[3],word[4],word[5],word[6],word[7],word[8],word[9],word[10]);
                qArrayList.add(question);
            }

            bufferReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Question> getqArrayList(){
        return qArrayList;
    }
}
