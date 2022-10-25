import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TASK 1
        Scanner scanner = new Scanner(System.in);
/*        char n = 'n';
        String scanner2 = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < scanner2.length() - 1; i++) {
            if (scanner2.charAt(i) == n) count++;
        }
        System.out.println(count);*/

        //TASK2

        String scannerIndex2 = scanner.nextLine();
        char a = 'a';
        StringBuilder position = new StringBuilder();

        for (int i = 0; i < scannerIndex2.length(); i++) {
            if (scannerIndex2.charAt(i) == a) position.append(i);
        }
        char[] result = position.toString().toCharArray();
        System.out.println(Arrays.toString(result));

        //TASK3

        double scannerPow = scanner.nextDouble();
        double scannerPow2 = scanner.nextDouble();
        System.out.println(Math.pow(scannerPow, scannerPow2));

        //TASK4
        String input = scanner.nextLine();
        if (!input.equals(input.toLowerCase())) {
            System.out.println("All or some of provided letters are in uppercase");
            return;
        }
        Map<Character, Integer> letters = new HashMap<>();
        for (char i : input.toCharArray()) {
            letters.put(i, letters.getOrDefault(i, 0) + 1);
        }
        System.out.println(letters);

    }
}