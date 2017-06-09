
public class zadacha23 {

	 public static void main(String[] args) {
		 
	        int i = 1;
	        int a = 1;
	        while (i <= 9) {
	            a = 1;
	            while (a <= 9) {
	                if (a >= i) {
	                    System.out.print(i + "*" + a + "; ");
	                }
	                a++;
	            }
	            i++;
	            System.out.println("");
	        }
	 
	    }
}
