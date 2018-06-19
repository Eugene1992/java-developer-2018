package io.adapter;

public class Test {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{23, 121, 43, 12, 65, 34, 56, 33};

        InputStream inputStream = new ByteArrayInputStream(bytes);

        while (inputStream.available() != 0) {
            int read = inputStream.read();
            System.out.println(read);
        }
    }
}
