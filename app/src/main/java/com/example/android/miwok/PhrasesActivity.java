package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("minto wuksus", "Where are you going?", R.raw.phrase_where_are_you_going));
        words.add(new com.example.android.miwok.Word("tinnә oyaase'nә", "What is your name?", R.raw.phrase_what_is_your_name));
        words.add(new com.example.android.miwok.Word("oyaaset...", "My name is...", R.raw.phrase_my_name_is));
        words.add(new com.example.android.miwok.Word("michәksәs?", "How are you feeling?", R.raw.phrase_how_are_you_feeling));
        words.add(new com.example.android.miwok.Word("kuchi achit", "I'm feeling good.", R.raw.phrase_im_feeling_good));
        words.add(new com.example.android.miwok.Word("әәnәs'aa?", "Are you coming?", R.raw.phrase_are_you_coming));
        words.add(new com.example.android.miwok.Word("hәә’ әәnәm", "Yes, I'm coming.", R.raw.phrase_yes_im_coming));
        words.add(new com.example.android.miwok.Word("әәnәm", "I'm coming.", R.raw.phrase_im_coming));
        words.add(new com.example.android.miwok.Word("yoowutis", "Let's go.", R.raw.phrase_lets_go));
        words.add(new com.example.android.miwok.Word("әnni'nem", "Come here.", R.raw.phrase_come_here));

        //int index;

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
       /*for(index = 0; index < words.size(); index++){
            TextView view = new TextView(this);
            view.setText(words.get(index));
            rootView.addView(view);
        }*/

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);
                MediaPlayer player = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResId());
                player.start();
            }
        });
    }
}
