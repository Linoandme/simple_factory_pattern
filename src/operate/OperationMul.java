package operate;
/*
* 乘法运算
* */
public class OperationMul extends Operation {
    @Override
    public double GetResult() {
        return getNum1()*getNum2();
    }
}
