import java.util.Scanner;

public class zadacha7 {
  public static void main(String[] args) {
//	  Започвайки от 3, да се изведат на екрана първите n
//	  числа които се делят на 3. Числата да са разделени със запетая.
	  Scanner sc= new Scanner(System.in);
	   System.out.println("Enter n:");
	   int n=sc.nextInt();
	   int first=3;
	  for(int i=1;i<=n;i++){
		  System.out.println(first);
		first+=3;
	  }
	  sc.close();
}
}
