import java.util.Scanner;

public class Mastermind {
	public static void main(String[]args){
		Scanner input= new Scanner(System.in); 
		
		System.out.println("Player one please enter your name: ");
		String name1 = input.nextLine();
		
		System.out.println("Player two please enter your name: ");
		String name2 = input.nextLine();
		
		System.out.println(name1 + " please enter an integer between 1 and 9: ");
		int red1 = input.nextInt();
		
		System.out.println(name1 + " please enter another integer between 1 and 9: ");
		int yellow1 = input.nextInt();
		
		System.out.println(name1 + " please enter another integer between 1 and 9: ");
		int blue1 = input.nextInt();
		
		System.out.println(name1 + " please enter another integer between 1 and 9: ");
		int green1 = input.nextInt();
		
		int x;
		x = 1;
		while(x < 13)
		{
			System.out.println(name2 + " please guess the first integer: ");
			int red2 = input.nextInt();
			
			System.out.println(name2 + " please guess the second integer: ");
			int yellow2 = input.nextInt();
			
			System.out.println(name2 + " please guess the third integer: ");
			int blue2 = input.nextInt();
			
			System.out.println(name2 + " please guess the fourth integer: ");
			int green2 = input.nextInt();
			
			String response = "";          
            

			if(red1 == red2){
				double randNum1 = Math.random();
				if (randNum1 >= 0.5){
	                response = response + "✓";
	            }else{
	                response = "✓" + response;}
				}
			else{ 
				double randNum1 = Math.random();
				if (randNum1 >= 0.5){
                response = response + "✗";
				}else{
                response = "✗" + response;
                }
			}
			
			
			if(yellow1 == yellow2){
				double randNum2 = Math.random();
				if (randNum2 >= 0.5){
	                response = response + "✓";
	            }else{
	                response = "✓" + response;}
				}
			else{ 
				double randNum2 = Math.random();
				if (randNum2 >= 0.5){
                response = response + "✗";
				}else{
                response = "✗" + response;
                }
			}

			
			if(blue1 == blue2){
				double randNum3 = Math.random();
				if (randNum3 >= 0.5){
	                response = response + "✓";
	            }else{
	                response = "✓" + response;}
				}
			else{ 
				double randNum3 = Math.random();
				if (randNum3 >= 0.5){
                response = response + "✗";
				}else{
                response = "✗" + response;
                }
			}
			
			
			if(green1 == green2){
				double randNum4 = Math.random();
				if (randNum4 >= 0.5){
	                response = response + "✓";
	            }else{
	                response = "✓" + response;
	                }
				}
			else{ 
				double randNum4 = Math.random();
				if (randNum4 >= 0.5){
                response = response + "✗";
				}else{
                response = "✗" + response;
                }
			System.out.println(response);
			
            }
			
			if((green1 == green2) && (blue1 == blue2) && (yellow1 == yellow2) && (red1 == red2)){
				System.out.println("Congragulations " + name2 + " you win!!!!!!!!!!");
				break;
			}
				
			if(x == 12){
				System.out.println("Congragulations " + name1 + " you win!!!!!!!!!!!");
			}
			
			x++;
		}
		
		input.close();

		
	}
}
