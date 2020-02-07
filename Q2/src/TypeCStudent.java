public class TypeCStudent extends Student {


    int fundReceived;


    @Override
    public int calculateFee() {

        System.out.println("I am a Type C student");
        TotalFee= (int) perCoursefee* numOfCourses;
        fundReceived= (int) (0.25*TotalFee);

        System.out.println("Fee: "+ TotalFee);

       return TotalFee-fundReceived;

    }




}
