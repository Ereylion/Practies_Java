package Pr_16;
import java.util.Scanner;
// Добавление блока finally
public class Exception4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Exception happened!");
        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Exception4 e4 = new Exception4();
        e4.exceptionDemo();
    }
}
