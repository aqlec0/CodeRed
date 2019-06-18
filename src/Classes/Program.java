package Classes;

public class Program {

    public static void main(String[] args) {

        Animal2 animal = new Animal2();
        animal.weight = 100;
        //animal.makeNoise();

        Bird seagull = new Bird();
        seagull.weight = 10;
        seagull.canFly = true;
        //seagull.makeNoise();

        Dog reksio = new Dog();
        Parrot polly = new Parrot();

        Animal2 [] zoo = {animal, seagull, reksio, polly, polly};

        for(Animal2 a : zoo) {
            a.makeNoise();
        }

    }
}
