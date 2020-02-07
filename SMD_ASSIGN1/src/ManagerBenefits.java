import java.util.ArrayList;

public class ManagerBenefits extends DevBenefits {

   protected ArrayList<String> managerBenefitsList= new ArrayList<String>();


    public ManagerBenefits()
    {

        devBenefitsList.add("Vacation Benifits");
        devBenefitsList.add("Leave Benifits");
    }


    public void addManagerBenefit(String benefit) {
        this.managerBenefitsList.add(benefit);

    }

}
