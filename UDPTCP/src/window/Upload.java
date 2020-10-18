package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import java.awt.Button;

public class Upload {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Upload window = new Upload();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Upload() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setLayout(null);
		
		Label uplab = new Label("Upload");
		uplab.setAlignment(Label.CENTER);
		uplab.setFont(new Font("Tahoma", Font.BOLD, 18));
		uplab.setBackground(Color.ORANGE);
		uplab.setBounds(0, 0, 531, 59);
		frame.getContentPane().add(uplab);
		
		Label fnamelab = new Label("File Name");
		fnamelab.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fnamelab.setBounds(73, 79, 86, 39);
		frame.getContentPane().add(fnamelab);
		
		JComboBox fnamecomboBox = new JComboBox();
		fnamecomboBox.setBounds(184, 79, 312, 39);
		frame.getContentPane().add(fnamecomboBox);
		frame.setBounds(100, 100, 545, 300);
		fnamecomboBox.setEditable(true);
		
		Button buttonUpl = new Button("Upload");
		buttonUpl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonUpl.setBounds(183, 208, 202, 33);
		frame.getContentPane().add(buttonUpl);
		
		Button buttoncanc = new Button("Cancel");
		buttoncanc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttoncanc.setBounds(10, 208, 135, 33);
		frame.getContentPane().add(buttoncanc);
		
		Button buttonNext = new Button("Next");
		buttonNext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonNext.setBounds(422, 208, 99, 33);
		frame.getContentPane().add(buttonNext);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
