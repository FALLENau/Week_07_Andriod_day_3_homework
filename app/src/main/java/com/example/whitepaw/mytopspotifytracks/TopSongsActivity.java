package com.example.whitepaw.mytopspotifytracks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        TopSongs topMovies = new TopSongs();

        ArrayList<Song> list = topMovies.getList();

        TopSongsAdapter songsAdapter = new TopSongsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }

    public void getSong(View listItem) {
        Song song = (Song) listItem.getTag();
//        Log.d(getClass().toString(), song.getTitle());
        Uri uri = Uri.parse(song.getUrl()); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
