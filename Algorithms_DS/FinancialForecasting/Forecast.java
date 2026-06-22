public class Forecast {

    public static double futureValue(
            double amount,
            double growthRate,
            int years){


        if(years==0){

            return amount;
        }
        return futureValue(
                amount + (amount*growthRate),
                growthRate,
                years-1
        );

    }
    public static void main(String args[]){


        double initialAmount=10000;

        double growthRate=0.10;


        int years=5;



        double result =
        futureValue(
        initialAmount,
        growthRate,
        years);



        System.out.println(
        "Future Value: "+result
        );

    }

}