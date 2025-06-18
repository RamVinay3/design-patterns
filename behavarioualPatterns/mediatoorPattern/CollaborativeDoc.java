package behavarioualPatterns.mediatoorPattern;

import java.util.ArrayList;
import java.util.List;

public class CollaborativeDoc implements DocumentSessionMediator {

    List<User> users;
    CollaborativeDoc(){
        users=new ArrayList<>();
    }
    public void broadCastChange(String change ,User sender){
        for(User user:users){
            if(user != sender){
                user.receiverChange(change,sender);
            }
        }
    }
    public void join(User user){
        users.add(user);

    }
    
}
