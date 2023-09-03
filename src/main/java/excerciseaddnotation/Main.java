package excerciseaddnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        TypicalClass myClass = new TypicalClass(22, "Jarek", new Person(23,33));


        //Class details

        Class<?> classInfo = TypicalClass.class;
        System.out.println(" Class name: " + classInfo.getName());

        //Constructors
        Constructor<?>[] constructors = classInfo.getConstructors();
        System.out.println("Constructors amount" + constructors);

        //Methods amount
        Method[] methods = classInfo.getMethods();
        System.out.println("Methods amount: " + methods);

        System.out.println("Return types of methods and method names: ");

        for(Method method: methods){
            System.out.println("Method: " +method.getName());
            System.out.println("Return type :" + method.getReturnType());
        }

    }
}
