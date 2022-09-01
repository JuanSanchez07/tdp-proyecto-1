package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {	
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante = new Student(125428,"Sanchez","Juan Ignacio","juan1402@live.com.ar",
            			"https://github.com/JuanSanchez07","C:\\Users\\juan1\\Desktop\\logo_uns.jpg");
				SimplePresentationScreen frame = new SimplePresentationScreen(estudiante);
				frame.setVisible(true);           	
            }
        });
    }
}