import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task21 {
    public static void main(String[] args){
        Scanner scanNum=new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        Set<Integer> arrayNum=new HashSet<Integer>();
        for(int i=0;i<5;i++){
        arrayNum.add(scanNum.nextInt());}
        for (Integer out :arrayNum){
            System.out.println(out);
        }
        arrayNum.clear();
    }
}
