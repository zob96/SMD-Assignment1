public class Developer extends Employee {


    DevBenefits devBenefits;


    public Developer(int hours)
    {
        this.noOfHours= hours; //no. of hours may vary.
        this.hourlyPay= 1000; //hourly pay is predefined.
        devBenefits= new DevBenefits();

    }







    @Override
    public void calculatePay() {

        Calculatedpay=(noOfHours*hourlyPay)+500;
        System.out.println(Calculatedpay);
    }

    @Override
    public void printBenefits() {

        System.out.println("I am developer. I have the following benefits:- ");

        for(int i=0; i< devBenefits.basicBenefitsList.size(); i++)
        {
            System.out.println(devBenefits.basicBenefitsList.get(i));
        }

        for(int i=0; i<devBenefits.devBenefitsList.size(); i++)
        {
        System.out.println(devBenefits.devBenefitsList.get(i));
        }



    }





}
