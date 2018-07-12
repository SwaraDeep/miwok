package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("lutti", "one"));
        words.add(new com.example.android.miwok.Word("otiiko", "two"));
        words.add(new com.example.android.miwok.Word("tolookosu", "three"));
        words.add(new com.example.android.miwok.Word("oyyisa", "four"));
        words.add(new com.example.android.miwok.Word("massokka", "five"));
        words.add(new com.example.android.miwok.Word("temmokka", "six"));
        words.add(new com.example.android.miwok.Word("kenekaku", "seven"));
        words.add(new com.example.android.miwok.Word("kawinta", "eight"));
        words.add(new com.example.android.miwok.Word("wo’e", "nine"));
        words.add(new com.example.android.miwok.Word("na’aacha", "ten"));

        //int index;

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
       /*for(index = 0; index < words.size(); index++){
            TextView view = new TextView(this);
            view.setText(words.get(index));
            rootView.addView(view);
        }*/

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}