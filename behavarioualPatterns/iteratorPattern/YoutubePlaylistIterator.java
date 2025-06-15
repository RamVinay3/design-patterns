package behavarioualPatterns.iteratorPattern;

import java.util.List;

public class YoutubePlaylistIterator implements Iterator {
    private List<Video> videos;
    private int position;

    public YoutubePlaylistIterator(List<Video>videos){
        this.position=0;
        this.videos=videos;
    }
   public boolean hasNext(){
        return position < videos.size();
    }
    public Video next(){
        return hasNext()?videos.get(position++):null;
    }
    
}
