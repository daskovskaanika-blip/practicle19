import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

 public class main {


    static void bubbleSortUp(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void bubbleSortDown(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("введіть розмір масиву: ");
        int size = scanner.nextInt();

        System.out.print("від якого числа генерувати: ");
        int from = scanner.nextInt();

        System.out.print("до якого числа генерувати: ");
        int to = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(from, to + 1);
        }

        System.out.println("\nмасив до сортування:");
        System.out.println(Arrays.toString(array));

        System.out.println("\n1 - за зростанням");
        System.out.println("2 - за спаданням");
        System.out.print("ваш вибір: ");

        int choice = scanner.nextInt();

        LocalTime start = LocalTime.now();

        if (choice == 1) {
            bubbleSortUp(array);
        } else {
            bubbleSortDown(array);
        }

        LocalTime finish = LocalTime.now();

        Duration time = Duration.between(start, finish);

        System.out.println("\nмасив після сортування:");
        System.out.println(Arrays.toString(array));

        System.out.println("\nбуло відсортовано " + size + " елементів за:");
        System.out.println(time.toMillis() + " мс");
        System.out.println(time.toNanos() + " нс");
    }
}