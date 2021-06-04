package sg.edu.rp.c346.id20043679.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
//    String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        fruits = new String[3];
        fruits = new ArrayList<String>();

        tv = findViewById(R.id.textView);

//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        String text = "Fruits\n";
        text += "=====\n";

//        tv.setText(fruits[0]);
//
//        for (int i=0; i<fruits.length; i++ ){
//            text += fruits[i];
//            text += "\n";
//        }

        String theFruit = "";
        theFruit = fruits.get(1);

        fruits.remove(0);
        fruits.set(fruits.size()-1,"dragon fruits");

        for (int i=0; i<fruits.size(); i++ ){
            text += fruits.get(i);
            text += "\n";
        }

        tv.setText(text);

    }



}