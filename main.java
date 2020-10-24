import java.util.*;
class Main{
	
	public static void main(String []args) throws InterruptedException{
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int num = rand.nextInt(100);
	int chances=rand.nextInt(11);
	System.out.println("Setting up the game for you!!!.... Please Wait!!!!!");
	Thread.sleep(3000);
	System.out.println("Game is Ready to be Played\n");
	guess g;
	if(chances!=0){
		g = new guess(num,chances);
	}
	else{
		g = new guess(num,rand.nextInt(11));
	}
	g.guessed();
	
	}	
}
