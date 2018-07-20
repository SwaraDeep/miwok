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

        words.add(new com.example.android.miwok.Word("lutti", "one", R.drawable.number_one));
        words.add(new com.example.android.miwok.Word("otiiko", "two", R.drawable.number_two));
        words.add(new com.example.android.miwok.Word("tolookosu", "three", R.drawable.number_three));
        words.add(new com.example.android.miwok.Word("oyyisa", "four", R.drawable.number_four));
        words.add(new com.example.android.miwok.Word("massokka", "five", R.drawable.number_five));
        words.add(new com.example.android.miwok.Word("temmokka", "six", R.drawable.number_six));
        words.add(new com.example.android.miwok.Word("kenekaku", "seven", R.drawable.number_seven));
        words.add(new com.example.android.miwok.Word("kawinta", "eight", R.drawable.number_eight));
        words.add(new com.example.android.miwok.Word("wo’e", "nine", R.drawable.number_nine));
        words.add(new com.example.android.miwok.Word("na’aacha", "ten", R.drawable.number_ten));

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