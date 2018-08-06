package p27_HighQualityMistakes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Field> fieldsWitMistake = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
        Set<Method> gettersWitMistake = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
        Set<Method> settersWitMistake = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
        Class<?> ref;
        try {
            ref = Class.forName("p27_HighQualityMistakes." + "Reflection");
            Method[] declaredMethods = ref.getDeclaredMethods();

            for (Method declaredMethod : declaredMethods) {
                if (declaredMethod.getName().contains("get") && !Modifier.isPublic(declaredMethod.getModifiers())) {
                    gettersWitMistake.add(declaredMethod);
                } else if (declaredMethod.getName().contains("set") && !Modifier.isPrivate(declaredMethod.getModifiers())) {
                    settersWitMistake.add(declaredMethod);
                }
            }

            Field[] declaredFields = ref.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                if (!Modifier.isPrivate(declaredField.getModifiers())) {
                    fieldsWitMistake.add(declaredField);
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Field field : fieldsWitMistake) {
            System.out.println(String.format("%s must be private!", field.getName()));
        }
        for (Method getter : gettersWitMistake) {
            System.out.println(String.format("%s have to be public!", getter.getName()));
        }
        for (Method setter : settersWitMistake) {
            System.out.println(String.format("%s have to be private!", setter.getName()));
        }
    }
}
