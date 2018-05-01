package first_pckg;


public class HomeworkMethods {

    static void luckyTickets() {
		/*
		 * 1. Счастливые билетики. Есть билеты с номерами от 000001 до 999999.
		 * «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна
		 * сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
		 * 567576. С помощью программы, подсчитайте сколько счастливых билетов.
		 */
		int count = 0;
		int leftSide, rightSide, leftSum, rightSum;
        for (int i = 1; i < 1000000; i++) {
			leftSum = 0;
			rightSum = 0;
			leftSide = i / 1000;
			rightSide = i % 1000;
			while (leftSide != 0) {
				leftSum += leftSide % 10;
				leftSide /= 10;
			}
			while (rightSide != 0) {
				rightSum += rightSide % 10;
				rightSide /= 10;
			}

			if (leftSum == rightSum) {
				count++;
                System.out.println("Lucky ticket #" + i / 1000 + " " + (((i % 1000) < 10) ? ((i % 1000) * 100)
						: ((i % 1000) < 100) ? ((i % 1000) * 10) : (i % 1000)));
			}
		}
		System.out.println("Amount: " + count);
	}

    static void symmetricalTime() {
		/*
		 * 2. Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать
		 * сколько раз за сутки случается так, что слева от двоеточия показывается
		 * симметричная комбинация для той, что справа от двоеточия (например, 02:20,
		 * 11:11 или 15:51).
		 */
		int count = 0;
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				int leftSide = i;
				int rightSide = j;
				int leftRes = 0, rightRes = 0;
				while (leftSide != 0) {
					leftRes *= 10;
					leftRes += leftSide % 10;
					leftSide /= 10;
				}
				while (rightSide != 0) {
					rightRes *= 10;
					rightRes += rightSide % 10;
					rightSide /= 10;
				}
				//is 06:60 okay???
				if (i == rightRes && leftRes == j && ((j*10)>99||(j*10)<59)) {
					count++;
					System.out.println("Time -- " + ((i < 10) ? ("0" + i) : i) + ":" + ((j < 10) ? (j + "0") : j));
				}
			}
		}
		System.out.println("Amount: " + count);
	}

    static void unluckyThirteen() {
		//3. Не счастливые номера. Есть 999999 номерных знаков, подсчитать количество знаков содержащих число 13 и вывести их все в консоль
        int left, right;
		int num, count = 0;
        for (int i = 0; i < 1000000; i++) {
			num = i;
			while (num != 0) {
				right = num % 10;
				num /= 10;
				left = num % 10;
				if (((left*10)+right)==13) {
					count++;
					System.out.println(i + " have 13");
				}
			}
		}
		System.out.println("Amount: " + count);
	}
	
	public static void main(String[] args) {
		luckyTickets();

		symmetricalTime();
		
		unluckyThirteen();
	}

}
