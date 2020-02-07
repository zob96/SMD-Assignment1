public class Dog extends Creature implements WalkingCreatures, DogTricks {



    @Override
    public void walk() {

        System.out.println("I am a Dog and i am walking");


    }


    @Override
    public void playDead() {

    }
}
