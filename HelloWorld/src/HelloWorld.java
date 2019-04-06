
import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String args[])
	{
		int sum=0,a=0,b=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		System.out.println(a +"\n "+ b);
		for (int i=0;i<n; ++i)
		{		
			
				sum=a+b;
				if(sum<n){
				System.out.println(sum );
				}
				a=b;
				b=sum;
			
		}
		s.close();
	}

}
