package creationalPatterns.prototypePattern;


public class Main {
    public static void main(String[] args){
        EmailTemplate email1= EmailRegistry.getTemplate("welcome");
        EmailTemplate email2= EmailRegistry.getTemplate("welcome");

        System.out.println(email1);
        System.out.println(email2);

    }
    
}
