package hust.soict.cybersec.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list of tracks.");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track does not exist in the list of tracks.");
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

   
}
