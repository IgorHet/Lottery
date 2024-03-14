 import java.util.Arrays;
import java.util.Random;

    public class Lottery {
        public static void main(String[] args) {
            // Створюємо два масиви розміром 7 для зберігання чисел лотереї та чисел, які вгадав гравець
            int[] lotteryNumbers = new int[7];
            int[] playerNumbers = new int[7];

            // Заповнюємо обидва масиви випадковими числами
            fillArrayWithRandomNumbers(lotteryNumbers);
            fillArrayWithRandomNumbers(playerNumbers);

            // Сортуємо обидва масиви за зростанням
            Arrays.sort(lotteryNumbers);
            Arrays.sort(playerNumbers);

            // Виводимо відсортовані масиви
            System.out.println(Arrays.toString(lotteryNumbers));
            System.out.println(Arrays.toString(playerNumbers));

            // Знаходимо кількість збігів
            int matches = countMatches(lotteryNumbers, playerNumbers);
            System.out.println("Кількість збігів: " + matches);
        }

        // Метод для заповнення масиву випадковими числами від 0 до 9
        public static void fillArrayWithRandomNumbers(int[] array) {
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10); // Генеруємо випадкове число від 0 до 9
            }
        }

        // Метод для підрахунку кількості збігів між двома масивами
        public static int countMatches(int[] array1, int[] array2) {
            int matches = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    matches++;
                }
            }
            return matches;
        }
    }