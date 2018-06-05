package generics;

import java.util.Arrays;
import java.util.List;

public class SubTypeTest {
    public static void main(String[] args) {

        List<Cat> cats = Arrays.asList(new Cat());
        List<HomeCat> homeCats = Arrays.asList(new HomeCat());
        List<Animal> animals = Arrays.asList(new HomeCat());

        testExtends(cats);
        testExtends(homeCats);
//        testExtends(animals);

        testSuper(cats);
//        testSuper(homeCats);
        testSuper(animals);

        testQuestionMark(cats);
        testQuestionMark(homeCats);
        testQuestionMark(animals);

        testType(cats);
        testType(homeCats);
        testType(animals);

    }

    static <T> void testType(List<T> cats) {

    }

    // ковариантность
    static void testExtends(List<? extends Cat> cats) {

    }

    // контрвариантность
    static void testSuper(List<? super Cat> cats) {

    }

    // инвариантность
    static void testQuestionMark(List<?> cats) {

    }

    static class Animal {

    }

    static class Cat extends Animal {

    }

    static class HomeCat extends Cat {

    }
}
