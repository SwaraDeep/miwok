package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        /*String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("Numbers activity", "Number " + words[0]);
        Log.v("Numbers activity", "Number " + words[1]);
        Log.v("Numbers activity", "Number " + words[2]);
        Log.v("Numbers activity", "Number " + words[3]);
        Log.v("Numbers activity", "Number " + words[4]);
        Log.v("Numbers activity", "Number " + words[5]);
        Log.v("Numbers activity", "Number " + words[6]);
        Log.v("Numbers activity", "Number " + words[7]);
        Log.v("Numbers activity", "Number " + words[8]);
        Log.v("Numbers activity", "Number " + words[9]);*/

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        /*Log.v("MainActivity", "Numbers" + words.get(0));
        Log.v("MainActivity", "Numbers" + words.get(1));
        Log.v("MainActivity", "Numbers" + words.get(2));
        Log.v("MainActivity", "Numbers" + words.get(3));
        Log.v("MainActivity", "Numbers" + words.get(4));
        Log.v("MainActivity", "Numbers" + words.get(5));
        Log.v("MainActivity", "Numbers" + words.get(6));
        Log.v("MainActivity", "Numbers" + words.get(7));
        Log.v("MainActivity", "Numbers" + words.get(8));
        Log.v("MainActivity", "Numbers" + words.get(9));*/

        //int index;

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
       /*for(index = 0; index < words.size(); index++){
            TextView view = new TextView(this);
            view.setText(words.get(index));
            rootView.addView(view);
        }*/

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
