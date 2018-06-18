package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        // Create an ArrayList of Songs;
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Black is beautiful");
        playlist.add("Christina");
        playlist.add("Country Bwoy");
        playlist.add("Ghetto Paradise");
        playlist.add("I know love");
        playlist.add("Legend");
        playlist.add("Lonliness");
        playlist.add("Selassie Children");
        playlist.add("Skankin Sweet");
        playlist.add("Spanish Town Rockin' ");
        playlist.add("Tell me");

        // Find the playlist so we can add child views (list of songs) to it
        LinearLayout playlistActivity = findViewById(R.id.playlistId);

        // variable to keep track of the current index position
        // Will keep looping until the end of the list at index 9. as long as the index is less than the leght of the list
        // Increment the index variable by 1
        for (int index = 0; index < playlist.size(); index++) {
            TextView playlistView = new TextView(this);

            // Set the text to be song at the current index
            playlistView.setText(playlist.get(index));

            // Add this TextView as another child to the favorite song view of this layout
            playlistActivity.addView(playlistView);
        }

    }
}