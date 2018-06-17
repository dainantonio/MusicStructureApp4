package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        // Create an ArrayList of Songs;
        ArrayList<String> songs = new ArrayList<>();
        songs.add("black is beautiful");
        songs.add("christina");
        songs.add("country bwoy");
        songs.add("ghetto paradise");
        songs.add("I know love");
        songs.add("legend");
        songs.add("lonliness");
        songs.add("selassie children");
        songs.add("skankin sweet");
        songs.add("spanish town rockin' ");
        songs.add("tell me");

        // Verify the contents of the array by printing out each array element to the logs
        Log.v("GenreActivity", "song at index 0: " + songs.get(0));
        Log.v("GenreActivity", "song at index 1: " + songs.get(1));
        Log.v("GenreActivity", "song at index 2: " + songs.get(2));
        Log.v("GenreActivity", "song at index 3: " + songs.get(3));
        Log.v("GenreActivity", "song at index 4: " + songs.get(4));
        Log.v("GenreActivity", "song at index 5: " + songs.get(5));
        Log.v("GenreActivity", "song at index 6: " + songs.get(6));
        Log.v("GenreActivity", "song at index 7: " + songs.get(7));
        Log.v("GenreActivity", "song at index 8: " + songs.get(8));
        Log.v("GenreActivity", "song at index 9: " + songs.get(9));
        Log.v("GenreActivity", "song at index 10: " + songs.get(10));

        LinearLayout genreView = findViewById(R.id.genreView);
        TextView songlistView = new TextView(this);
        songlistView.setText(songs.get (0));
        genreView.addView(songlistView);

    }
}
