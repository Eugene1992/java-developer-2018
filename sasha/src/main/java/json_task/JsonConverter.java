package json_task;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

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
                Field currentField = fields[k];
                try {
                    currentField.setAccessible(true);

                    json = String.format("%s \"%s\": %s",
                            json,
                            currentField.isAnnotationPresent(JsonSuperName.class) ? currentField.getDeclaredAnnotation(JsonSuperName.class).name() : currentField.getName(),
                            currentField.getType().isPrimitive() ? currentField.get(elem) : "\"" + currentField.get(elem) + "\""
                    );

                    json = k == fields.length - 1 ? json : json + ",";

                    k++;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            json = "{" + json + "}";

        } else {
            throw new IllegalAnnotationException("Convert to JSON not supported! " + JsonEntity.class.getSimpleName() + " annotation expected");
        }
        return json;
    }

    public static <T> void toFileJson(String json, T elem) {
        File file = new File("C:\\Users\\sasha\\IdeaProjects\\java-developer-2018\\sasha\\src\\main\\java\\json_task\\" + elem.getClass().getSimpleName() + elem.hashCode() + ".json");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            json = json.replace("{", "{\n");
            json = json.replace(",", ",\n");
            json = json.replace("}", "\n}");
            out.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}