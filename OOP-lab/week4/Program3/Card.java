import java.util.Scanner;

public class Card{
	private int rank;
	private String suit;
	
	//Parameterized Constructor
	Card(int r , String s){
		rank=r;
		suit=s;
	}
	
	 String getSuit(){
	 
	 	return suit;	
	}
	
	int getRank(){
	
		return rank;
	}
}

class CardTester{

	public static void main(String args[]){
		Card q[] = new Card[5];
		Scanner sc= new Scanner(System.in);
		int rankCount[]={0,0,0,0,0};
		int i=0;
		for( i = 0; i <5; i++){
			int re =0;
			String si;
			re=sc.nextInt();
			
			si=sc.nextLine();
			q[i]= new Card(re,si);
				
		}
		
		for( i =0; i <5; i++){
			int rank=q[i].getRank();
			for(int j=0; j<5;j++){
				if(rank==q[j].getRank())
					rankCount[i]++;
			}
				
		}
		for(i=0; i<5;i++){
			if(rankCount[i]==2||rankCount[i]==3)
				continue;
			else
				break;
		}
		if(i ==5){
			System.out.println("Full House");
		}
		else{
			System.out.println("Not a Full House");
		}	
	}

}
