package operate;
/*
* 减法运算
* */
public class OperationSub extends Operation {
    @Override
    public double GetResult() {
        return getNum1()-getNum2();
    }
}
