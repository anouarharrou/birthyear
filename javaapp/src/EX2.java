import java.time.Year;
import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		
		double age;
		int year;
		System.out.println("Merci de Donnez votre age :");
		
		Scanner sc=new Scanner(System.in);
		age =sc.nextDouble();
		
		 year=(int) ((year = Year.now().getValue())-age);
		
		System.out.println("Votre annee de naissance est :"+year);
		
		

	}

}
