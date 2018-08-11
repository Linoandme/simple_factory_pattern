import operate.Operation;
import java.util.Scanner;
/*
* 假设客户端
* */
public class SimpleFactoryMain {
    public static void main(String[] args){
        try{
            Operation ope;
            Scanner sc = new Scanner(System.in);
            System.out.println("输入第一个数：");
            double num1=sc.nextInt();
            System.out.println("输入运算符：");
            String operate = sc.next();
            ope=OperationFactory.createOperation(operate);
            System.out.println("输入第二个数：");
            double num2 = sc.nextInt();
            ope.setNum1(num1);
            ope.setNum2(num2);
            double result = ope.GetResult();
            System.out.println("结果是："+result);
        }catch (Exception e){
            System.out.print("你输入的有误："+e.getMessage());

        }
    }

}
