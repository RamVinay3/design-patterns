package behavarioualPatterns.commandPattern;

public class Main {
    public static void main(){
        Light light=new Light();
        Fan fan=new Fan();

        Command fanOff=new FanOff(fan);
        Command fanOn=new FanOn(fan);
        Command lightOn=new LightOn(light);
        Command lightOff=new LightOff(light);

        RemoteControl remote=new RemoteControl();
        remote.setCommand(0, lightOff);
        remote.setCommand(1, lightOn);
        remote.setCommand(2, fanOff);
        remote.setCommand(3, fanOn);

        remote.pressButton(0);
        remote.pressButton(2);
        remote.pressButton(3);
        remote.pressButton(1);

        remote.undo();

        

    }
}
