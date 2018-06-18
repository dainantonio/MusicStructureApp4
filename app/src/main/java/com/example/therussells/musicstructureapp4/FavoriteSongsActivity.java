package com.example.therussells.musicstructureapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favoritesongs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
        }

    }
