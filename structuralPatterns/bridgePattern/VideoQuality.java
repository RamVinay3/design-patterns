package structuralPatterns.bridgePattern;

 interface VideoQuality{
    void load(String title);
}

class SDQuality implements VideoQuality{
    public void load(String title){
        System.out.println("Playing video of "+title+" in SD Quality");
    }
}
class HDQuality implements VideoQuality{
    public void load(String title){
        System.out.println("Playing video of "+title+" in HD Quality");
    }
}


//if we want any other video quality 
//all we need to do is create one class and pass it in client code

/* previously we should have done creating PlayerQualityClass for each quality vs player which
 * are lot of classes because we decoupled abstraction(videplayer) with implementation(VideoQuality)
 * we can do with single class
 */