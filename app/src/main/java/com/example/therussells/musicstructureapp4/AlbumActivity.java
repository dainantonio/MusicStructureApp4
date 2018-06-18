package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);


        // Create an ArrayList of Albums;
        ArrayList<String> album = new ArrayList<>();
        album.add("Chronology");


        // Find the album view so we can add child views (list of albums) to it
        LinearLayout albumActivity = findViewById(R.id.albumId);

        // variable to keep track of the current index position
        // Will keep looping until the end of the list at index 9. as long as the index is less than the leght of the list
        // Increment the index variable by 1
        for (int index = 0; index < album.size(); index++) {
            TextView albumView = new TextView(this);

            // Set the text to be song at the current index
            albumView.setText(album.get(index));

            // Add this TextView as another child to the favorite song view of this layout
            albumActivity.addView(albumView);
        }

    }
}