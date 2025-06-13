package creationalPatterns.singletonPatterns;

class InnerLoading{
    private InnerLoading(){
        
    }
    private static class Holder{
        public static InnerLoading l=new InnerLoading();
    }
    public static InnerLoading getInstance(){
        return Holder.l;
    }
}

public class BillPughSingleton {

    public static void main(String[] arg){
        InnerLoading s1= InnerLoading.getInstance();
        InnerLoading s2=InnerLoading.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
    
}
