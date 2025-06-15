package structuralPatterns.bridgePattern;

public abstract class VideoPlayer {
    protected VideoQuality videoQuality ;
    VideoPlayer(VideoQuality videoQuality){
        this.videoQuality=videoQuality;
     }
    abstract void play(String title);
}
//webPlayer
class WebPlayer extends VideoPlayer{
    public WebPlayer(VideoQuality videoQuality){
        super(videoQuality);

    }
    public void play(String title){
        videoQuality.load(title);
    }
}
//Mobile player
class MobilePlayer extends VideoPlayer{
    public MobilePlayer(VideoQuality videoQuality){
        super(videoQuality);

    }
    public void play(String title){
        videoQuality.load(title);
    }
}

//TV player
class TvPlayer extends VideoPlayer{
    public TvPlayer(VideoQuality videoQuality){
        super(videoQuality);

    }
    public void play(String title){
        videoQuality.load(title);
    }
}