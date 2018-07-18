package p06_CustomEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String annotationName = reader.readLine();

        if ("Rank".equals(annotationName)){
           Class<CardRanks> cardRanksClass = CardRanks.class;
           printClassAnnotation(cardRanksClass);
        }else{
            Class<CardSuits> cardSuitsClass = CardSuits.class;
            printClassAnnotation(cardSuitsClass);
        }
    }

    private static void printClassAnnotation(Class<?> clazz) {
        if (clazz.isAnnotationPresent(CustomAnnotation.class)){
            CustomAnnotation annotation = clazz.getAnnotation(CustomAnnotation.class);
            System.out.println(String.format("Type = %s, Description = %s",annotation.type(),annotation.description()));

        }
    }
}
