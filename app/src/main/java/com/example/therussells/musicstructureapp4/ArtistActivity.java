package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Create an ArrayList of Artists;
        ArrayList<String> artistName = new ArrayList<>();
        artistName.add("Chronix");

        // Find the genre view so we can add child views (list of artist) to it
        LinearLayout artistActivity = findViewById(R.id.artistId);

        // variable to keep track of the current index position
        // Will keep looping until the end of the list, as long as the index is less than the length of the list
        // Increment the index variable by 1
        for (int index = 0; index < artistName.size(); index++) {

            TextView artistView = new TextView(this);

            // Set the text to be artist name at the current index
            artistView.setText(artistName.get(index));

            // Add this TextView as another child to the artist name view of this layout
            artistActivity.addView(artistView);


        }

    }

}