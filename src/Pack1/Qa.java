package Pack1;

public class Qa extends People {
	/**
	 * @param first
	 * @param second
	 * @param third
	 */
	
		 
	public void testing(String first, String second, String third) {
		if(third==null) {
			if(second==null) {
				if(first==null) {
					System.out.println("ok, go coffee");
				}
				else {
				System.out.println("the task was received: "+first);
				}
			}
			else {
				System.out.println("two task was received: "+first+" and "+second);
			}
		}
		else {
			System.out.println("the task was received: "+first+" and "+second+" and "+third);
		}
	
	}
	
	public void flooding() {
		System.out.println("тостер ушел искать смешные картинки");
	
	}
	
	@Override
	public void drinkCoffee() {
		System.out.println("I drink very much coffee");
	}


}
