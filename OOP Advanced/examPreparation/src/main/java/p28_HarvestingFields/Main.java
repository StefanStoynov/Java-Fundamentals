package p28_HarvestingFields;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Class<?> ref = Class.forName("p28_HarvestingFields." + "RichSoilLand");
        Field[] fields = ref.getDeclaredFields();
        String line;

        while (true) {
            if ("HARVEST".equals(line = reader.readLine())) {
                break;
            }
            String command = line;

            switch (command) {
                case "private":
                    for (Field field : fields) {
                        int modifiers = field.getModifiers();
                        if (Modifier.isPrivate(modifiers)) {
                            System.out.println(String.format("%s %s %s", command, field.getType().getSimpleName(), field.getName()));
                        }
                    }
                    break;
                case "protected":
                    for (Field field : fields) {
                        int modifiers = field.getModifiers();
                        if (Modifier.isProtected(modifiers)) {
                            System.out.println(String.format("%s %s %s", command, field.getType().getSimpleName(), field.getName()));
                        }
                    }
                    break;
                case "public":
                    for (Field field : fields) {
                        int modifiers = field.getModifiers();
                        if (Modifier.isPublic(modifiers)) {
                            System.out.println(String.format("%s %s %s", command, field.getType().getSimpleName(), field.getName()));
                        }
                    }
                    break;
                case "all":
                    for (Field field : fields) {
                        int modifiers = field.getModifiers();
                        System.out.println(String.format("%s %s %s", Modifier.toString(modifiers), field.getType().getSimpleName(), field.getName()));
                    }
                    break;
            }
        }

    }


}
