package practiseweek9;
import java.util.regex.*;
import java.util.*;
import java.util.StringTokenizer;
public class Q2 {
	static void replace(String s1,String s2) {
		String regex="["+s2+"]";
		s1=s1.replaceAll(regex,"");
		System.out.println(s1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First String");
		String fs=sc.nextLine();
		System.out.println("second String");
		String ss=sc.nextLine();
		replace(fs,ss);	
	}
}
