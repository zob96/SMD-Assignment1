public class Intern extends Employee {



    protected BasicBenefits internBenifits;

    public Intern(int hours)
    {
        this.noOfHours= hours;
        this.hourlyPay= 500;
        internBenifits= new BasicBenefits();
    }


    @Override
    public void calculatePay() {

        Calculatedpay=(noOfHours*hourlyPay)+0;
        System.out.println(Calculatedpay);

    }

    @Override
    public void printBenefits() {

        System.out.println("I am and Intern. I have the following benefits:- ");

        for(int i=0; i< internBenifits.basicBenefitsList.size(); i++)
        {
            System.out.println(internBenifits.basicBenefitsList.get(i));
        }

    }


}
