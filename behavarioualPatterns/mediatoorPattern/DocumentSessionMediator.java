package behavarioualPatterns.mediatoorPattern;

public interface DocumentSessionMediator {

    void broadCastChange(String change,User sender);
    void join(User user);
    
} 