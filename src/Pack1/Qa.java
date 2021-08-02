package Pack1;

public class Qa extends People {
	/**
	 * @param first
	 * @param second
	 * @param third
	 */
	
		 
	public void testing(String first, String second, String third) {
			System.out.println("the task was received: "+first+" and "+second+" and "+third);
		
	}
	
	public void testing(String first, String second) {
		System.out.println("the task was received: "+first+" and "+second);
	
}
	
	public void testing(String first) {
		System.out.println("the task was received: "+first);
	
}
	
	public void flooding() {
		System.out.println("тостер ушел искать смешные картинки");
	
	}
	
	@Override
	public void drinkCoffee() {
		System.out.println("I drink very much coffee");
	}


}
