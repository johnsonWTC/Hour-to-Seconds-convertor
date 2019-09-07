package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;
    String jam;
    StringBuilder text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.input);
        textView = (TextView)findViewById(R.id.result);
        button = (Button)findViewById(R.id.convertor) ;



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jam = editText.getText().toString();
                int number = Integer.parseInt(jam) * 60;
                textView.setText(jam +" minutes is " + number + " seconds");
                editText.setText("");
            }

        };
        button.setOnClickListener(onClickListener);

    }



//    public   void theSavingFuction(){
//
//        String fileName = "saved" + ".txt";
//
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(fileName);
//
//      //      jam = playerStatistics;
//            fw.write(jam);
//
//
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//    }



//    private void writeToFile(String jam) {
//        try {
//            File file = new File(Environment.getExternalStorageDirectory() + "/saved.txt");
//
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter writer = new FileWriter(file);
//            writer.append(jam);
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//        }
//    }


//    public void theReader(){
//
//        File sdcard = Environment.getExternalStorageDirectory();
//
//
//
////Get the text file
//        File file = new File(sdcard,"saved.txt");
//
////Read text from file
//         text = new StringBuilder();
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                text.append(line);
//                text.append('\n');
//            }
//            br.close();
//        }
//        catch (IOException e) {
//            //You'll need to add proper error handling here
//        }
//    }
}
