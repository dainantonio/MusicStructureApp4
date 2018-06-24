package com.example.therussells.musicstructureapp4;


//This class will model the data for the audio file(song name and artist name)
class Songs {
    //class declaration with 2 instance variables for the song
   private final String mSongName;
   private final String mArtistName;

   Songs(String songName){
       mSongName = songName;
       mArtistName = "Chronix";
   }

    public String getsongName() {
        return mSongName;
    }

    public String getartistName() {
        return mArtistName;
    }
}
