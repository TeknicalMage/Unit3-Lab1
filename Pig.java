import java.util.Scanner;

public class Pig {
	//Calling on the Number Cube Methods for Rolls
	public static NumberCube dice1 = new NumberCube();
	public static NumberCube dice2 = new NumberCube();
	//Points for Player 1 and 2
	public static int point1 = 0;
	public static int point2 = 0;
	
	public Pig() {
		main();

	}
	
	public void main() {
		game();
	}
	
	public static void game() {
			player1();
			
		}
	
	public static void player1() {
		System.out.println("Player 1");
		System.out.println("Type 'roll' to Roll or 'pass' to Pass");
		Scanner input = new Scanner(System.in);
		String roll = ("roll");
		String pass = ("pass");
		String a = input.nextLine();
		if(a.equals(roll)) {
			int i = dice1.roll();
			int j = dice2.roll();
	        System.out.println("Your rolled " + i +" and " + j);
	        //System.out.println(i + " " + j);
	        if ((i == 1) && (j == 1)){
	            point1 = point1 + 25;
	            System.out.println("Player 1 Score is " + point1);
	    		player2();

	        }else if(i == j) {
	            point1 = point1 + i * 4;
	            System.out.println("Player 1 Score is " + point1);
	    		player2();

	        }else if((i == 1)||(j ==1)){
	            point1 = 0;
	            System.out.println("Player 1 Score is " + point1);
	    		player2();

	        }else{
	            point1 = point1 + i + j;
	            System.out.println("Player 1 Score is " + point1);
	    		player2();

			
		}
	}else if(a.equals(pass)) {
		player2();
	}
	else {
		System.out.println("Command Did not work please Try again");
		player1();
	}
}
	public static void player2() { 
		System.out.println("Player 2");
		System.out.println("Type 'roll' to Roll or 'pass' to Pass");
		Scanner input = new Scanner(System.in);
		String roll = ("roll");
		String pass = ("pass");
		String a = input.nextLine();
		if(a.equals(roll)) {
			int i = dice1.roll();
			int j = dice2.roll();
	        System.out.println("Your rolled " + i +" and " + j);
	        //System.out.println(i + " " + j);
	        if ((i == 1) && (j == 1)){
	            point2 = point2 + 25;
	            System.out.println("Player 2 Score is " + point2);
	            bar();
	            quit();

	        }else if(i == j) {
	            point2 = point2 + i * 4;
	            System.out.println("Player 2 Score is " + point2);
	            bar();
	            quit();

	        }else if((i == 1)||(j ==1)){
	            point2 = 0;
	            System.out.println("Player 2 Score is " + point2);
	            bar();
	            quit();

	        }else{
	            point2 = point2 + i + j;
	            System.out.println("Player 2 Score is " + point2);
	            bar();
	            quit();
	        }
		}else if(a.equals(pass)) {
			player1();
			
		}else {
			System.out.println("Incorrect Command Try again plz");
			player2();
		}
			
			
	}
	
	public static void quit() {
		System.out.println("Type 'yes' to Keep playing and 'no' to Stop");
		Scanner input = new Scanner(System.in);
		String yes = ("yes");
		String no = ("no");
		String a = input.nextLine();
		if(a.equals(yes)) {
            bar();
			player1();
		}else if(a.equals(no)) {
			System.exit(0);
		}else {
			System.out.println("Try Again plz");
			quit();
		}
		
	}
	public static void bar() {
			System.out.println("[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]");
	}
	
	
	public static void main(String[] args) {
		new Pig();
	}
}
