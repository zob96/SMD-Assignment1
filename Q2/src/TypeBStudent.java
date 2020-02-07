public class TypeBStudent extends Student {



    @Override
    public int calculateFee() {

        System.out.println("I am a Type B student");

         TotalFee= (int) (perCoursefee * numOfCourses);

        System.out.println("Fee: "+ TotalFee);

        return TotalFee;



    }
}
