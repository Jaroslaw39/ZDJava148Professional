public class Main {

    public static void main(String[] args) {

        ShelterWorker worker01 = new ShelterWorker(01231, "Jan", "Nowak");
        Animal animal01 = new Animal(01,"Lucia", 12,"zebra");
        Animal animal02 = new Animal(02,"Sara", 2,"lion");
        Animal animal03 = new Animal(03,"Rose", 21,"elephant");

        worker01.addAnimal(animal01);
        worker01.addAnimal(animal02);
        worker01.addAnimal(animal03);



        for(Animal animal: worker01.getAnimals()){

            System.out.println(animal);
        }

        System.out.println(worker01);
    }

}
