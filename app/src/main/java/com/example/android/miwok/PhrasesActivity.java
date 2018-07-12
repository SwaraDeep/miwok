package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("minto wuksus", "Where are you going?"));
        words.add(new com.example.android.miwok.Word("tinnә oyaase'nә", "What is your name?"));
        words.add(new com.example.android.miwok.Word("oyaaset...", "My name is..."));
        words.add(new com.example.android.miwok.Word("michәksәs?", "How are you feeling?"));
        words.add(new com.example.android.miwok.Word("kuchi achit", "I'm feeling good."));
        words.add(new com.example.android.miwok.Word("әәnәs'aa?", "Are you coming?"));
        words.add(new com.example.android.miwok.Word("hәә’ әәnәm", "Yes, I'm coming."));
        words.add(new com.example.android.miwok.Word("әәnәm", "I'm coming."));
        words.add(new com.example.android.miwok.Word("yoowutis", "Let's go."));
        words.add(new com.example.android.miwok.Word("әnni'nem", "Come here."));

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
