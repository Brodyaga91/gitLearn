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
					System.out.println("�� � �����, ����� ���� ����");
				}
				else {
				System.out.println("�������� 1 �������: "+first);
				}
			}
			else {
				System.out.println("�������� 2 �������: "+first+" � "+second);
			}
		}
		else {
			System.out.println("�������� 3 �������: "+first+" � "+second+" � "+third);
		}
	
	}
	
	public void flooding() {
		System.out.println("������ ���� ������ ������� ��������");
	
	}
	
	@Override
	public void drinkCoffee() {
		System.out.println("� ��� ����� ����� ����");
	}


}
