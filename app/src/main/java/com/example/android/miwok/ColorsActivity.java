package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("weṭeṭṭi", "red", R.drawable.color_red));
        words.add(new com.example.android.miwok.Word("chokokki", "green", R.drawable.color_green));
        words.add(new com.example.android.miwok.Word("ṭakaakki", "brown", R.drawable.color_brown));
        words.add(new com.example.android.miwok.Word("ṭopoppi", "gray", R.drawable.color_gray));
        words.add(new com.example.android.miwok.Word("kululli", "black", R.drawable.color_black));
        words.add(new com.example.android.miwok.Word("kelelli", "white", R.drawable.color_white));
        words.add(new com.example.android.miwok.Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow));
        words.add(new com.example.android.miwok.Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow));
        //words.add(new com.example.android.miwok.Word("wo’e", "nine"));
        //words.add(new com.example.android.miwok.Word("na’aacha", "ten"));

        //int index;

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
       /*for(index = 0; index < words.size(); index++){
            TextView view = new TextView(this);
            view.setText(words.get(index));
            rootView.addView(view);
        }*/

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
