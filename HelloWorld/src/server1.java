import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class server1 {
	
	public static void main(String args[]) throws IOException{
		
		int num, temp;
		ServerSocket s1=new ServerSocket(8082);
		System.out.println("Server's Ready ");
		Socket ss=s1.accept();
		Scanner sc=new Scanner(ss.getInputStream());
		num = sc.nextInt();
		
		temp=num*2;
		PrintStream p=new PrintStream(ss.getOutputStream());
		p.println(temp);
		
		
	}

}
