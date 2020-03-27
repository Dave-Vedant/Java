package vedant.learningPhase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;                                       // make arrayList ... we will use it in LinkedLists

    public Album(String name, String artist) {                           // create method Album
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {                         // support method according to functions
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i <= songs.size(); i++) {
            Song song = this.songs.get(i);
            if (song.getTitle().equals(title)) {
                return this.songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNo, LinkedList<Song> playList){
        int index= trackNo -1;                                               // to match the index (track no start = 1 , and index = 0.
        if((index >=0) && (index <= songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("The Album does not have : " + trackNo);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){          // create same method with different parameter is called method overloading.
        Song checkSong = findSong(title);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        System.out.println("The Album does not have : " + title);
        return false;
    }
}







