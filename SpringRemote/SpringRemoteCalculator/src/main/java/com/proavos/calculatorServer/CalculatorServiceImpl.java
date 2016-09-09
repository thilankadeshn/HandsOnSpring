package com.proavos.calculatorServer;

/**
 * Created by thilanka on 12/5/15.
 */

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int getSum(int a, int b){
        return (a+b);
    }
}
