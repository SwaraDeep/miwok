package com.example.android.miwok;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer player;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("lutti", "one", R.drawable.number_one, R.raw.number_one));
        words.add(new com.example.android.miwok.Word("otiiko", "two", R.drawable.number_two, R.raw.number_two));
        words.add(new com.example.android.miwok.Word("tolookosu", "three", R.drawable.number_three, R.raw.number_three));
        words.add(new com.example.android.miwok.Word("oyyisa", "four", R.drawable.number_four, R.raw.number_four));
        words.add(new com.example.android.miwok.Word("massokka", "five", R.drawable.number_five, R.raw.number_five));
        words.add(new com.example.android.miwok.Word("temmokka", "six", R.drawable.number_six, R.raw.number_six));
        words.add(new com.example.android.miwok.Word("kenekaku", "seven", R.drawable.number_seven, R.raw.number_seven));
        words.add(new com.example.android.miwok.Word("kawinta", "eight", R.drawable.number_eight, R.raw.number_eight));
        words.add(new com.example.android.miwok.Word("wo’e", "nine", R.drawable.number_nine, R.raw.number_nine));
        words.add(new com.example.android.miwok.Word("na’aacha", "ten", R.drawable.number_ten, R.raw.number_ten));

        //int index;

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.list);
       /*for(index = 0; index < words.size(); index++){
            TextView view = new TextView(this);
            view.setText(words.get(index));
            rootView.addView(view);
        }*/

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);

                releaseMediaPlayer();

                player = MediaPlayer.create(NumbersActivity.this, word.getmAudioResId());
                player.start();
                player.setOnCompletionListener(mCompletionListener);


            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    AudioManager.OnAudioFocusChangeListener af = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                player.pause();
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                player.start();
            }
        }
    };

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (player != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            player.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            player = null;
        }
    }
}