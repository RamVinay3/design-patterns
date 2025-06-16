package behavarioualPatterns.commandPattern;

import java.util.Stack;

public class RemoteControl {
    private Command[] commands=new Command[4];
   private  Stack<Command> trackCommands=new Stack<>();
    public void setCommand(int index,Command command){
        commands[index]=command;

    }
    public void pressButton(int index){

        if(commands[index]==null)return;
        commands[index].execute();
        trackCommands.push(commands[index]);
    }
    public void undo(){
        System.out.println("undoing the last command");
        if(!trackCommands.empty()){
            trackCommands.pop().undo();
        }
    }

}
