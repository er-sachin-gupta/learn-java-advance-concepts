package designpatterns.durgesh.singleton;

public class Jalebi {

    // Object creation in Eager Way or Eager way of creating Single Object
    private static Jalebi jalebi = new Jalebi();

    // constructor - make it private so that no one can create object of it from outside this class.
    private Jalebi() {

    }

    public static Jalebi getJalebi() {
        return jalebi;
    }

}
