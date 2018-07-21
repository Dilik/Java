import java.util.*;

public class TestGenerics{

    public static void main(String[] args){
	new TestGenerics().go();
    }

    public void go(){
	Animal[] animals = {new Dog(), new Cat(), new Dog()};
	Dog[] dogs = {new Dog(), new Dog(), new Dog()};
	takeAnimals(animals);
	takeAnimals(dogs);
    }

    public void takeAnimals(Animal[] animals){
	for(Animal a : animals){
	    a.eat();
	}
    }
}


