public class Player {

	int number = 0;
	public void guess() {
	number = (int) (Math.random() * 10000);
	System.out.println("I think it's " + number);
	
}

}

