package creationalPatterns.singletonPatterns;

 class SynchronisedSingleton {
    private static SynchronisedSingleton instance;

    private SynchronisedSingleton() {}
    
    // Synchronized keyword used
    public static synchronized SynchronisedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronisedSingleton();
        }
        return instance;
    }
}

/* 2nd way */
 class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}


public class Synchronised {
    public static void main(String[] arg){
        SynchronisedSingleton s1= SynchronisedSingleton.getInstance();
        SynchronisedSingleton s2=SynchronisedSingleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
    
}
