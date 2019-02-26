package basics;

//Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz" 
//instead of the number and for the multiples of '5' print "Buzz".
//Print fizz buzz if the number is divisible by both 3 and 5
public class FizzBuzz {

	public static void main(String[] args) {

		for(int i=1;i<=100;i++) {

			if (i%15==0) {
				System.out.println("fizz buzz"+i);
			}
			else if(i%3==0)
			{
				System.out.println("fizz"+i);
			}
			else if(i%5==0) {
				System.out.println("buzz"+i);
			}
			else {
				System.out.println(i);
			}
		}
	}



}
