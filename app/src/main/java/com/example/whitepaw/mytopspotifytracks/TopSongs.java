package com.example.whitepaw.mytopspotifytracks;

import java.util.ArrayList;

/**
 * Created by Whitepaw on 05/07/2017.
 */

public class TopSongs {
    private ArrayList<Song> list;

    public TopSongs() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "El Condor Pasa(If I Could) - Simon & Garfunkel", "https://open.spotify.com/track/1eN42Q7IWRzRBq8eW2Y2TE"));
        list.add(new Song(2, "Don't Get Me Wrong - The Devevolutions", "https://open.spotify.com/track/2IQq6JhhVH7Y1lR08WgHaQ"));
        list.add(new Song(3, "The Man Who Sold The World - Midge Ure", "https://open.spotify.com/track/5rwxxm85PFIyAo85hLUoPY"));
        list.add(new Song(4, "Drop The Game - Flume, Feat. Chet Faker", "https://open.spotify.com/track/6dqS3aIJ5L55w8TX6Acd7Y"));
        list.add(new Song(5, "Breeze Blocks - alt-J", "https://open.spotify.com/track/7gARZ2i5u5DHC1b1n1fML5"));
        list.add(new Song(6, "You & Me(Flume Remix) - Disclosure, ELIZA, Flume", "https://open.spotify.com/track/3W2ZcrRsInZbjWylOi6KhZ"));
        list.add(new Song(7, "Ripetide - Vance Joy", "https://open.spotify.com/track/7yq4Qj7cqayVTp3FF9CWbm"));
        list.add(new Song(8, "Stolen Dance - Milky Chance", "https://open.spotify.com/track/1tvrQvPSxT4mdEY1zlBUN5"));
        list.add(new Song(9, "No Diggity - Chet Faker", "https://open.spotify.com/track/1xCkZYGKDv7ELjSlIKedOy"));
        list.add(new Song(10, "Wildfire - SBTRKT", "https://open.spotify.com/track/2WMRd3xAb9FwXopCRNWDq1"));
        list.add(new Song(11, "Intro - The xx", "https://open.spotify.com/track/0bXpmJyHHYPk6QBFj25bYF"));
        list.add(new Song(12, "Hot Knife - Fiona Apple", "https://open.spotify.com/track/4eZPjR0dLEYvH5Ku26rnLi"));
        list.add(new Song(13, "Twilight Driving - Methyl Ethel", "https://open.spotify.com/track/4ZSKL2EVrm3QDGefhVE3vm"));
        list.add(new Song(14, "Trouble - Cage The Elephant", "https://open.spotify.com/track/3pxw9Agh9VB9kyx79REpRQ"));
        list.add(new Song(15, "Do I Wanna Know - Arctic Monkeys", "https://open.spotify.com/track/3jfr0TF6DQcOLat8gGn7E2"));
        list.add(new Song(16, "Home made (Hidden Track) - alt-J", "https://open.spotify.com/track/7I75XsK2hw4ypl6duOprVi"));
        list.add(new Song(17, "Tone Twilight Zone - Cornelius", "https://open.spotify.com/track/2xY29TkDOYKjaOGHqZN0SQ"));
        list.add(new Song(18, "Delilah - Florence + The Machine", "https://open.spotify.com/track/12HB8AmFTovKrFcGG36KbL"));
        list.add(new Song(19, "Do You Remember - Jarryed James", "https://open.spotify.com/track/0IMQFfmMikvJge5bweNVxe"));
        list.add(new Song(20, "Crystalised - The xx", "https://open.spotify.com/track/6rxEjkoar48SssZePbtb2x"));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}
