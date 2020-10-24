import java.util.*;
class guess{
		int n,chances;
		int total=chances;
		public guess(int n,int chances){
			this.n=n;
			this.chances=chances-1;
		}
		public void guessed() throws InterruptedException
		{
		Scanner sc = new Scanner(System.in);
		boolean guessed = false;
		
		System.out.println("enter your guess ");
		int guess=sc.nextInt();
		while(chances > 0)
		{
			System.out.println("You have "+chances+" chances left");
			if(guess > n){
				System.out.println("guess a bit lower");
				guess = sc.nextInt();
			}
			else if(guess < n){
				System.out.println("guess a bit higher");
				guess = sc.nextInt();
			}
			else if(guess == n){
				System.out.println("YOOhoo the number was "+n+" you have guessed right!! at the "+(total-chances)+" guess");
				guessed=true;
				break;
			}
			chances--;
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

		}
	}

}