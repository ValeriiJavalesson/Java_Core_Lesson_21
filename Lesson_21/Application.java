package Lesson_21;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        Plant p1 = new Plant("Green", 120, "Poaceae");
        File file = new File("annotations.txt");
        List<String> annotationValuesList = getAnnotationValues(p1.getClass());

        writeAnnotationListItemsToFile(annotationValuesList, file);
        readAnnotationListItemsFromFile(file);

    }


    public static List<String> getAnnotationValues(Class<?> customClass) {
        List<String> annotationValues = new ArrayList<String>();
        Field[] classFields = customClass.getDeclaredFields();

        for (Field field : classFields) {
            if (field.getAnnotation(PlantAnnotation.class) instanceof PlantAnnotation) {
                annotationValues.add(field.getType().getSimpleName() + " " + field.getName()
                        + " -- " + field.getAnnotation(PlantAnnotation.class).value());
            }
        }
        return annotationValues;
    }

    public static void writeAnnotationListItemsToFile(List<String> list, File file) throws IOException {
        Files.write(file.toPath(), list);
    }

    public static void readAnnotationListItemsFromFile(File file) throws IOException {
        System.out.println(Files.readString(file.toPath()));
    }
}
