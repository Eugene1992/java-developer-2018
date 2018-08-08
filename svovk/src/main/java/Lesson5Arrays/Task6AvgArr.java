package Lesson5Arrays;

//6. Найти среднеарифметическое всех чисел массива.


public class Task6AvgArr {
    public static void main(String[] args) {
        int[] avgNumbers = {1, 3, 5, 7, 8, 8, 5, 4, 8, 9, 6};
        int avg = getAvgNumbers(avgNumbers);
        System.out.println("Average numbers of array is : " + avg);
        int sum = SumNumbers(avgNumbers);
        System.out.println("Sum of all elements is :   " + sum);
        int min = Min(avgNumbers);
        System.out.println("Minumum number is   " + min);
        int max = Max(avgNumbers);
        System.out.println("Maximum number is -" + max);
    }

    public static int getAvgNumbers(int[] avgNumbers) {
        int sum = 0;
        int avg1 = 0;
        for (int numbers : avgNumbers) {
            sum = sum + numbers;
            avg1 = sum / avgNumbers.length;
        }

        return avg1;

    }

    public static int SumNumbers(int[] avgNumbers) {
        int sum = 0;
        for (int i = 0; i < avgNumbers.length; i++) {
            int numbers = avgNumbers[i];
            sum = sum + numbers;

        }
        return sum;

    }

    public static int Min(int[] avgNumbers) {
        int min = avgNumbers[0];
        for (int numbers : avgNumbers)
            if (avgNumbers[0] > 0) {
                avgNumbers[0] = min;
            }
        return min;
    }

    public static int Max(int[] avgNumbers) {
        int max = avgNumbers[0];
        for (int i = 0; i < avgNumbers.length; i++) {
            if (avgNumbers[i] < max) {
                max = avgNumbers[i];
            }
        }
        return max;
    }

}

