import java.util.ArrayList;

public class DevBenefits extends BasicBenefits {

    protected ArrayList<String> devBenefitsList= new ArrayList<String>();


    public DevBenefits()
    {
        devBenefitsList.add("Insurance Benefits");
        devBenefitsList.add("Loan Benefits");

    }


    public void addDeveloperBenefit(String benefit) {
        this.devBenefitsList.add(benefit);
    }




}
