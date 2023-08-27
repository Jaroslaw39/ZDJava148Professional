public class Main {

    public static void main(String[] args) {

        ShelterWorker worker01 = new ShelterWorker(01231, "Jan", "Nowak");
        Animal animal01 = new Animal(01,"Lucia", 12,"zebra", worker01);
        Animal animal02 = new Animal(02,"Sara", 2,"lion", worker01);
        Animal animal03 = new Animal(03,"Rose", 21,"elephant", worker01);

        worker01.addAnimal(animal01);
        worker01.addAnimal(animal02);
        worker01.addAnimal(animal03);

        animal01.setShelterWorker(worker01);
        animal02.setShelterWorker(worker01);
        animal03.setShelterWorker(worker01);

        for(Animal animal: worker01.getAnimals()){

            System.out.println(animal);
        }
    }



}
