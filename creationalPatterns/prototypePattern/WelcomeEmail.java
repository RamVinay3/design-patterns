package creationalPatterns.prototypePattern;

public class WelcomeEmail implements EmailTemplate {
    private String content;
    private String subject;

    public WelcomeEmail(){
        this.subject="Welcome to TUF+";
         this.content = "Hi there! Thanks for joining us.";

    }
    @Override
    public void setContent(String content){
        this.content=content;

    }
    @Override
    public void send(String to){
        System.out.println("sending email to "+to +" with subject [ "+this.subject+" having content "+this.content);

    }
    @Override
    public WelcomeEmail clone(){
        try{
            return (WelcomeEmail) super.clone();
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
            throw new RuntimeException("Clone failed", e);//because of this error not coming comment it you will find.
        }
       
    }
    
}
