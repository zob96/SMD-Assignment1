import java.util.ArrayList;

public class BasicBenefits {

   protected ArrayList<String> basicBenefitsList= new ArrayList<String>();


     public BasicBenefits()
     {

         basicBenefitsList.add("Health Benifits");

     }

    public void addBasicBenefit(String benefit) {
        this.basicBenefitsList.add(benefit);
    }






}
