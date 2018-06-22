package com.example.therussells.musicstructureapp4;

    //Custom class
    public class Songs {

    //Song Names
    private String mSongName;

    //Artist Name
    private String mArtistName;

    //new Songs Object created
    public Songs(String songName, String artistName) {
       mSongName = songName;
        mArtistName = artistName;
    }

    ///get song name
    public String getSongsName() {
        return mSongName;
    }

    // get artist name
    public String getArtistName() {
        return mArtistName;
    }

}
