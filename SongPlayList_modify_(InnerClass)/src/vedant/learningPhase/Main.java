package vedant.learningPhase;

/* we will modify code as follow:
         - instead of using song as class in another windows,
         - modify to subclass/ inner class of album...
 */
import java.util.*;                                                               // called scanner

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {                                      // static :
        Album album = new Album("stormBriber", "Deep purple");                    // create object
        album.addSong("StormBriber", 2.56);
        album.addSong("Holy man", 6.98);
        album.addSong("Hold on", 5.09);
        album.addSong("High ball shooter",4.67);
        album.addSong("The gypsy", 4.23);
        albums.add(album);


        album = new Album("All about the rocks", "ac/dc");
        album.addSong("I put the finger on you", 2.56);
        album.addSong("Let's go", 6.98);
        album.addSong("snow bowled", 5.09);
        album.addSong("C.O.D.",4.67);
        album.addSong("Night of the long knives", 4.23);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right now", playlist);
        albums.get(0).addToPlaylist("Holy man" , playlist);
        albums.get(1).addToPlaylist("The fake song",playlist);    // does not exist
        albums.get(0).addToPlaylist(3,playlist);
        albums.get(1).addToPlaylist(1,playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;                                                 //remain in program by default
        boolean forward = true;                                              // IMP: IT ONLY SHOW DIRECTION, NOT TAKING ACTIONS ,

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){                                       // logic: default forward is true, so our ultimate goal is to go ...
                        if(listIterator.hasNext()){                    // ... go forward, so if there is not forward then we need to change the direction...
                            listIterator.next();                      // IMP : TAKE ACTION SO POINTER ACTUALLY MOVE
                        } else {
                            forward = true;
                        }
                        if(listIterator.hasNext()){
                            System.out.println("Now playing list "+ listIterator.next().toString());
                        } else {
                            System.out.println("We have reached end of the playlist");
                            forward = false;
                        }
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();                                // ... change direction,  IMP: TAKE ACTION, SO POINTER ACTUALLY MOVE PREVIOUS
                        } else {
                            forward = false;
                        }

                        if(listIterator.hasPrevious()){
                            System.out.println("We are playing list " + listIterator.previous().toString());
                        } else {
                            System.out.println("We have reached at the start of the playlist");
                        }
                    }
                    break;
                case 3:                                       // imp: see case 3 do not take any action ,just check condition and change direction so pointer remain in current song list
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing : " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println(" Now playing : " + listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available Options : \n" );
        System.out.println(" 0 = to quit\n +" +
                "1  = to play next song\n" +
                "2  = to play previous song\n" +
                "3  = to replay current song\n" +
                "4  = list for the whole playlist\n" +
                "5  = print available options\n" +
                "6  = delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("====================================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====================================");
    }

}
