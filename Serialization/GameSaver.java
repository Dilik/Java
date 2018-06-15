import java.io.*;

public class GameSaver{

    public static void main(String[] args){
	GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dut"});
	GameCharacter two = new GameCharacter(200, "Troll", new String[]{"bare hands", "big ax"});
	GameCharacter three = new GameCharacter(120, "macician", new String[]{"spells", "invisibility"});

	try{
	    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
	    os.writeObject(one);
	    os.writeObject(two);
	    os.writeObject(three);
	    os.close();
	}catch(IOException ex){
	    ex.printStackTrace();
	}

	one = null;
	two = null;
	three = null;

	try{
	    ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
	    GameCharacter oneRestore = (GameCharacter) is.readObject();
	    GameCharacter twoRestore = (GameCharacter) is.readObject();
	    GameCharacter threeRestore = (GameCharacter) is.readObject();

	    System.out.println("One's Type: " + oneRestore.getType());
	    System.out.println("Two's Type: " + twoRestore.getType());
	    System.out.println("Three's Type: " + threeRestore.getType());
	    
	}catch (Exception ex){
	    ex.printStackTrace();
	}
    }
}
