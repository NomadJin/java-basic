package polymorphism;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {

    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        AnimalTest animalTest = new AnimalTest();
//        animalTest.moveAnimal(hAnimal);
//        animalTest.moveAnimal(tAnimal);
//        animalTest.moveAnimal(eAnimal);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(hAnimal);
        animals.add(tAnimal);
        animals.add(eAnimal);

        for(Animal animal : animals) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
