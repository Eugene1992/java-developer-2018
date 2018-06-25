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
        Player player = new Player("Akakiy", 20, "Silver", "Biba", "Boba");
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

        json += "{";
        for (int i = 0; i < myFields.length; i++) {
            json += "\n";
            myFields[i].setAccessible(true);
            if (myFields[i].isAnnotationPresent(JsonAcceptableField.class)) {
                JsonAcceptableField myTypeAnnotation = myFields[i].getAnnotation(JsonAcceptableField.class);
                json += "\t\"" + myTypeAnnotation.name() + "\"";
            } else {
                json += "\t\"" + myFields[i].getName() + "\"";
            }

            json += ": ";

            Class<?> type = myFields[i].getType();
            if (type.isArray()) {
                json += getConvertedArrayField(myFields[i], object) + (i == myFields.length - 1 ? "" : ",");
                continue;
            }
            json += "\"" + myFields[i].get(object) + (i == myFields.length - 1 ? "\"" : "\",");
        }
        json += "\n}";

        return json;
    }

    public static String getConvertedArrayField(Field myField, Object object) throws IllegalAccessException {
        String array = "[\n";

        String[] values = (String[]) myField.get(object);
        for (String value : values) {
            array += "\t\t\"" + value + "\",\n";
        }

        return array + "\t]";
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
