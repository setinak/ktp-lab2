public class Primes{
    public static boolean isPrime(int n)
        {
            for(int j = 2; j < n; j++){
                if(n % j == 0)
                return false;
            }
            return true;   
        }
    public static void main(String[] args){
        int n = 101;

        for(int i = 2; i < n; i++)
        {
            if (isPrime(i) == true)
            {
                System.out.println(i);
            }
        }
    }
}
