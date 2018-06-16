package io.adapter;

public class ByteArrayInputStream extends InputStream {

    private byte[] arr;
    private int cur = 0;

    public ByteArrayInputStream(byte[] arr) {
        this.arr = arr;
    }

    @Override
    int read() {
        return arr[cur++];
    }

    @Override
    int available() {
        return cur != arr.length ? arr.length - cur : 0;
    }
}
