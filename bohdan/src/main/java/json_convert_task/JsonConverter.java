package json_convert_task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonConverter {
    public static void main(String[] args) {
        Player player = new Player("Akakiy", 20, "Bot", "silver");
        File file = new File("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\java\\json_convert_task\\test.json");


        try {
            writeToFile(file, convertToJson(player));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> String convertToJson(T object) throws IllegalAccessException {
        String json = "";

        Class myClass = object.getClass();
        if (!myClass.isAnnotationPresent(JsonAcceptableType.class)) {
            return json;
        }
        Field[] myFields = myClass.getDeclaredFields();

        // TODO: 6/22/2018 convert arrays
        json += "{";
        for (int i = 0; i < myFields.length; i++) {
            json += "\n";
            myFields[i].setAccessible(true);
            if (myFields[i].isAnnotationPresent(JsonAcceptableField.class)) {
                JsonAcceptableField myTypeAnnotation = myFields[i].getAnnotation(JsonAcceptableField.class);
                json += "\"" + myTypeAnnotation.name() + "\"";
            } else {
                json += "\"" + myFields[i].getName() + "\"";
            }

            json += ": ";

            if (i == myFields.length - 1) {
                json += "\"" + myFields[i].get(object) + "\"";
                continue;
            }
            json += "\"" + myFields[i].get(object) + "\",";
        }
        json += "\n}";

        return json;
    }

    public static void writeToFile(File file, String json) throws IOException {
        List<String> data = new ArrayList<>(Arrays.asList(json.split("[\n]")));

        data
                .stream()
                .forEach(System.out::println);

        FileWriter fileWriter = new FileWriter(file.getPath());
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (int i = 0; i < data.size(); i++) {
            writer.write(data.get(i) + "\n");
        }

        writer.close();
        fileWriter.close();
    }
}
