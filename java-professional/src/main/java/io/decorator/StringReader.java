package io.decorator;

public class StringReader extends Reader {
    private byte[] bytes;
    private int cur;

    public StringReader(String str) {
        this.bytes = str.getBytes();
    }


    @Override
    int read() {
        return bytes[cur++];
    }

    @Override
    boolean ready() {
        return cur != bytes.length;
    }
}
