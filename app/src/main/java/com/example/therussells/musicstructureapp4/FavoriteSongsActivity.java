package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FavoriteSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_songs);


        // Create an ArrayList of Songs;
        ArrayList<String> favoritesongs = new ArrayList<>();
        favoritesongs.add("Black is beautiful");
        favoritesongs.add("Christina");
        favoritesongs.add("Country Bwoy");
        favoritesongs.add("Ghetto Paradise");
        favoritesongs.add("I know love");
        favoritesongs.add("Legend");
        favoritesongs.add("Lonliness");
        favoritesongs.add("Selassie Children");
        favoritesongs.add("Skankin Sweet");
        favoritesongs.add("Spanish Town Rockin' ");
        favoritesongs.add("Tell me");

        // Find the favorite song view so we can add child views (list of songs) to it
        LinearLayout favoriteActivity = findViewById(R.id.favoriteId);

        // variable to keep track of the current index position
        // Will keep looping until the end of the list at index 9. as long as the index is less than the leght of the list
        // Increment the index variable by 1
        for (int index = 0; index < favoritesongs.size(); index++) {
            TextView favoriteListView = new TextView(this);

            // Set the text to be song at the current index
            favoriteListView.setText(favoritesongs.get(index));

            // Add this TextView as another child to the favorite song view of this layout
            favoriteActivity.addView(favoriteListView);
        }

    }
}