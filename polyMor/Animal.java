public abstract class Animal{

    private String name;
    
    public void makeSound(){
    }

    public String getName(){
	return name;
    }

    public Animal(String theName){
	name = theName;
    }
}
