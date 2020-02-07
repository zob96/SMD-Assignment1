public class ProjectManager extends Employee {


    private ManagerBenefits managerBenefits;



    public ProjectManager(int hours)
    {
        this.noOfHours= hours;
        this.hourlyPay= 2000;
        managerBenefits = new ManagerBenefits();

    }


    @Override
    public void calculatePay() {

        Calculatedpay=(noOfHours*hourlyPay)+1000;

        System.out.println(Calculatedpay);
    }

    @Override
    public void printBenefits() {

        System.out.println("I am a Project manager. I have the following benefits:- ");

        for(int i=0; i< managerBenefits.basicBenefitsList.size(); i++)
        {
            System.out.println(managerBenefits.basicBenefitsList.get(i));
        }

        for(int i=0; i<managerBenefits.devBenefitsList.size(); i++)
    {
        System.out.println(managerBenefits.devBenefitsList.get(i));
    }


        for(int i=0; i< managerBenefits.managerBenefitsList.size(); i++)
        {
            System.out.println(managerBenefits.managerBenefitsList.get(i));
        }



    }
}
