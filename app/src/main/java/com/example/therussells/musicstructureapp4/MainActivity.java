package com.example.therussells.musicstructureapp4;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // This will locate the favorite songs activity by the view id
        TextView favorite = findViewById(R.id.favoritelist);

        //the favorite textview will have a OnClicklistener on it
        favorite.setOnClickListener (new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open genreactivity
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteSongsActivity.class);
                // Start the new activity
                startActivity(favoriteIntent);
            }
        });

        // This will locate the genre activity by the view id
        TextView genre = findViewById(R.id.genre);

        //the genre textview will have a OnClicklistener on it
        genre.setOnClickListener (new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open genreactivity
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                // Start the new activity
                startActivity(genreIntent);
            }
        });

        // This will locate the artist activity by the view id
        TextView artist = findViewById(R.id.artist);

        //the artist textview will have a OnClicklistener on it
        artist.setOnClickListener(new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open artistactivity
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // This will locate the genre activity by the view id
        TextView album = findViewById(R.id.album);

        //the album textview will have a OnClicklistener on it
        album.setOnClickListener(new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open albumactivity
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // This will locate the playlist activity by the view id
        TextView playlist = findViewById(R.id.playlist);

        //the playlist textview will have a OnClicklistener on it
        playlist.setOnClickListener(new View.OnClickListener(){

            //Method onClick is called when user clicks the TextView and code executed
            @Override
            public void onClick(View v) {

                // Explicit intent that calls to open playlistactivity
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });
    }}

