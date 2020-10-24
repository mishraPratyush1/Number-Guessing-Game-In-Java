import java.util.*;
class guess{
		int n,chances;
		int score=0;
		int total;
		public guess(int n,int chances){
			this.n=n;
			total=chances;
			this.chances=chances-1;
			
		}
		public void guessed() throws InterruptedException
		{
		
		Scanner sc = new Scanner(System.in);
		boolean guessed = false;
		Random rand = new Random();
		System.out.println("enter your guess ");
		int guess=sc.nextInt();
		while(this.total > 0 && this.chances>0)
		{
			System.out.println("You have "+chances+" chances left");
			if(guess > this.n){
				System.out.println("guess a bit lower");
				guess = sc.nextInt();
			}
			else if(guess < this.n){
				System.out.println("guess a bit higher");
				guess = sc.nextInt();
			}
			else if(guess == this.n){
				score+=((total)*100);
				System.out.println("\nYOOhoo the number was "+n+" you have guessed right!! at the "+(total-chances)+" guess");
				System.out.println("\nCalculating Score!!! Please Wait ");
				Thread.sleep(3000);
				System.out.println("\nYour Score is ");
				Thread.sleep(2000);
				System.out.print(this.score);
				guessed=true;
				break;
			}
			--chances;
			--total;
		} 
		if(!guessed){
			System.out.println("Analysing status!! please wait ");
			Thread.sleep(1200);
			System.out.println("Sorry mate!!! Better luck Next Time \n");
			for(int i=0;i<5;i++){
				System.out.print("\u2639"+" ");
				Thread.sleep(500);
			}
			System.out.println("\n\nRevealing the Number for you!!.... \n");
			Thread.sleep(2000);
			System.out.println("Almost There.... \n");
			Thread.sleep(1700);
			System.out.println("The Number was "+this.n);
			Thread.sleep(700);
			System.out.println("Score 0");

		}
	}

}
