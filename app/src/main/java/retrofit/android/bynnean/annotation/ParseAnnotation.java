package retrofit.android.bynnean.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ParseAnnotation {

    static String className = "retrofit.android.bynnean.annotation.UserAnnotation";

    /**
     * 简单打印出UserAnnotation 类中所使用到的类注解 该方法只打印了 Type 类型的注解
     * 
     * @throws ClassNotFoundException
     */
    public static void parseTypeAnnotation() {
        Class clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            MethodInfo methodInfo = (MethodInfo) annotation;
            System.out.println("id= \"" + methodInfo.id() + "\"; name= \""
                    + methodInfo.name() + "\"; gid = " + methodInfo.gid());
        }
    }

    /**
     * 简单打印出UserAnnotation 类中所使用到的方法注解 该方法只打印了 Method 类型的注解
     * 
     * @throws ClassNotFoundException
     */
    public static void parseMethodAnnotation() {
        Method[] methods = UserAnnotation.class.getDeclaredMethods();
        for (Method method : methods) {
            /*
             * 判断方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = method
                    .isAnnotationPresent(MethodInfo.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                MethodInfo annotation = method.getAnnotation(MethodInfo.class);
                System.out.println("method = " + method.getName() + " ; "
                        + "id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }

    /**
     * 简单打印出UserAnnotation 类中所使用到的方法注解 该方法只打印了 Method 类型的注解
     * 
     * @throws ClassNotFoundException
     */
    public static void parseConstructAnnotation() {
        Constructor[] constructors = UserAnnotation.class.getConstructors();
        for (Constructor constructor : constructors) {
            /*
             * 判断构造方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = constructor
                    .isAnnotationPresent(MethodInfo.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                MethodInfo annotation = (MethodInfo) constructor
                        .getAnnotation(MethodInfo.class);
                System.out.println("constructor = " + constructor.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }

    public static void main(String[] args) {
        parseTypeAnnotation();
        parseMethodAnnotation();
        parseConstructAnnotation();
    }
}