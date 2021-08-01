package Pack1;

import java.util.Scanner;

public class TestQa {
	public static void main(String[] args) {
		Qa anyTester=new Qa();
	/*	anyTester.drink();
		anyTester.run();
		anyTester.sleep();
		anyTester.flooding(); */
		 
		Scanner requestTasks=new Scanner(System.in);
		String arrayOfTasks[]=new String[3];
		for (int i=0;i<arrayOfTasks.length;i++) {	
		System.out.println("Give me task");
		arrayOfTasks[i]= requestTasks.nextLine();
		String offCicle="No";
		if (arrayOfTasks[i].equals(offCicle)) {
			arrayOfTasks[i]=null;
			break;
		}
		}
		
		anyTester.testing(arrayOfTasks[0],arrayOfTasks[1],arrayOfTasks[2]);
		anyTester.drinkCoffee();
	}

}
