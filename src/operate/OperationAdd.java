package operate;
/*
* 加法运算
* */
public class OperationAdd extends Operation {
    @Override
    public double GetResult(){
        double result=getNum1()+getNum2();
        return result;
    }
}
