package structuralPatterns.bridgePattern;

public class Main {

    public static void main(){
        VideoPlayer videoPlayer=new MobilePlayer(new SDQuality());
        videoPlayer.play("Hanuman");
    }
    
}
