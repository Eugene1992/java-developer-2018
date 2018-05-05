package first_pckg;

public class EmployeeTask {
    static int getEmployeeWithBiggestSalary(int[] array) {
        int max = array[0], maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        String[] nameArray = {"Rick", "Carl", "Erick"};
        int[] agaAraay = {25, 26, 19};
        int[] salaryArray = {10000, 15000, 9000};

        System.out.println(nameArray[getEmployeeWithBiggestSalary(salaryArray)] + " has the biggest salary.");
    }
}
