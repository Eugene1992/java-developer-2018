package conditionals;

public class SwitchCaseStringExample {
    public static void main(String[] args) {
        String myBeautifulLittlePony = "A"; // Shift + F6 - all occurrences change

        if (myBeautifulLittlePony.equals("A")) {
            System.out.println("A");
        } else if (myBeautifulLittlePony.equals("B")) {
            System.out.println("B");
        } else if (myBeautifulLittlePony.equals("C")) {
            System.out.println("C");
        } else if (myBeautifulLittlePony.equals("D")) {
            System.out.println("D");
        } else if (myBeautifulLittlePony.equals("E")) {
            System.out.println("E");
        } else if (myBeautifulLittlePony.equals("F")) {
            System.out.println("F");
        } else {
            System.out.println(myBeautifulLittlePony);
        }

        switch (myBeautifulLittlePony) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            case "D":
                System.out.println("D");
                break;
            case "E":
                System.out.println("E");
                break;
            case "F":
                System.out.println("F");
                break;
            default:
                System.out.println(myBeautifulLittlePony);
        }
    }
}
