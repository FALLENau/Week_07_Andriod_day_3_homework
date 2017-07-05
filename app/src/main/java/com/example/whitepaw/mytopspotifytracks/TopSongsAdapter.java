package com.example.whitepaw.mytopspotifytracks;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TopSongsAdapter extends ArrayAdapter<Song> {

    public TopSongsAdapter(Context context, ArrayList<Song> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView =
                    LayoutInflater.from(getContext()).inflate(R.layout.songs_items, parent, false);
        }

        Song currentSong = getItem(position);

        //note: acquire each element.
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
//        Button url = (Button) listItemView.findViewById(R.id.url);

        //note: show each element.
        ranking.setText(currentSong.getRanking().toString());
        title.setText(currentSong.getTitle().toString());
//        url.setText(currentSong.getUrl().toString());

        //note: setTag for onClick event in index page.
        listItemView.setTag(currentSong);

        return listItemView;
    }
}
