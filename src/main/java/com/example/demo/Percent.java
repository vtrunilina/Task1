package com.example.demo;

public class Percent {
    private double Calc;

    public double getCalc() {
        return Calc;
    }

    public void setCalc(double calc) {
        Calc = calc;
    }

    public Percent()
    {
        Calc=0.0;
    }

    public double countPr(double sum, int pr) // возвращает значение заданного % pr от суммы sum
    {
        return sum*pr/100;
    }
    public double countSum(double sum, int pr) //  возвращает значение итоговой сумм с  учетом заданного % pr от суммы sum
    {
        return countPr(sum,pr);
    }



    public int countSumTrunc(double sum, int pr) // округленного до ближ целого значения итоговой суммы заданного % pr от суммы sum
    {
        setCalc((int)Math.round(countSum(sum,pr)));
        return (int)Math.round(countSum(sum, pr));
    }

    @Override
    public String toString() {
        return Calc + " рублей";
    }
}
