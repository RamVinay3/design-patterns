package creationalPatterns.prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class EmailRegistry {
    private static final Map<String, EmailTemplate> templates = new HashMap<>();

    //creates an object during class creation
    static{
        templates.put("welcome", new WelcomeEmail());
    }
    //this function returns the clone of the created object so that when we 
    //have object creation costly we can just clone it.
    public static EmailTemplate getObject(String key){
        return templates.get(key).clone();
    }
}
