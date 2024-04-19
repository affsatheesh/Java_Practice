package test;

public class PrimeNumber {

		
		public static void main(String[] args) {
			
			int n = 41;
			System.out.println(isPrime(n));
			
		}

		public static boolean isPrime(int n)
		{
			if(n==0 || n==1)
			{
				return false;
			}
			if(n==2)
			{
				return true;
			}
			
			for(int i=2;i<=n/2;i++)
			{
				if(n%10==0)
				{
				   return false;
				}
			}
			
			
			return true;
		}
		
}
