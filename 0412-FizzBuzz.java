public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBussList = new ArrayList<>();
        for(int i = 1, fizz = 0, buzz = 0; i <= n; i++){
            fizz++;
            buzz++;
            if(fizz == 3 && buzz == 5){
                fizzBussList.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if(fizz == 3) {
                fizzBussList.add("Fizz");
                fizz = 0;
            } else if(buzz == 5){
                fizzBussList.add("Buzz");
                buzz = 0;
            } else {
                fizzBussList.add(String.valueOf(i));
            }
        }
        return fizzBussList;
    }
}
