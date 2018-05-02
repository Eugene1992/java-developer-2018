package first_pckg;

import java.util.Arrays;
import java.util.Random;

public class HomeworkArrays {

    static void firstTask(int[] arr) {
        //1. Вывести в консоль все парные числа одномерного массива.
        System.out.println("Even elements:");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void secondTask(int[] arr) {
        //2. Вывести все числа одномерного массива в обратном порядке.
        System.out.println("Reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void thirdAndFourthTasks(int[] arr) {
        //3. Вывести первую и вторую половину одномерного массива.
        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.
        System.out.println("First half:");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nReversed:");
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSecond half:");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nReversed:");
        for (int i = arr.length - 1; i >= (arr.length / 2); i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void fifthAndSixthTask(int[] arr) {
        //5. Найти сумму всех элементов в массиве.
        //6. Найти среднеарифметическое всех чисел массива.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / arr.length);
    }

    static void seventhTask(int[] arr) {
        //7. Найти минимальное и максимальное число в массиве
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum = " + max + ", Minimum = " + min);
    }

    static void eighthTask(int[] arr) {
        //8. Заменить все отрицательные числа в массиве на 0.
        System.out.println("Every negative is ZERO:");
        for (int i : arr) {
            if (i < 0) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    static void ninethTask(int[] arr) {
        //9*. Подсчитать одинаковые и повторяющиеся числа в одномерном массиве.
        int count = 0;
        int n = 0;
        int buf = arr[0];
        int bufArray[] = new int[arr.length * 2];
        for (int i = 1; i < arr.length; i++) {
            inner:
            for (int j = i; j < arr.length; j++) {
                if (buf == arr[j]) {
                    for (int k = 0; k < bufArray.length; k++) {
                        if (buf == bufArray[k]) {
                            continue inner;
                        }
                    }
                    count++;
                }
            }
            bufArray[n] = buf;
            n++;
            buf = arr[i];
        }
        System.out.println("Dublicate amount: " + count);
    }

    static void tenthTask(int[] arr) {
        //10. Поменять минимальное и максимальное числа в массиве местами.
        int max = arr[0], min = arr[0], buf = 0, maxPosition = 0, minPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        buf = arr[maxPosition];
        arr[maxPosition] = arr[minPosition];
        arr[minPosition] = buf;
        System.out.println("Max & Min changed:");
        System.out.println(Arrays.toString(arr));
    }

    static void eleventhTask(int[] arr) {
        //11. Инвертировать массив.
        System.out.println("Elements inverted:");
        for (int i : arr) {
            System.out.print(-i + " ");
        }
    }

    static void twelfthTask(int[] arr) {
        //12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
        System.out.println("Half with biggest average:");
        int firstHalfSum = 0, secondHalfSum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            firstHalfSum += arr[i];
        }
        for (int i = arr.length - 1; i > arr.length / 2; i--) {
            secondHalfSum += arr[i];
        }
        if (firstHalfSum / (arr.length / 2) > secondHalfSum / (arr.length / 2)) {
            for (int i = 0; i < arr.length / 2; i++) {
                System.out.print(arr[i] + " ");
            }
        } else if (firstHalfSum / (arr.length / 2) < secondHalfSum / (arr.length / 2)) {
            for (int i = arr.length - 1; i > arr.length / 2; i--) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Halves averages are even to each other:\n" + Arrays.toString(arr));
        }
    }

    static void thirteenthTask(int[] arr) {
        //13. Найти сумму отрицательных чисел в одномерном массиве.
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                sum += i;
            }
        }
        System.out.println("\nSum of negative elements: " + sum);
    }

    static void fourteenthTask(int[] arr) {
        //14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        System.out.println("Elements to zero inclusive:");
        for (int i : arr) {
            System.out.print(i + " ");
            if (i == 0) {
                break;
            }
        }
    }

    static void fifteenthTask(int[] arr) {
        //15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
        int firstMax = arr[0], secondMax = arr[0], firstMaxPosition = 0, secondMaxPosition = 0, buf;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
                firstMaxPosition = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == firstMaxPosition) {
                continue;
            }
            if (arr[i] > secondMax) {
                secondMax = arr[i];
                secondMaxPosition = i;
            }
        }
        buf = arr[0];
        arr[0] = firstMax;
        arr[firstMaxPosition] = buf;
        buf = arr[arr.length - 1];
        arr[arr.length - 1] = secondMax;
        arr[secondMaxPosition] = buf;
        System.out.println("Two maximal elements replaced with first and last:\n" + Arrays.toString(arr));
    }

    static void sixteenthTask(int[] arr) {
        //16. Написать программу, которая выводит на экран элементы одномерного массива,
        // которые расположены до минимального элемента всего массива.
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Elements before min:");
        for (int i : arr) {
            if (i == min) {
                break;
            }
            System.out.print(i + " ");
        }
    }

    static void seventeenthTask(int[] arr) {
        //17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
        int max = arr[0], min = arr[0], buf = 0, maxPosition = 0, minPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        System.out.println("Elements between min & max:");
        for (int i = minPosition; i <= maxPosition; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void eighteenthTask(int[] arr) {
        //18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
        int min = arr[0], buf = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                buf = i;
            }
        }
        System.out.println("Half with minimum:");
        if (buf < (arr.length / 2)) {
            for (int i = 0; i < arr.length / 2; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = arr.length - 1; i > arr.length / 2; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void nineteenthTask(int[] arr, int a, int b) {
        //19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
        int buf = 0, point = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= a && arr[i] <= b) {
                buf = arr[point];
                arr[point] = arr[i];
                arr[i] = buf;
                point--;
            }
        }
        System.out.println("Elements between " + a + " & " + b + " in the end:\n" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20 - (-10)) - 10;
        }
        System.out.println("Created array:\n" + Arrays.toString(arr));

        System.out.println();
        firstTask(arr);

        System.out.println();
        secondTask(arr);

        System.out.println();
        thirdAndFourthTasks(arr);

        System.out.println();
        fifthAndSixthTask(arr);

        System.out.println();
        seventhTask(arr);

        System.out.println();
        eighthTask(arr);

        System.out.println();
        ninethTask(arr);

        System.out.println();
        tenthTask(arr);

        System.out.println();
        eleventhTask(arr);

        System.out.println();
        twelfthTask(arr);

        System.out.println();
        thirteenthTask(arr);

        System.out.println();
        fourteenthTask(new int[]{1, 2, 3, 7, 4, 8, 0, 9, 5, 6});

        System.out.println();
        fifteenthTask(arr);

        System.out.println();
        sixteenthTask(arr);

        System.out.println();
        seventhTask(arr);

        System.out.println();
        eighteenthTask(arr);

        System.out.println();
        nineteenthTask(arr, 0, 5);
    }
}
