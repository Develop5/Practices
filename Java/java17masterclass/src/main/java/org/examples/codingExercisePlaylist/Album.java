package org.examples.codingExercisePlaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    String name;
    String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        // Returns true if song was added successfully to the album; otherwise, false.
        if (findSong(titleOfSong) != null) {
            // The song was already in the list. No need to add
            return false;
        } else {
            // The song was not in the list, needs to be included
            songs.add(new Song(titleOfSong, durationOfSong));
        }
        return true;    // Update this
    }


    public Song findSong(String titleOfSong) {
        // Returns the Song if it exists, null if it doesn't exists.
        int indexExistSong = songs.indexOf(titleOfSong);
        if (indexExistSong < 0 ) {
            return null;
        } else {
            return songs.get(indexExistSong);
        }

    }

    public boolean addToPlayList(int trackNumberOfSongInAlbum, LinkedList<Song> playlist) {
        // Returns true if it exists and it was added successfully using the track number, or false otherwise.
        Song foundSong = playlist.get(trackNumberOfSongInAlbum);
        if (findSong(foundSong.title) != null) {
            // The song was found in the list
            return false;
        } else {
            // The song is not in te list, needs to be added at the trackNumberOfSongInAlbum

        }

        return true;    // Update this
    }


    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist) {
        // Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
        if (findSong(titleOfSong) != null) {
            // The song was found in the list. No need to add it.
            return false;
        } else {
            // The song was not found. Needs to be added
            Song songtoAdd =
            playlist.addLast(new Song(findSong(titleOfSong));

        }

        return true;   // Update this
    }



}
