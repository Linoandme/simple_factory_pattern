import operate.*;
/*
* 简单工厂类
* */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation ope=null;
        switch (operate){
            case "+":ope = new OperationAdd();break;
            case "-":ope=new OperationSub();break;
            case "*":ope=new OperationMul();break;
            case "/":ope=new OperationDiv();break;
        }
        return ope;
    }
}
