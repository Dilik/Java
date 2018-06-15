import javax.sound.midi.*;

public class soundMIDI{

    public void play(){

	try{
	Sequencer sequencer = MidiSystem.getSequencer();

	System.out.println("We got a sequencer");
	} catch (MidiUnavailableException ex){
	System.out.println("Bummer");
        }
    }
    public static void main(String[] args){
	soundMIDI mySound = new soundMIDI();
	mySound.play();
    }
}
