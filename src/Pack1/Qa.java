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
					System.out.println("ну и ладно, пойду кофе пить");
				}
				else {
				System.out.println("Получено 1 задание: "+first);
				}
			}
			else {
				System.out.println("Получено 2 задания: "+first+" и "+second);
			}
		}
		else {
			System.out.println("Получено 3 задания: "+first+" и "+second+" и "+third);
		}
	
	}
	
	public void flooding() {
		System.out.println("тостер ушел искать смешные картинки");
	
	}
	
	@Override
	public void drinkCoffee() {
		System.out.println("Я пью очень много кофе");
	}


}
