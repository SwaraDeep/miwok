package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("әpә", "father"));
        words.add(new com.example.android.miwok.Word("әṭa", "mother"));
        words.add(new com.example.android.miwok.Word("angsi", "son"));
        words.add(new com.example.android.miwok.Word("tune", "daughter"));
        words.add(new com.example.android.miwok.Word("taachi", "older brother"));
        words.add(new com.example.android.miwok.Word("chalitti", "younger brother"));
        words.add(new com.example.android.miwok.Word("teṭe", "older sister"));
        words.add(new com.example.android.miwok.Word("kolliti", "younger sister"));
        words.add(new com.example.android.miwok.Word("ama", "grandmother"));
        words.add(new com.example.android.miwok.Word("paapa", "grandfather"));

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
