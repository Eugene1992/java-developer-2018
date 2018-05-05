public class Main {
    public static void main(String[] args) {
        System.out.println(calcMaxEmploee("Ivan", 24, 3500, "Fedor", 22, 4500, "Petro", 33, 15000));

    }

    static int calcMaxEmploee(String nameFirst, int ageFirst, int salaryFirst, String nameSecond, int ageSecond, int salarySecond, String nameThird, int ageThoird, int salatyThird) {
        if (salaryFirst > salarySecond & salaryFirst > salatyThird) {
            System.out.println(nameFirst + "in" + ageFirst + "has max salary");
            return salaryFirst;
        } else if (salarySecond > salaryFirst & salarySecond > salatyThird) {
            return salarySecond;
        } else if (salatyThird > salarySecond & salatyThird > salaryFirst) {
            System.out.println(nameThird + "in" + ageThoird + "has max salary");
            return salatyThird;
        }
        return -1;
    }
}
