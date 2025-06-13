package creationalPatterns.singletonPatterns;
/*The object is created when needed not always present so memory efficient 
 * not thread safe, each thread work independently so 
 * Thus, it requires synchronization in multi-threaded environments.
*/
class LazySingleton{
    private static LazySingleton singleton;
   // private String king="raju";

    private LazySingleton(){

    }
    public static LazySingleton getInstance(){

        if(singleton == null){
            singleton=new LazySingleton();
        }
        // singleton.Printer(); can access the methods related to object also
      //  System.out.println(singleton.king);//a static object having private variable can be accessed.
        return singleton;
    }
    public void Printer(){
        System.out.println("printer");
    }

}

public class LazyLoading {
    public static void main(String[] args){
        LazySingleton s1= LazySingleton.getInstance();
        System.out.println(s1);
        LazySingleton s2= LazySingleton.getInstance();
        System.out.println(s2);
        
    }
}
