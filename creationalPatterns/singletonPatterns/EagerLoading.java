/*java EagerLoading  # ❌ This is wrong if your class is in a package */
package creationalPatterns.singletonPatterns;
//The object is created while the class is loaded 
//so thread safe incase of multiple thread also the same object is used.
class Singleton{
    private static final Singleton instance=new Singleton();
    private Singleton(){
        //because it is declared private ,object cannot be created outside this class
    }
    public static Singleton getInstance(){
        return instance;
    }
}
public class EagerLoading {
    public static void main(String [] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
    
}
