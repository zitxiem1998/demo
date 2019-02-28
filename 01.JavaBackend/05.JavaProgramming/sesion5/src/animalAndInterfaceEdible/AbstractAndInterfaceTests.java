package animalAndInterfaceEdible;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i=0;i<animals.length;i++) {
           System.out.println(animals[i].makeSound());
        }
        Fruit[] fruit=new Fruit[2];
        fruit[0]=new Apple();
        fruit[1]=new Orange();
        for (int i=0;i<fruit.length;i++) {
            System.out.println(fruit[i].howToEat());
        }

    }
}
