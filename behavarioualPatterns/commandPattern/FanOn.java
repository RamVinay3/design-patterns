package behavarioualPatterns.commandPattern;

public class FanOn implements Command{
    private Fan fan;

    public FanOn(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute() {
      fan.off();
    }

    @Override
    public void undo() {
       fan.on();
    }
    
}
