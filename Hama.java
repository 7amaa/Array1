import java.util.Scanner;
import java.util.Arrays;

public class Hama{

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Hello, How many letters do your name consists of?");

			int x = scanner.nextInt();

			char[] name = new char[x];

			System.out.println("Please write the letters of your name:");

			int i;

			for( i=0 ; i<name.length ; i++ ){

				char y = scanner.next().charAt(0);

				name[i]=y;



				}

			System.out.print("Your name is: ");

			for(i=0;i<x;i++){

				System.out.print(name[i]);
				}

				System.out.println();
		}

}
