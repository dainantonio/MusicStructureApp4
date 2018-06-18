package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        // Create an ArrayList of Genres;
        ArrayList<String> musictype = new ArrayList<>();
        musictype.add("Alternative");
        musictype.add("Blues");
        musictype.add("Children Music");
        musictype.add("Christian");
        musictype.add("Classical");
        musictype.add("Country");
        musictype.add("Dance");
        musictype.add("Electronic");
        musictype.add("Hip-Hop");
        musictype.add("Jazz");
        musictype.add("R&B/Soul");
        musictype.add("Reggae");
        musictype.add("Rock");


        // Find the genre view so we can add child views (list of songs) to it
        LinearLayout genreActivity = findViewById(R.id.genreId);

        // variable to keep track of the current index position
        // Will keep looping until the end of the list at index 12. as long as the index is less than the leght of the list
        // Increment the index variable by 1
        for (int index = 0; index < musictype.size(); index++){
            TextView genrelistView = new TextView(this);

            // Set the text to be song at the current index
            genrelistView.setText(musictype.get(index));

            // Add this TextView as another child to the genre view of this layout
            genreActivity.addView(genrelistView);

        }

    }
}
