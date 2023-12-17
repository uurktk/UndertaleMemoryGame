import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Game {
	ImageIcon alphys = new ImageIcon("Alphys.jpg");
	ImageIcon asriel = new ImageIcon("Asriel.jpg");
	ImageIcon frisk = new ImageIcon("Frisk.jpg");
	ImageIcon mettaton = new ImageIcon("Mettaton.jpg");
	ImageIcon napstablook = new ImageIcon("Napstablook.jpg");
	ImageIcon papryus = new ImageIcon("Papryus.jpg");
	ImageIcon sans = new ImageIcon("Sans.jpg");
	ImageIcon toriel = new ImageIcon("toriel.jpg");
	ImageIcon undyne = new ImageIcon("Undyne.jpg");

	public void createButton(JButton button, JPanel panel, ArrayList<ImageIcon> icons, int i) {
		button.setDisabledIcon(icons.get(i));
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setFocusPainted(false);
		button.setIcon(new ImageIcon("Flowey.jpg"));
		panel.add(button);
	}
	
	public void intializeIcons(ArrayList<ImageIcon> icons) {
		for(int i = 0 ; i<2 ; i++) {
			icons.add(alphys);
			icons.add(asriel);
			icons.add(frisk);
			icons.add(mettaton);
			icons.add(napstablook);
			icons.add(papryus);
			icons.add(sans);
			icons.add(toriel);
			icons.add(undyne);
		}
	}


}