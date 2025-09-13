package JavaMethods.Level3;

public class Q3 {
	public static int countDigits(int n) { return String.valueOf(n).length(); }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        for (int d : storeDigits(n)) sum += d;
        return sum;
    }

    public static int sumSquaresDigits(int n) {
        int sum = 0;
        for (int d : storeDigits(n)) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] digits = storeDigits(n);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        System.out.println("Digits: " + java.util.Arrays.toString(storeDigits(number)));
        System.out.println("Sum: " + sumDigits(number));
        System.out.println("Sum of squares: " + sumSquaresDigits(number));
        System.out.println("Is Harshad: " + isHarshad(number));
        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(number);
        for (int i = 0; i < 10; i++)
            if (freq[i][1] != 0) System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }

}
