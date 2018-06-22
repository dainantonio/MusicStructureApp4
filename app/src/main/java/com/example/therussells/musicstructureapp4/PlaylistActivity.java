package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        // Create an ArrayList of Songs;
        ArrayList<Songs> song = new ArrayList<>();
        song.add(new Songs("Black is beautiful", "Chronix"));
        song.add(new Songs("Christina", "Chronix"));
        song.add(new Songs("Country Bwoy", "Chronix"));
        song.add(new Songs("Ghetto Paradise", "Chronix"));
        song.add(new Songs("I know love", "Chronix"));
        song.add(new Songs("Legend", "Chronix"));
        song.add(new Songs("Lonliness", "Chronix"));
        song.add(new Songs("Selassie Children", "Chronix"));
        song.add(new Songs("Skankin Sweet", "Chronix"));
        song.add(new Songs("Spanish Town Rockin' ", "Chronix"));
        song.add(new Songs("Tell me", "Chronix"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item_xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongsAdapter adapter= new SongsAdapter(this, song);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        }

    }
