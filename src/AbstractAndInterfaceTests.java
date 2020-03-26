import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruits.Fruit;
import fruits.Apple;
import fruits.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
