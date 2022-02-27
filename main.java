package E08Calculadora;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.toString(), "Error:", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

}
