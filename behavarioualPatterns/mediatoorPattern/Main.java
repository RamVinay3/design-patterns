package behavarioualPatterns.mediatoorPattern;

public class Main {

    public static void main(){
        DocumentSessionMediator doc=new CollaborativeDoc();
        User raju=new User("raju",doc);
        User ram=new User("ram", doc);
        User rani=new User("rani", doc);

        doc.join(raju);
        doc.join(rani);
        doc.join(ram);

        ram.makeChange("Added title");

    }
    
}
