package main.java.firsttopics.Fruits;

public class Apple extends Fruit {

    public Apple(){
        setCalories(200);
    }

    public void removeHeart() {
        System.out.println("You need to remove my heart, sweetie");
    }

    @Override
    public void makeJuice() {
        System.out.println("My juice is delicate and fluid");
    }

}
