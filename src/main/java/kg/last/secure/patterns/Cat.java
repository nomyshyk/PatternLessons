package kg.last.secure.patterns;
public class Cat {
    /** private constructor to prevent others from instantiating this class */
    private Cat() {}

    /** Create an instance of the class at the time of class loading */
    private static final Cat instance = new Cat();

    /** Provide a global point of access to the instance */
    public static Cat getInstance() {
        return instance;
    }
}

class LazySingleton {

    private static LazySingleton instance;

    /** Don't let anyone else instantiate this class */
    private LazySingleton() {}

    /** Lazily create the instance when it is accessed for the first time */
    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

class LazyInnerClassSingleton {

    /** private constructor to prevent others from instantiating this class */
    private LazyInnerClassSingleton(String value) {
        this.value = value;
    }
    private String value;

    /** This inner class is loaded only after getInstance() is called for the first time. */
    private static class SingletonHelper {
        private static final LazyInnerClassSingleton INSTANCE
                = new LazyInnerClassSingleton("Trump");
    }

    public static LazyInnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public String toString() {
        return "LazyInnerClassSingleton{" +
                "value='" + value + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        //Cat singletonDone = new Cat();
        Cat c1 = Cat.getInstance();
        Cat c2 = Cat.getInstance();
        System.out.println(c1.equals(c2));

        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1.equals(l2));

        LazyInnerClassSingleton ik1 = LazyInnerClassSingleton.getInstance();
        System.out.println(ik1);
        LazyInnerClassSingleton ik2 = LazyInnerClassSingleton.getInstance();
        System.out.println(ik2);
    }
}