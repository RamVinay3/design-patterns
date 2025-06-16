package behavarioualPatterns.commandPattern;

public class FanOff  implements Command{
    private Fan fan;

    public FanOff(Fan fan){
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
