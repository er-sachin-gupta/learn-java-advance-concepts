package designpatterns.durgesh.singleton;

public class Example {

    public static void main(String[] args) throws Exception, CloneNotSupportedException {
       /* Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());*/

        /*
        For Enum Code
         */
        /*Samosa samosa1 = Samosa.INSTANCE;
        System.out.println(samosa1.hashCode());
        samosa1.test();*/

        /*Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());*/

        /*
        Object creation using deserialization
         */
        /*Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(samosa);

        System.out.println("Serialization Done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa1 = (Samosa) ois.readObject();
        System.out.println(samosa1.hashCode());*/


        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa s2 =  (Samosa) samosa.clone();
        System.out.println(s2.hashCode());

    }
}
