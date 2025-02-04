package E11.zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Mai {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Hobit","elish",99));
        songs.add(new Song("Alle","E",102));
        songs.add(new Song("Biby","Elish",100));

        Collections.sort(songs,new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song song : songs){
            System.out.println(song);
        }
    }
}
