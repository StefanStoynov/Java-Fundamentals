package p29_PrivateClassFiddling;


import p29_PrivateClassFiddling.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BlackBoxInt ref;

        Class<?> refClass;
        try {
            refClass = Class.forName("p29_PrivateClassFiddling.com." + "BlackBoxInt");
            Constructor<?> constructor = refClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            ref = (BlackBoxInt) constructor.newInstance();

            String line;
            while (true) {
                if ("END".equals(line = reader.readLine())) {
                    break;
                }
                String[] tokens = line.split("_");

                Method declaredMethod = ref.getClass().getDeclaredMethod(tokens[0], int.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(ref,Integer.parseInt(tokens[1]));

                Field field = ref.getClass().getDeclaredField("innerValue");
                field.setAccessible(true);
                System.out.println(field.get(ref));
            }


        } catch (ClassNotFoundException |
                NoSuchMethodException |
                IllegalAccessException |
                InvocationTargetException |
                InstantiationException |
                NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
