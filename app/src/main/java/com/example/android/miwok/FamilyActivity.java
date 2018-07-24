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

        words.add(new com.example.android.miwok.Word("әpә", "father", R.drawable.family_father));
        words.add(new com.example.android.miwok.Word("әṭa", "mother", R.drawable.family_mother));
        words.add(new com.example.android.miwok.Word("angsi", "son", R.drawable.family_son));
        words.add(new com.example.android.miwok.Word("tune", "daughter", R.drawable.family_daughter));
        words.add(new com.example.android.miwok.Word("taachi", "older brother", R.drawable.family_older_brother));
        words.add(new com.example.android.miwok.Word("chalitti", "younger brother", R.drawable.family_younger_brother));
        words.add(new com.example.android.miwok.Word("teṭe", "older sister", R.drawable.family_older_sister));
        words.add(new com.example.android.miwok.Word("kolliti", "younger sister", R.drawable.family_younger_sister));
        words.add(new com.example.android.miwok.Word("ama", "grandmother", R.drawable.family_grandmother));
        words.add(new com.example.android.miwok.Word("paapa", "grandfather", R.drawable.family_grandfather));

        //int index;

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
       /*for(index = 0; index < words.size(); index++){
            TextView view = new TextView(this);
            view.setText(words.get(index));
            rootView.addView(view);
        }*/

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
