public class TypeAStudent extends Student {



    @Override
    public int calculateFee() {

        System.out.println("I am a Type A student");
        TotalFee= (int) (0.5 * (perCoursefee * numOfCourses));

        System.out.println("Fee: "+ TotalFee);

        return TotalFee;

    }





}
