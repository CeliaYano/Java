public class Main {

    public static void main(String[] args) {
       System.out.println("The following are numbers form 1 to 100;\n");

        for(int i = 1; i<=100; i++){

            boolean isPrime = false;
            int temp;

            if((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz.\t");
            }else if(i%5 == 0){
                System.out.println("Buzz.\t");
            }else if(i%3 == 0){
                System.out.println("Fizz.\t");
            }
            else if(isPrime){
                for(int j = 2; j<=i/2; j++){
                    temp=i/j;
                    if(temp != 0){
                        isPrime = true;
                        System.out.print("Prime. \t");
                        break;
                    }
                }
            }
            else{
                System.out.print(i+"\t");
            }
        }

    }
}
