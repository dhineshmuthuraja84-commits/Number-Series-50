import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int last = n%10;
		while(n>=10){
		    n/=10;
		}
		int first = n;
		System.out.println("First:"+ first);
		System.out.print("Last:"+ last);
	}
}
