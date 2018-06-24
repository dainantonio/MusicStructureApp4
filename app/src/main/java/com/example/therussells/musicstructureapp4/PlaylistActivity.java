package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        // Create an ArrayList of Songs;
        ArrayList<Songs> song = new ArrayList<>();
        song.add(new Songs("Black is beautiful"));
        song.add(new Songs("Christina"));
        song.add(new Songs("Country Bwoy"));
        song.add(new Songs("Ghetto Paradise"));
        song.add(new Songs("I know love"));
        song.add(new Songs("Legend"));
        song.add(new Songs("Lonliness"));
        song.add(new Songs("Selassie Children"));
        song.add(new Songs("Skankin Sweet"));
        song.add(new Songs("Spanish Town Rockin' "));
        song.add(new Songs("Tell me"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item_xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongsAdapter adapter= new SongsAdapter(this, song);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_playlist.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each song name in the list of songs.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        }

    }
