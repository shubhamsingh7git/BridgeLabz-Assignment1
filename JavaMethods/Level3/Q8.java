package JavaMethods.Level3;
import java.util.HashSet;
public class Q8 {
	public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); 
    }

    public static boolean checkUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();

        System.out.println("Generated OTPs: ");
        for (int otp : otps) System.out.println(otp);

        System.out.println("All OTPs Unique: " + checkUnique(otps));
    }

}
