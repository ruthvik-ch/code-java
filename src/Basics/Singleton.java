package Basics;

public class Singleton {
    private static Singleton instance;

    public static int getObjectsCreated() {
        return objectsCreated;
    }

    private static int objectsCreated = 0;
    private Singleton(){
        System.out.println("Singleton Constructor called");
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        objectsCreated++;
        return instance;
    }
}


