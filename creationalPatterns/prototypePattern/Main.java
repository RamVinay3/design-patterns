package creationalPatterns.prototypePattern;


public class Main {
    public static void main(String[] args){
        EmailTemplate email1= EmailRegistry.getObject("welcome");
        EmailTemplate email2= EmailRegistry.getObject("welcome");

        System.out.println(email1);
        System.out.println(email2);

    }
    
}
