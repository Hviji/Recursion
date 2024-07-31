public class nprime 
{
      public static void main(String[] args) 
      {
        int n = 10; 
        generateFirstnPrimes(n);
    }

    public static void generateFirstnPrimes(int n) 
    {
        int count = 0;
        int number = 2; 

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) 
        return false;

        for (int i = 2; i * i <= num; i++) 
        {
         
            if (num % i == 0) return false; 
        }
        return true;
    }
}



