package io.decorator;

public class BufferedStringReader extends Reader {
    private Reader reader;

    public BufferedStringReader(Reader reader) {
        this.reader = reader;
    }

    public String readLine() {
        String buf = "";
        while (true) {
            int read = reader.read();
            if (read == '\n') {
                break;
            }
            buf += (char) read;

        }
        return buf;
    }

    @Override
    int read() {
        return reader.read();
    }

    @Override
    boolean ready() {
        return reader.ready();
    }
}
