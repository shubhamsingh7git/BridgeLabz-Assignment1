package JavaMethods.Level2;

public class Q12 {
	 public static int[] generate4DigitRandomArray(int size) {
	        int[] arr = new int[size];
	        for (int i = 0; i < size; i++) {
	            arr[i] = 1000 + (int)(Math.random() * 9000); 
	        }
	        return arr;
	    }
	    public static double[] findAverageMinMax(int[] numbers) {
	        int min = numbers[0];
	        int max = numbers[0];
	        double sum = 0;

	        for (int n : numbers) {
	            min = Math.min(min, n);
	            max = Math.max(max, n);
	            sum += n;
	        }

	        double avg = sum / numbers.length;
	        return new double[]{avg, min, max};
	    }

	    public static void main(String[] args) {
	        int size = 5;
	        int[] numbers = generate4DigitRandomArray(size);

	        System.out.print("Random numbers: ");
	        for (int n : numbers) System.out.print(n + " ");
	        System.out.println();

	        double[] result = findAverageMinMax(numbers);
	        System.out.println("Average: " + result[0]);
	        System.out.println("Minimum: " + result[1]);
	        System.out.println("Maximum: " + result[2]);
	    }

}
