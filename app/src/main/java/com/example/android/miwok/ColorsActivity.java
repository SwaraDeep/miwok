package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("weṭeṭṭi", "red", R.drawable.color_red, R.raw.color_red));
        words.add(new com.example.android.miwok.Word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        words.add(new com.example.android.miwok.Word("ṭakaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        words.add(new com.example.android.miwok.Word("ṭopoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        words.add(new com.example.android.miwok.Word("kululli", "black", R.drawable.color_black, R.raw.color_black));
        words.add(new com.example.android.miwok.Word("kelelli", "white", R.drawable.color_white, R.raw.color_white));
        words.add(new com.example.android.miwok.Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new com.example.android.miwok.Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);
                MediaPlayer player = MediaPlayer.create(ColorsActivity.this, word.getmAudioResId());
                player.start();

                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

    }
}
