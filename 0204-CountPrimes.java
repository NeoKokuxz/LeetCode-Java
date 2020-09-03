class Solution {
    //What is prime number?
    // 2 3 5 7 etc
    // A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.
    public int countPrimes(int n) {
        boolean [] primes = new boolean[n]; //Set false to everything
        for(int i = 2; i * i < primes.length; i++){
            if(!primes[i]){
                for( int j = i; j * i < primes.length; j++){
                    primes[i * j] = true; //True - not prime
                }
            }
        }

        int primeCount = 0;
        for(int i = 2; i < primes.length; i++){
            //Count how many false in the primes array
            if(!primes[i]){
                primeCount++;
            }
        }
        return primeCount;
    }
}
