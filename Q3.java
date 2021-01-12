package practiseweek9;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String t[]= {" ","M","MM","MMM"};
		String h[]= {" ","C","CC","CCC"};
		String ts[]= {" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String o[]= {" ","I","II","III","IV","V","VI","VII","VIII","IX"};
	    String et=t[num/1000];
	    String eh=h[(num%1000)/100];
	    String ets=ts[(num%100)/10];
	    String eo=o[(num%10)];
	    String g=et+eh+ets+eo;
	    System.out.print(g);

	}
}
