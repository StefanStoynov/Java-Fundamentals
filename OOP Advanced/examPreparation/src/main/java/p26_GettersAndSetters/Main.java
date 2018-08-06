package p26_GettersAndSetters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Method>getters = new ArrayList<>();
        List<Method>setters = new ArrayList<>();
        Class<Reflection>ref = Reflection.class;
        Method[] declaredMethods = ref.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.getName().contains("get")){
                getters.add(declaredMethod);
            }else if (declaredMethod.getName().contains("set")){
                setters.add(declaredMethod);
            }
        }

        for (Method getter : getters) {
            System.out.println(String.format("%s will return %s", getter.getName(), getter.getReturnType().getSimpleName()));
        }
        for (Method setter : setters) {
            Class[]params = setter.getParameterTypes();
            for (Class param : params) {
                System.out.println(String.format("%s and will set field of %s", setter.getName(),param.getSimpleName()));
            }

        }

    }


}
