package E08Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculadora extends JFrame implements ActionListener {

	private String cadenaNumeros = "";
	private String operacion = "null";
	private int refCalculo;
	private Double numero;
	private Double resultado;

	/* BOTONES */
	JButton button_0 = new JButton("0");
	JButton button_1 = new JButton("1");
	JButton button_2 = new JButton("2");
	JButton button_3 = new JButton("3");
	JButton button_4 = new JButton("4");
	JButton button_5 = new JButton("5");
	JButton button_6 = new JButton("6");
	JButton button_7 = new JButton("7");
	JButton button_8 = new JButton("8");
	JButton button_9 = new JButton("9");

	/* OPERACIONES */
	JButton button_sumar = new JButton("+");
	JButton button_division = new JButton("/");
	JButton button_multi = new JButton("*");
	JButton button_resta = new JButton("-");
	JButton btnSqrt = new JButton("sqrt");
	JButton button_modulo = new JButton("%");

	/* OTROS BOTONES */
	JButton button_igual = new JButton("=");
	JButton button_punto = new JButton(".");
	JButton btnClear = new JButton("C");

	JFrame frame;
	private JTextField txtResultado;

	/**
	 * Create the application.
	 */
	public Calculadora() {
		agregarElementos();
		botonesEvent();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void agregarElementos() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(36, 36, 36));
		frame.setBounds(100, 100, 302, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 1, 291, 130);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		txtResultado = new JTextField();
		panel.add(txtResultado);
		txtResultado.setToolTipText("10");
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBackground(new Color(36, 36, 36));
		txtResultado.setForeground(Color.WHITE);
		txtResultado.setFont(new Font("Cascadia Code", Font.BOLD, 25));
		txtResultado.setColumns(5);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 131, 291, 254);
		frame.getContentPane().add(panel_1);

		panel_1.setLayout(new GridLayout(5, 5, 0, 0));

		JButton button_10 = new JButton("(");
		panel_1.add(button_10);

		JButton button_11 = new JButton(")");
		panel_1.add(button_11);

		JButton btnMs = new JButton("MS");
		panel_1.add(btnMs);

		JButton btnMr = new JButton("MR");
		panel_1.add(btnMr);

		JButton btnM = new JButton("M+");
		panel_1.add(btnM);

		// Setting property of button 7
		button_7.setBounds(10, 230, 60, 40);
		button_7.setFont(new Font("Arial", Font.BOLD, 20));
		button_7.setBackground(new Color(36, 36, 36));
		button_7.setForeground(Color.WHITE);
		panel_1.add(button_7);

		button_8.setBounds(80, 230, 60, 40);
		button_8.setFont(new Font("Arial", Font.BOLD, 20));
		button_8.setBackground(new Color(36, 36, 36));
		button_8.setForeground(Color.WHITE);
		panel_1.add(button_8);

		button_9.setBounds(80, 230, 60, 40);
		button_9.setFont(new Font("Arial", Font.BOLD, 20));
		button_9.setBackground(new Color(36, 36, 36));
		button_9.setForeground(Color.WHITE);
		panel_1.add(button_9);

		button_division.setBounds(10, 230, 60, 40);
		button_division.setFont(new Font("Arial", Font.BOLD, 20));
		button_division.setBackground(new Color(249, 113, 50));
		button_division.setForeground(Color.WHITE);
		panel_1.add(button_division);

		btnSqrt.setBounds(10, 230, 60, 40);
		btnSqrt.setFont(new Font("Arial", Font.BOLD, 10));
		btnSqrt.setBackground(new Color(249, 113, 50));
		btnSqrt.setForeground(Color.WHITE);
		panel_1.add(btnSqrt);

		button_4.setBounds(10, 230, 60, 40);
		button_4.setFont(new Font("Arial", Font.BOLD, 20));
		button_4.setBackground(new Color(36, 36, 36));
		button_4.setForeground(Color.WHITE);
		panel_1.add(button_4);

		button_5.setBounds(10, 230, 60, 40);
		button_5.setFont(new Font("Arial", Font.BOLD, 20));
		button_5.setBackground(new Color(36, 36, 36));
		button_5.setForeground(Color.WHITE);
		panel_1.add(button_5);

		button_6.setBounds(10, 230, 60, 40);
		button_6.setFont(new Font("Arial", Font.BOLD, 20));
		button_6.setBackground(new Color(36, 36, 36));
		button_6.setForeground(Color.WHITE);
		panel_1.add(button_6);

		button_multi.setBounds(10, 230, 60, 40);
		button_multi.setFont(new Font("Arial", Font.BOLD, 20));
		button_multi.setBackground(new Color(249, 113, 50));
		button_multi.setForeground(Color.WHITE);
		panel_1.add(button_multi);

		button_modulo.setBounds(10, 230, 60, 40);
		button_modulo.setFont(new Font("Arial", Font.BOLD, 20));
		button_modulo.setBackground(new Color(249, 113, 50));
		button_modulo.setForeground(Color.WHITE);
		panel_1.add(button_modulo);

		button_1.setBounds(10, 230, 60, 40);
		button_1.setFont(new Font("Arial", Font.BOLD, 20));
		button_1.setBackground(new Color(36, 36, 36));
		button_1.setForeground(Color.WHITE);
		panel_1.add(button_1);

		button_2.setBounds(10, 230, 60, 40);
		button_2.setFont(new Font("Arial", Font.BOLD, 20));
		button_2.setBackground(new Color(36, 36, 36));
		button_2.setForeground(Color.WHITE);
		panel_1.add(button_2);

		button_3.setBounds(10, 230, 60, 40);
		button_3.setFont(new Font("Arial", Font.BOLD, 20));
		button_3.setBackground(new Color(36, 36, 36));
		button_3.setForeground(Color.WHITE);
		panel_1.add(button_3);

		button_resta.setBounds(10, 230, 60, 40);
		button_resta.setFont(new Font("Arial", Font.BOLD, 20));
		button_resta.setBackground(new Color(249, 113, 50));
		button_resta.setForeground(Color.WHITE);
		panel_1.add(button_resta);

		button_sumar.setBounds(10, 230, 60, 40);
		button_sumar.setFont(new Font("Arial", Font.BOLD, 20));
		button_sumar.setBackground(new Color(249, 113, 50));
		button_sumar.setForeground(Color.WHITE);
		panel_1.add(button_sumar);

		button_0.setBounds(10, 230, 60, 40);
		button_0.setFont(new Font("Arial", Font.BOLD, 20));
		button_0.setBackground(new Color(36, 36, 36));
		button_0.setForeground(Color.WHITE);
		panel_1.add(button_0);

		button_punto.setBounds(10, 230, 60, 40);
		button_punto.setFont(new Font("Arial", Font.BOLD, 15));
		button_punto.setBackground(new Color(36, 36, 36));
		button_punto.setForeground(Color.WHITE);
		panel_1.add(button_punto);

		button_igual.setBounds(150, 410, 60, 40);
		button_igual.setFont(new Font("Arial", Font.BOLD, 20));
		panel_1.add(button_igual);

		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Arial", Font.BOLD, 20));
		panel_1.add(btnClear);

		JButton button = new JButton("+/-");
		panel_1.add(button);
	}

	public void botonesEvent() {
		// Llamada btn-Numeros
		button_0.addActionListener(this);
		button_1.addActionListener(this);
		button_2.addActionListener(this);
		button_3.addActionListener(this);
		button_4.addActionListener(this);
		button_5.addActionListener(this);
		button_6.addActionListener(this);
		button_7.addActionListener(this);
		button_8.addActionListener(this);
		button_9.addActionListener(this);

		// Llamada btn-operaciones
		button_sumar.addActionListener(this);
		button_division.addActionListener(this);
		button_multi.addActionListener(this);
		button_resta.addActionListener(this);
		btnSqrt.addActionListener(this);
		button_modulo.addActionListener(this);

		/* OTROS BOTONES */
		button_igual.addActionListener(this);
		button_punto.addActionListener(this);
		btnClear.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		/* Action btn-Numeros */
		if (source == button_0) {
			txtResultado.setText(txtResultado.getText() + "0");
		} else if (source == button_1) {
			txtResultado.setText(txtResultado.getText() + "1");
		} else if (source == button_2) {
			txtResultado.setText(txtResultado.getText() + "2");
		} else if (source == button_3) {
			txtResultado.setText(txtResultado.getText() + "3");
		} else if (source == button_4) {
			txtResultado.setText(txtResultado.getText() + "4");
		} else if (source == button_5) {
			txtResultado.setText(txtResultado.getText() + "5");
		} else if (source == button_6) {
			txtResultado.setText(txtResultado.getText() + "6");
		} else if (source == button_7) {
			txtResultado.setText(txtResultado.getText() + "7");
		} else if (source == button_8) {
			txtResultado.setText(txtResultado.getText() + "8");
		} else if (source == button_9) {
			txtResultado.setText(txtResultado.getText() + "9");
		}

		/* btn-BORRADO */
		else if (source == btnClear) {
			// label.setText("");
			txtResultado.setText("");
		} else if (source == button_punto) {
			// label.setText("");
			txtResultado.setText(txtResultado.getText() + ".");
		}

		/* btn-OPERACIONES */
		else if (source == button_sumar) {
			String aux = txtResultado.getText();
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 1;
		} else if (source == button_resta) {
			String aux = txtResultado.getText();
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 2;
		} else if (source == button_multi) {
			String aux = txtResultado.getText();
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 3;
		} else if (source == button_division) {
			String aux = txtResultado.getText();
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 4;
		} else if (source == btnSqrt) {
			String aux = txtResultado.getText();
			numero = Double.parseDouble(txtResultado.getText());
			double sqr = Math.pow(numero, 2);
			String toText = Double.toString(sqr);
			txtResultado.setText(toText);

		}

		/* btn-IGUAL */

		else if (source == button_igual) {
			switch (refCalculo) {
			case 1:
				resultado = numero + Double.parseDouble(txtResultado.getText());
				if (Double.toString(resultado).endsWith(".0")) {
					txtResultado.setText(Double.toString(resultado).replace(".0", ""));
				} else {
					txtResultado.setText(Double.toString(resultado));
				}
				break;

			case 2:
				resultado = numero - Double.parseDouble(txtResultado.getText());
				if (Double.toString(resultado).endsWith(".0")) {
					txtResultado.setText(Double.toString(resultado).replace(".0", ""));
				} else {
					txtResultado.setText(Double.toString(resultado));
				}
				break;

			case 3:
				resultado = numero * Double.parseDouble(txtResultado.getText());
				if (Double.toString(resultado).endsWith(".0")) {
					txtResultado.setText(Double.toString(resultado).replace(".0", ""));
				} else {
					txtResultado.setText(Double.toString(resultado));
				}
				break;

			case 4:
				resultado = numero / Double.parseDouble(txtResultado.getText());
				if (Double.toString(resultado).endsWith(".0")) {
					txtResultado.setText(Double.toString(resultado).replace(".0", ""));
				} else {
					txtResultado.setText(Double.toString(resultado));
				}
				break;

			}
		}
	}
}
