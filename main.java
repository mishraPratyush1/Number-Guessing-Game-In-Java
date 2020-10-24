import java.util.*;
class Main{
	
	public static void main(String []args) throws InterruptedException{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number which you want the user to guess");
	int num=sc.nextInt();
	System.out.println("Enter the No of chances Allowed");
	int chances=sc.nextInt();
	System.out.println("Setting up the game for you!!!.... Please Wait!!!!!");
	Thread.sleep(3000);
	System.out.println("Game is Ready to be Played\n");
	guess g = new guess(num,chances);
	g.guessed();

	
	}	
}

