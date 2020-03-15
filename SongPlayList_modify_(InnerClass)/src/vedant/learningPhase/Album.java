package vedant.learningPhase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SplittableRandom;

public class Album {
    private String name;
    private String artist;
    // private ArrayList<Song> songs;                                       // make arrayList ... we will use it in
    private songList songs;                  // call for inner class

    public Album(String name, String artist) {                           // create method Album
        this.name = name;
        this.artist = artist;
        //this.songs = new ArrayList<Song>();
        this.songs = new songList();
    }

    public boolean addSong(String title, double duration) {                         // support method according to functions
        return songs.add(new Song(title, duration));



      /*  if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;

       */
    }

// delete findSong method and take it to inner class and now onwards control form inner class

    public boolean addToPlaylist(int trackNo, LinkedList<Song> playList){          //change function
        Song checkedSong =  this.songs.findSong(trackNo);
        if(checkedSong != null){
            songs.add(checkedSong);
            return true;
        }
        System.out.println("The Album does not have : " + trackNo);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){          // create same method with different parameter is called method overloading.
        Song checkSong = songs.findSong(title);          // changed here.
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        System.out.println("The Album does not have : " + title);
        return false;
    }

    private class songList{                     //create inner class
        private ArrayList<Song> songs;

        public songList() {                              //constructor
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {              //add method
            if (songs.contains(song)) {
                return false;
            } else {
                songs.add(song);
                return true;
            }
        }

        private Song findSong(String title) {                       //find Song method with string title
            for (int i = 0; i <= songs.size(); i++) {
                Song song = this.songs.get(i);
                if (song.getTitle().equals(title)) {
                    return this.songs.get(i);
                }
            }
            return null;
        }

        private Song findSong(int trackSongs){                //find Song method with track no (method overload
            int index = trackSongs -1;
            if((index >= 0) && (index< songs.size())){
                return songs.get(index);
            }
            return null;
        }










    }















}







