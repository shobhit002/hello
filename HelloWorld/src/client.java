import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	
	public static void main (String arg[]) throws UnknownHostException, IOException{
		
		int number, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Type a number: ");
		number = sc.nextInt();
		
		Socket s=new Socket("127.0.0.1",8082);
		PrintStream p=new PrintStream(s.getOutputStream());
		p.println(number);
		
		Scanner sc1=new Scanner(s.getInputStream());
		temp = sc1.nextInt();
		System.out.println(temp);
		System.out.println("Server's Down!");
	}

}

