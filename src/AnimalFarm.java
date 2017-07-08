import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		String animal;
		while (true) {
		animal = JOptionPane.showInputDialog("Which animal to you want to hear the sound of");
		if (animal.equals("cow") || animal.equals("Cow")) {
			playNoise(mooFile);
		}
        if (animal.equals("duck") || animal.equals("Duck")){
		playNoise(quackFile);
        }
        if (animal.equals("dog") || animal.equals("Dog")) {
        	playNoise(woofFile);
        }
        if (animal.equals("cat") || animal.equals("Cat")) {
        	playNoise(meowFile);
        }
        if (animal.equals("llama") || animal.equals("Llama")) {
        	playNoise(llamaFile);
          }
		}
        	/* 2. Make it so that the user can keep entering ne
    		 * w animals. */
	}
     
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


