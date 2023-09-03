package excerciseaddnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        TypicalClass myClass = new TypicalClass(22, "Jarek", new Person(23, 33));


        //Zadanie 2

        Class<?> classInfo = TypicalClass.class;
        System.out.println(" Class name: " + classInfo.getName());

        //Constructors
        Constructor<?>[] constructors = classInfo.getConstructors();
        System.out.println("Constructors amount" + constructors.length);

        //Methods amount
        Method[] methods = classInfo.getDeclaredMethods();
        System.out.println("Methods amount: " + methods.length);

        System.out.println();
        System.out.println();

        System.out.println("Return types of methods and method names: ");

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            System.out.println("Return type :" + method.getReturnType());
        }

        Field[] fields = classInfo.getDeclaredFields();
        System.out.println("Fields names and their types: ");

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type:" + field.getType());
        }


        //Zadanie 3
        try {
            for (Method method : methods) {
                //Check if annotation is present
                if (method.isAnnotationPresent(SuperMethod.class)) {
                    SuperMethod superMethod = method.getAnnotation(SuperMethod.class);

                    if (superMethod.run()) {
                        System.out.println("This method has \"Super Method\" annotation: " + method.getName());

                        //Creating TypicalClass object
                        Constructor<?> constructor = classInfo.getDeclaredConstructor();
                        Object object = constructor.newInstance();
                        //Invoking method ?

                        Object invokeMethod = method.invoke(object,"Jaroslaw");
                        System.out.println(invokeMethod);
                    }
                }
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
