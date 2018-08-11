public class Operation {
    public static double GetResult(double num1,double num2,String operate){
        double result = 0;
        switch (operate){
            case "+":result =num1+num2;break;
            case "-":result=num1-num2;break;
            case "/":result =num1/num2;break;
            case "*":result=num1*num2;break;

        }
        return result;
    }
}
