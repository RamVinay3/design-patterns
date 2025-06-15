package behavarioualPatterns.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlaylist implements Playlist {

    private List<Video> playlist=new ArrayList<>();

    public void add(Video video){
        playlist.add(video);

    }
    @Override
    public Iterator createIterator(){
        return new YoutubePlaylistIterator(playlist);
    }
    
    
}
