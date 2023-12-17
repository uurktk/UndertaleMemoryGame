import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<ImageIcon> icons = new ArrayList<>();
	JButton firstClickedButton = null; 
	JButton secondClickedButton = null; 
	Game game = new Game();
	
	public void setAction(JButton button, int index) {
	    button.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if (firstClickedButton == null) {
	                // First click
	                button.setIcon(icons.get(index));
	                firstClickedButton = button;
	                firstClickedButton.setEnabled(false);
	            } else {
	                // Second click
	                button.setIcon(icons.get(index));
	                secondClickedButton = button;
	                secondClickedButton.setEnabled(false);
	                Timer delayTimer = new Timer(500, new ActionListener() {
	                    public void actionPerformed(ActionEvent evt) {
	                        if (firstClickedButton.getIcon().equals(secondClickedButton.getIcon())) {
	                            secondClickedButton.setEnabled(false);
	                        } else {
	                            firstClickedButton.setIcon(new ImageIcon("Flowey.jpg"));
	                            secondClickedButton.setIcon(new ImageIcon("Flowey.jpg"));
	                            firstClickedButton.setEnabled(true);
	                        secondClickedButton.setEnabled(true);
	                        }
	                        firstClickedButton = null;
	                        secondClickedButton = null;
	                    }
	                });
	                delayTimer.setRepeats(false); // Only execute once
	                delayTimer.start();
	            }
	        }
	    });
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setLocationRelativeTo(null); // Frame will appear in the middle
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setTitle("Undertale Memory Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Setting icons in a random order.
		game.intializeIcons(icons);
		Collections.shuffle(icons);
		
		JButton btn_1 = new JButton();
		btn_1.setBounds(10, 24, 100, 100);
		game.createButton(btn_1, contentPane, icons, 0);
		setAction(btn_1, 0);

		JButton btn_2 = new JButton();
		btn_2.setBounds(117, 24, 100, 100);
		game.createButton(btn_2, contentPane, icons, 1);
		setAction(btn_2, 1);

		JButton btn_3 = new JButton();
		btn_3.setBounds(224, 24, 100, 100);
		game.createButton(btn_3, contentPane, icons, 2);
		setAction(btn_3, 2);
		
		JButton btn_4 = new JButton();
		btn_4.setBounds(331, 24, 100, 100);
		game.createButton(btn_4, contentPane, icons, 3);
		setAction(btn_4, 3);
		
		JButton btn_5 = new JButton();
		btn_5.setBounds(438, 24, 100, 100);
		game.createButton(btn_5, contentPane, icons, 4);
		setAction(btn_5, 4);
		
		JButton btn_6 = new JButton();
		btn_6.setBounds(545, 24, 100, 100);
		game.createButton(btn_6, contentPane, icons, 5);
		setAction(btn_6, 5);
		
		JButton btn_7 = new JButton();
		btn_7.setBounds(10, 135, 100, 100);
		game.createButton(btn_7, contentPane, icons, 6);
		setAction(btn_7, 6);

		JButton btn_8 = new JButton();
		btn_8.setBounds(117, 135, 100, 100);
		game.createButton(btn_8, contentPane, icons, 7);
		setAction(btn_8, 7);

		JButton btn_9 = new JButton();
		btn_9.setBounds(224, 135, 100, 100);
		game.createButton(btn_9, contentPane, icons, 8);
		setAction(btn_9, 8);
		
		JButton btn_10 = new JButton();
		btn_10.setBounds(331, 135, 100, 100);
		game.createButton(btn_10, contentPane, icons, 9);
		setAction(btn_10, 9);
		
		JButton btn_11 = new JButton();
		btn_11.setBounds(438, 135, 100, 100);
		game.createButton(btn_11, contentPane, icons, 10);
		setAction(btn_11, 10);
		
		JButton btn_12 = new JButton();
		btn_12.setBounds(545, 135, 100, 100);
		game.createButton(btn_12, contentPane, icons, 11);
		setAction(btn_12, 11);
		
		JButton btn_13 = new JButton();
		btn_13.setBounds(10, 246, 100, 100);
		game.createButton(btn_13, contentPane, icons, 12);
		setAction(btn_13, 12);
		
		JButton btn_14 = new JButton();
		btn_14.setBounds(117, 246, 100, 100);
		game.createButton(btn_14, contentPane, icons, 13);
		setAction(btn_14, 13);
		
		JButton btn_15 = new JButton();
		btn_15.setBounds(224, 246, 100, 100);
		game.createButton(btn_15, contentPane, icons, 14);
		setAction(btn_15, 14);
		
		JButton btn_16 = new JButton();
		btn_16.setBounds(331, 246, 100, 100);
		game.createButton(btn_16, contentPane, icons, 15);
		setAction(btn_16, 15);

		JButton btn_17 = new JButton();
		btn_17.setBounds(438, 246, 100, 100);
		game.createButton(btn_17, contentPane, icons, 16);
		setAction(btn_17, 16);
		
		JButton btn_18 = new JButton();
		btn_18.setBounds(545, 246, 100, 100);
		game.createButton(btn_18, contentPane, icons, 17);
		setAction(btn_18, 17);

	}
}