package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {
	public static List<Integer> primes(int n){
		ArrayList<Integer> primestoN=new ArrayList<>();
		int count=0;
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(int i=1;i<=Math.sqrt(j);i++)
			{
				if(j%i==0)
				{
					count++;        
				}
			}
			if(count==1) {
				primestoN.add(j);
			}
		}
		return primestoN;
	}
	public static void primefactors(List<Integer> list, int s)
    {
        int y,n = (int)Math.pow(2, list.size());
        for (int i = 1; i < n; i++) {
        	y=i;
        	int x[] = new int[list.size()];
            int j = list.size() - 1;
            
            while (y > 0) {
                x[j] = y % 2;
                y = y / 2;
                j--;
            }
     
            int sum = 0;
            
            for (int k = 0; k < list.size(); k++)
                if (x[k] == 1)
                    sum = sum + list.get(k);

            if (sum == s) {
                System.out.print("{");
                for (int k = 0; k < list.size(); k++)
                    if (x[k] == 1) {
                    	System.out.print(list.get(k)+" ");
                    }
                System.out.println("}");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		List<Integer> l=primes(n);
//		System.out.println(l);
		primefactors(l,n);
		sc.close();
	}
}

