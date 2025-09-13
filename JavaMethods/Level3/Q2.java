package JavaMethods.Level3;

public class Q2 {
	public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int n) {
        return storeDigits(n)[0] != 0;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = storeDigits(n);
        int sum = 0;
        int len = digits.length;
        for (int d : digits) sum += Math.pow(d, len);
        return sum == n;
    }

    public static int[] largestAndSecondLargest(int n) {
        int[] digits = storeDigits(n);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) secondLargest = d;
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int n) {
        int[] digits = storeDigits(n);
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) secondSmallest = d;
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // example number
        System.out.println("Digits: " + java.util.Arrays.toString(storeDigits(number)));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong: " + isArmstrong(number));
        System.out.println("Largest & Second Largest: " + java.util.Arrays.toString(largestAndSecondLargest(number)));
        System.out.println("Smallest & Second Smallest: " + java.util.Arrays.toString(smallestAndSecondSmallest(number)));
    }

}
