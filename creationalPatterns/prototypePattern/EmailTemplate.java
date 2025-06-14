package creationalPatterns.prototypePattern;

public interface EmailTemplate extends Cloneable {
    void send(String to);
    void setContent(String content);
    EmailTemplate clone();
}
