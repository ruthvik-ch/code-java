package Basics;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton Constructor called");
    }

    public synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


