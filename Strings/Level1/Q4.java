package Strings.Level1;

public class Q4 {
	 public static void generateException() {
	        String text = null;
	        System.out.println(text.length()); 
	    }

	    public static void handleException() {
	        try {
	            String text = null;
	            System.out.println(text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Handled NullPointerException: " + e);
	        }
	    }

	    public static void main(String[] args) {
	      
	        handleException();
	    }

}
