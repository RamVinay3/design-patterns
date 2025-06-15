package behavarioualPatterns.iteratorPattern;

public class Main {

    public static void main(){
        Playlist playlist=new YoutubePlaylist();
        playlist.add(new Video("Long story short Video song"));
        playlist.add(new Video("you are on your own kid"));
        //use don't know how we are traversing(internal details) through next video
         Iterator iterator=playlist.createIterator();
         while(iterator.hasNext()){
            System.out.println("Streaming "+iterator.next().getTitle());
         }
    }
    
}
