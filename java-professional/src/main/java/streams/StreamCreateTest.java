package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreateTest {
    public static void main(String[] args) throws IOException {
        Stream.of("A", "B", "C", "D").forEach(System.out::println);

        Arrays.stream(new String[]{"A", "B", "C", "D"}).forEach(System.out::println);

        Files.lines(Paths.get("C:\\Users\\Evgeniy\\Desktop\\java-developer-2018\\java-professional\\src\\main\\java\\streams\\test")).forEach(System.out::println);

        "Hello world".chars().forEach(System.out::println);

        Stream.builder().add("A").add("B").add("C").build().forEach(System.out::println);

//        Stream.iterate(1, n -> n + 1).forEach(System.out::println);

        Stream.generate(() -> "a1").forEach(System.out::println);
    }
}
