package exercise_03;

import java.util.ArrayList;
import java.util.List;

public class ShelterWorker {

    private int id;
    private String name;
    private String surname;
    private List<Animal> animals;

    public ShelterWorker(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.animals = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        animal.setShelterWorker(this);
    }

    @Override
    public String toString() {
        return "ShelterWorker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
