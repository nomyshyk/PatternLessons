/*
// 1. "Жадный" синглтон, который создается при запуске приложения
// Минус - может забивать память, даже если никто его не вызывал.

public class EagerSingleton {

    */
/** private constructor to prevent others from instantiating this class *//*

    private EagerSingleton() {}

    */
/** Create an instance of the class at the time of class loading *//*

    private static final EagerSingleton instance = new EagerSingleton();

    */
/** Provide a global point of access to the instance *//*

    public static EagerSingleton getInstance() {
        return instance;
    }
}

// 2. "Жадный" синглтон со статической инициализацией в static конструкторе
// Тот же минус что в примере 1, но плюс что можно ловить исключения
public class EagerStaticBlockSingleton {

    private static final EagerStaticBlockSingleton instance;

    */
/** Don't let anyone else instantiate this class *//*

    private EagerStaticBlockSingleton() {}

    */
/** Create the one-and-only instance in a static block *//*

    static {
        try {
            instance = new EagerStaticBlockSingleton();
        } catch (Exception ex) {
            throw ex;
        }
    }

    */
/** Provide a public method to get the instance that we created *//*

    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }
}

// 3. Ленивый синглтон, создается только если его кто-то вызывал
// Создает объект, только если он null
// synchronized для защиты от гонок
public class LazySingleton {

    private static LazySingleton instance;

    */
/** Don't let anyone else instantiate this class *//*

    private LazySingleton() {}

    */
/** Lazily create the instance when it is accessed for the first time *//*

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

// 4. Ленивый синглтон с двойной проверкой
// Проверка на то есть объект и или нет + нет ли гонок, 
// создан синхронизированный блок. Используется ключевое слово volatile
// volatile - если объект изменен одним потоком, то это сразу видно всем остальным потокам
public class LazyDoubleCheckedLockingSingleton {

    private static volatile LazyDoubleCheckedLockingSingleton instance;

    */
/** private constructor to prevent others from instantiating this class *//*

    private LazyDoubleCheckedLockingSingleton() {}

    */
/** Lazily initialize the singleton in a synchronized block *//*

    public static LazyDoubleCheckedLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (LazyDoubleCheckedLockingSingleton.class) {
                // double-check
                if(instance == null) {
                    instance = new LazyDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

// 5. Ленивая инициализация через внутренний класс (Bill Pugh singleton)
// Объект создается при вызове, потокобезопасен и считается самым оптимальным способом
// создания синглтона

public class LazyInnerClassSingleton {

    */
/** private constructor to prevent others from instantiating this class *//*

    private LazyInnerClassSingleton() {}

    */
/** This inner class is loaded only after getInstance() is called for the first time. *//*

    private static class SingletonHelper {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

// 6. Enum синглтон
// Enum инициализируются 1 раз при загрузке класса.
// Подход потокобезопасен, но громоздкий, не гибкий и тяжело воспринимается
import java.util.Arrays;

enum EnumSingleton {
    WEEKDAY("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"),
    WEEKEND("Saturday", "Sunday");

    private String[] days;

    EnumSingleton(String ...days) {
        System.out.println("Initializing enum with " + Arrays.toString(days));
        this.days = days;
    }

    public String[] getDays() {
        return this.days;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "days=" + Arrays.toString(days) +
                '}';
    }
}*/
