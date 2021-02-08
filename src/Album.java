import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for(Song song : songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        for(Song song:songs){
            if((songs.indexOf(song)+1) == trackNumber){
                playList.add(song);
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String string, LinkedList<Song> playList){
        Song song = findSong(string);
        if(song != null){
            playList.add(song);
            return true;
        }
        return false;
    }


}
