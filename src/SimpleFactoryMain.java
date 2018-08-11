import java.io.Console;
import java.util.Scanner;

public class SimpleFactoryMain {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("输入第一个数：");
            double num1=sc.nextInt();

            System.out.println("输入运算符：");
            String operate = sc.next();
            System.out.println("输入第二个数：");
            double num2 = sc.nextInt();
            double result = Operation.GetResult(num1,num2,operate);
            System.out.println("结果是："+result);
        }catch (Exception e){
            System.out.print("你输入的有误："+e.getMessage());

        }
    }

}
