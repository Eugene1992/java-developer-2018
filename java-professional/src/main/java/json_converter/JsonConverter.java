package json_converter;

public class JsonConverter {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 22, false);

        /*
        {
             "supername": "Ivan",
             "age": 22,
             "isMarried": false
        }
        */

    }

    public static <T> String toJson(T elem) {
        return "";
    }
}
