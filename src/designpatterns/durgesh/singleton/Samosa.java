package designpatterns.durgesh.singleton;

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

    private static Samosa samosa;

    // constructor - make it private so that no one can create object of it from outside this class.
    private Samosa() {
//        if (samosa!=null) {
//            throw new RuntimeException("You are trying to break Singleton pattern");
//        }
    }

    // Lazy way of creating Single Object
//    public synchronized static Samosa getSamosa() { // method synchronization
    public static Samosa getSamosa() {
        // Object of this class
        if (samosa == null) {
            synchronized(Samosa.class) { // Synchronized Block
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object readResolve() {
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return samosa;
    }

}

/*
public enum Samosa {
    INSTANCE;
    public void test() {
        System.out.println("New test Method");
    }
}
*/
