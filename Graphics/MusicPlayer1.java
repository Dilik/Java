import javax.sound.midi.*;

public class MusicPlayer1{
    public static void main(String[] args){

	try{

	    Sequencer seqR = MidiSystem.getSequencer();
	    seqR.open();

	    Sequence seq = new Sequence(Sequence.PPQ, 4);
	    Track  track = seq.createTrack();

	    for(int i= 5; i < 61; i+=4){

		track.add(makeEvent(144,1,i,100,i));
		track.add(makeEvent(128,1,i,100,i+2));
	    }

	    seqR.setSequence(seq);
	    seqR.setTempoInBPM(220);
	    seqR.start();
	} catch (Exception ex) {ex.printStackTrace();}
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
	MidiEvent event = null;

	try{
	    ShortMessage a = new ShortMessage();
	    a.setMessage(comd, chan, one, two, tick);
	    event = new MidiEvent(a, tick);
	} catch (Exception e) {}
	return event;
    }
}
