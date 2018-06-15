import javax.sound.midi.*;

public class MusicPlayer2 implements ControllerEventListener{

    public static void main(String[] args){
	MusicPlayer2 mini = new MusicPlayer2();
	mini.go();
    }


    public void go(){
     try{
	Sequencer seqR = MidiSystem.getSequencer();
	seqR.open();

	int[] eventsIWant = {127};
	seqR.addControllerEventListener(this, eventsIWant);

	Sequence seq = new Sequence(Sequence.PPQ, 4);
	Track track = seq.createTrack();

	for(int i=5; i< 60; i+=4){
	    track.add(makeEvent(144,1,i,100,i));
	    track.add(makeEvent(176,1,127,0,i));
	    track.add(makeEvent(128,1,i,100,i+2));
	}

	seqR.setSequence(seq);
	seqR.setTempoInBPM(220);
	seqR.start();
     } catch (Exception ex) {ex.printStackTrace();}
    }

    public void controlChange(ShortMessage event){
	System.out.println("la");
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
	MidiEvent event = null;
	try {
	    ShortMessage a = new ShortMessage();
	    a.setMessage(comd, chan, one, two);
	    event = new MidiEvent(a, tick);
	} catch(Exception e) { }
	return event;
    }
}
