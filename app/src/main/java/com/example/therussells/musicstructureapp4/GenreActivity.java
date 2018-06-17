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

        // Find the genre view so we can add child views (list of songs) to it
        LinearLayout genreView = findViewById(R.id.genreView);

        // variable to keep track of the current index position
        int index = 0;

        // Will keep looping until the end of the list at index 9. as long as the index is less than the leght of the list
        while (index < songs.size()) {
            TextView songlistView = new TextView(this);

            // Set the text to be song at the current index
            songlistView.setText(songs.get(index));

            // Add this TextView as another child to the genre view of this layout
            genreView.addView(songlistView);

            // Increment the index variable by 1
            index++;
        }

    }
}
