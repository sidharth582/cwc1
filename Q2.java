package practiseweek9;
import java.util.regex.*;
import java.util.*;
import java.util.StringTokenizer;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First String");
		String fs=sc.nextLine();
		System.out.println("second String");
		String ss=sc.nextLine();
		String regex="["+ss+"]";
		fs=fs.replaceAll(regex,"");
		System.out.println(fs);
	}
}
