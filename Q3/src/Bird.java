public class Bird extends Creature implements WalkingCreatures, BirdTricks {



    @Override
    public void walk() {

        System.out.println("I am a Bird and i am walking");


    }


    public void fly()
    {
        System.out.println("Flying.....");

    }
    public void makeNest()
    {
        System.out.println("Making nest...");
    }


    @Override
    public void singSong() {
        System.out.println("Sing Sing Sing....");

    }
}
