package first_pckg;

public class EmployeeTask {
    public static void main(String[] args) {
        String[] nameArray = {"Rick", "Carl", "Erick"};
        int[] agaAraay = {25, 26, 19};
        int[] salaryArray = {10000, 15000, 9000};

        System.out.println(nameArray[getEmployeeWithBiggestSalary(salaryArray)] + " has the biggest salary.");
    }

    static int getEmployeeWithBiggestSalary(int[] salaries) {
        int max = salaries[0], maxIndex = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
