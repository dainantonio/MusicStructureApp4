package com.example.therussells.musicstructureapp4;

    //Custom class
    class Songs {

    //Song Names
    private final String mSongName;

    //Artist Name
    private final String mArtistName;

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
