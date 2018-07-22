package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String modifire;
        while (true) {
            if ("HARVEST".equals(modifire = reader.readLine())) {
                break;
            }



            printByModifire(modifire);


        }
    }

    private static Field[] getFieldArray(String modifire) {
        Field[] declaredFields = RichSoilLand.class.getDeclaredFields();

        switch (modifire) {
            case "private":
                return Arrays.stream(declaredFields).filter(field -> Modifier.isPrivate(field.getModifiers())).toArray(Field[]::new);
            case "protected":
                return Arrays.stream(declaredFields).filter(field -> Modifier.isProtected(field.getModifiers())).toArray(Field[]::new);
            case "public":
                 return Arrays.stream(declaredFields).filter(field -> Modifier.isPublic(field.getModifiers())).toArray(Field[]::new);
            case "all":
                return declaredFields;
        }
        return null;
    }

    private static void printByModifire(String modifire) {
        Field[] fieldArray = getFieldArray(modifire);

        Arrays
                .stream(fieldArray)
                .forEach(field -> System.out.println(String.format("%s %s %s"
                        , Modifier.toString(field.getModifiers())
                        , field.getType().getSimpleName()
                        , field.getName())));
    }

}
