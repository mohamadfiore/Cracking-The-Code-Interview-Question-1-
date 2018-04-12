package ReverseString;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIReverseString extends JFrame {

	private JLabel labelObj;
	private JLabel labelResultObj;
	private Reverse reverseStringObj;

	private Container contentPane;
	private JButton buttonObj;
	private String result;

	private JTextField textFieldObj;

	public GUIReverseString() {
		super("Reverse String");

		// Set the width and height of the window (in pixels)
		setSize(120, 200);

		// get the content pane add a panel to it
		// set the background color of the panel
		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.lightGray);
		contentPane.add(mainPanel);

	
		labelObj = new JLabel("Enter a Word");
		mainPanel.add(labelObj);

		textFieldObj = new JTextField(8);
		mainPanel.add(textFieldObj);

		reverseStringObj = new Reverse();

		buttonObj = new JButton("Reverse it!");
		buttonObj.addActionListener(new ButtonListener());
		mainPanel.add(buttonObj);

		labelResultObj = new JLabel(result);
		mainPanel.add(labelResultObj);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String s = textFieldObj.getText();
			labelResultObj.setText(Reverse.reverseString1(s));
			buttonObj.setEnabled(false);
		}
	}

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				// create an object of your class
				GUIReverseString frame = new GUIReverseString();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}
}
