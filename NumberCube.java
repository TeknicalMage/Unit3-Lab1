import java.util.Random; 
public class NumberCube {
	
	private int value;
	
	public NumberCube(){
		value = 0;
	//	roll();
		//System.out.print(value);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int roll() {
		Random rnd = new Random();
		value = rnd.nextInt(6) + 1;
		return value;
	}

	public static void main(String[] args) {
		new NumberCube();
	}
}
