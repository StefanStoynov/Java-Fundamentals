package p03_HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Class<?> reflection;

        Set<Field> fieldsWitMistake = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
        Set<Method> gettersWitMistake = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
        Set<Method> settersWitMistake = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));


        try {
            reflection = Class.forName("p03_HighQualityMistakes." + "Reflection");
            Field[] declaredFields = reflection.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                int modifiers = declaredField.getModifiers();
                if (!Modifier.isPrivate(modifiers)) {
                    fieldsWitMistake.add(declaredField);
                }
            }
            Method[] declaredMethods = reflection.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                int modifiers = declaredMethod.getModifiers();
                if (declaredMethod.getName().startsWith("get") &&
                        !declaredMethod.getReturnType().equals(void.class) &&
                        declaredMethod.getParameterTypes().length == 0 &&
                        !Modifier.isPublic(modifiers)) {
                    gettersWitMistake.add(declaredMethod);
                } else if (declaredMethod.getName().startsWith("set") &&
                        declaredMethod.getReturnType().equals(void.class) &&
                        declaredMethod.getParameterTypes().length == 1 &&
                        !Modifier.isPrivate(modifiers)) {
                    settersWitMistake.add(declaredMethod);
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Field field : fieldsWitMistake) {
            System.out.println(String.format("%s must be private!",field.getName()));
        }
        for (Method method : gettersWitMistake) {
            System.out.println(String.format("%s have to be public!",method.getName()));
        }
        for (Method method : settersWitMistake) {
            System.out.println(String.format("%s have to be private!",method.getName()));
        }

    }

}
