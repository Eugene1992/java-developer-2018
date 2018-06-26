package json_task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class JsonConverter {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 22, false);

        System.out.println(toJson(ivan));
        toFileJson(toJson(ivan), ivan);
    }

    public static <T> String toJson(T elem) {
        String json = "";
        int k = 0;

        if (elem.getClass().isAnnotationPresent(JsonEntity.class)) {
            Field[] fields = elem.getClass().getDeclaredFields();

            while (k < fields.length) {
                try {
                    if (k == fields.length - 1) {
                        fields[k].setAccessible(true);
                        if (fields[k].isAnnotationPresent(JsonSuperName.class)) {
                            JsonSuperName declaredAnnotation = fields[k].getDeclaredAnnotation(JsonSuperName.class);
                            json = json + " \"" + declaredAnnotation.name() + "\": \"" + fields[k].get(elem) + "\"";
                            k++;
                        } else {
                            json = json + " \"" + fields[k].getName() + "\": \"" + fields[k].get(elem) + "\"";
                            k++;
                        }
                    } else {
                        fields[k].setAccessible(true);
                        if (fields[k].isAnnotationPresent(JsonSuperName.class)) {
                            JsonSuperName declaredAnnotation = fields[k].getDeclaredAnnotation(JsonSuperName.class);
                            json = json + " \"" + declaredAnnotation.name() + "\": \"" + fields[k].get(elem) + "\",";
                            k++;
                        } else {
                            json = json + " \"" + fields[k].getName() + "\": \"" + fields[k].get(elem) + "\",";
                            k++;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            json = "{" + json + "}";

        } else {
            System.out.println("Convert to JSON not supported!!!!");
        }
        return json;
    }

    public static <T> void toFileJson(String json, T elem) {
        String jsonFile = json;
        File file = new File("C:\\Users\\ai\\Documents\\java-developer-2018\\sasha\\src\\main\\java\\json_task\\" + elem.getClass().getSimpleName() + elem.hashCode() + ".json");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            jsonFile = jsonFile.replace("{", "{\n");
            jsonFile = jsonFile.replace(",", ",\n");
            jsonFile = jsonFile.replace("}", "\n}");
            out.write(jsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}