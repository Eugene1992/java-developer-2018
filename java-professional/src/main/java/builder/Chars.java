package builder;

public class Chars {

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public Chars(CharsBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public static void main(String[] args) {
        Chars chars = new CharsBuilder("a", "b")
                .c("c")
                .d("c")
                .e("e")
                .build();

    }

    static class CharsBuilder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public CharsBuilder(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public CharsBuilder c(String c) {
            this.c = c;
            return this;
        }

        public CharsBuilder d(String d) {
            this.d = d;
            return this;
        }

        public CharsBuilder e(String e) {
            this.e = e;
            return this;
        }

        public Chars build() {
            return new Chars(this);
        }
    }
}
