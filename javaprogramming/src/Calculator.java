import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
// 소스만 입력하고 Ctrl+Shift+O를 누른다. 




public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",
	};

	class CalculatorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			tField.setText(tField.getText() + actionCommand);
		}
	}
	

	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setEnabled(true);

		setTitle("신동기의 계산기");
		
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
	
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
			
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow); 
				
				
				panel.add(buttons[index]);
				index++;
			}
		}
		
		
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}

	
	
	
	public static void main(String args[]) {
		Calculator s = new Calculator();
	}
}