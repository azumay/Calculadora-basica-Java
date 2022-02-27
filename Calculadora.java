package E08Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

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
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class Calculadora extends JFrame implements ActionListener {

	private int refCalculo;
	private Double numero;
	private Double resultado;

	/* BOTONES */
	private JButton button_0 = new JButton("0");
	private JButton button_1 = new JButton("1");
	private JButton button_2 = new JButton("2");
	private JButton button_3 = new JButton("3");
	private JButton button_4 = new JButton("4");
	private JButton button_5 = new JButton("5");
	private JButton button_6 = new JButton("6");
	private JButton button_7 = new JButton("7");
	private JButton button_8 = new JButton("8");
	private JButton button_9 = new JButton("9");

	/* OPERACIONES */
	private JButton button_sumar = new JButton("+");
	private JButton button_division = new JButton("/");
	private JButton button_multi = new JButton("*");
	private JButton button_resta = new JButton("-");
	private JButton btnSqrt = new JButton("sqrt");
	private JButton button_modulo = new JButton("%");

	/* OTROS BOTONES */
	private JButton button_igual = new JButton("=");
	private JButton button_punto = new JButton(".");
	private JButton btnClear = new JButton("C");

	// Variables declaration - do not modify
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem miAbrir;
	private javax.swing.JMenu miSalir;
	private javax.swing.JTextField txtRuta;

	JFrame frame;
	private JTextField txtResultado;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnNewMenu = new JMenu("File");
	private final JMenuItem mntmAcercaDe = new JMenuItem("Acerca de...");
	private final JMenuItem mntmSalir = new JMenuItem("Salir");
	private final JSeparator separator = new JSeparator();

	/**
	 * Create the application.
	 */
	public Calculadora() {
		this.agregarElementos();
		this.botonesEvent();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void agregarElementos() {

		frame = new JFrame();
		frame.setTitle("Calculadora");
		frame.getContentPane().setBackground(new Color(36, 36, 36));
		frame.setBounds(100, 100, 302, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		ImageIcon imgApp = new ImageIcon("/E08Calculadora/Imagenes/calc.png");
		frame.setIconImage(imgApp.getImage());

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		txtResultado = new JTextField();
		panel.add(txtResultado, "name_892511373559");
		txtResultado.setToolTipText("10");
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBackground(new Color(36, 36, 36));
		txtResultado.setForeground(Color.WHITE);
		txtResultado.setFont(new Font("Cascadia Code", Font.BOLD, 25));
		txtResultado.setColumns(5);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);

		panel_1.setLayout(new GridLayout(5, 5, 5, 5));

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

		// Estilos boton 7
		button_7.setBounds(10, 230, 60, 40);
		button_7.setFont(new Font("Arial", Font.BOLD, 20));
		button_7.setBackground(new Color(36, 36, 36));
		button_7.setForeground(Color.WHITE);
		panel_1.add(button_7);

		// Estilos boton 8
		button_8.setBounds(80, 230, 60, 40);
		button_8.setFont(new Font("Arial", Font.BOLD, 20));
		button_8.setBackground(new Color(36, 36, 36));
		button_8.setForeground(Color.WHITE);
		panel_1.add(button_8);

		// Estilos boton 9
		button_9.setBounds(80, 230, 60, 40);
		button_9.setFont(new Font("Arial", Font.BOLD, 20));
		button_9.setBackground(new Color(36, 36, 36));
		button_9.setForeground(Color.WHITE);
		panel_1.add(button_9);

		// Estilos boton /
		button_division.setBounds(10, 230, 60, 40);
		button_division.setFont(new Font("Arial", Font.BOLD, 20));
		button_division.setBackground(new Color(249, 113, 50));
		button_division.setForeground(Color.WHITE);
		panel_1.add(button_division);

		// Estilos boton sqrt
		btnSqrt.setBounds(10, 230, 60, 40);
		btnSqrt.setFont(new Font("Arial", Font.BOLD, 5));
		btnSqrt.setBackground(new Color(249, 113, 50));
		btnSqrt.setForeground(Color.WHITE);
		panel_1.add(btnSqrt);

		// Estilos boton 4
		button_4.setBounds(10, 230, 60, 40);
		button_4.setFont(new Font("Arial", Font.BOLD, 20));
		button_4.setBackground(new Color(36, 36, 36));
		button_4.setForeground(Color.WHITE);
		panel_1.add(button_4);

		// Estilos boton 5
		button_5.setBounds(10, 230, 60, 40);
		button_5.setFont(new Font("Arial", Font.BOLD, 20));
		button_5.setBackground(new Color(36, 36, 36));
		button_5.setForeground(Color.WHITE);
		panel_1.add(button_5);

		// Estilos boton 6
		button_6.setBounds(10, 230, 60, 40);
		button_6.setFont(new Font("Arial", Font.BOLD, 20));
		button_6.setBackground(new Color(36, 36, 36));
		button_6.setForeground(Color.WHITE);
		panel_1.add(button_6);

		// Estilos boton *
		button_multi.setBounds(10, 230, 60, 40);
		button_multi.setFont(new Font("Arial", Font.BOLD, 20));
		button_multi.setBackground(new Color(249, 113, 50));
		button_multi.setForeground(Color.WHITE);
		panel_1.add(button_multi);

		// Estilos boton %
		button_modulo.setBounds(10, 230, 60, 40);
		button_modulo.setFont(new Font("Arial", Font.BOLD, 20));
		button_modulo.setBackground(new Color(249, 113, 50));
		button_modulo.setForeground(Color.WHITE);
		panel_1.add(button_modulo);

		// Estilos boton 1
		button_1.setBounds(10, 230, 60, 40);
		button_1.setFont(new Font("Arial", Font.BOLD, 20));
		button_1.setBackground(new Color(36, 36, 36));
		button_1.setForeground(Color.WHITE);
		panel_1.add(button_1);

		// Estilos boton 2
		button_2.setBounds(10, 230, 60, 40);
		button_2.setFont(new Font("Arial", Font.BOLD, 20));
		button_2.setBackground(new Color(36, 36, 36));
		button_2.setForeground(Color.WHITE);
		panel_1.add(button_2);

		// Estilos boton 3
		button_3.setBounds(10, 230, 60, 40);
		button_3.setFont(new Font("Arial", Font.BOLD, 20));
		button_3.setBackground(new Color(36, 36, 36));
		button_3.setForeground(Color.WHITE);
		panel_1.add(button_3);

		// Estilos boton -
		button_resta.setBounds(10, 230, 60, 40);
		button_resta.setFont(new Font("Arial", Font.BOLD, 20));
		button_resta.setBackground(new Color(249, 113, 50));
		button_resta.setForeground(Color.WHITE);
		panel_1.add(button_resta);

		// Estilos boton +
		button_sumar.setBounds(10, 230, 60, 40);
		button_sumar.setFont(new Font("Arial", Font.BOLD, 20));
		button_sumar.setBackground(new Color(249, 113, 50));
		button_sumar.setForeground(Color.WHITE);
		panel_1.add(button_sumar);

		// Estilos boton 0
		button_0.setBounds(10, 230, 60, 40);
		button_0.setFont(new Font("Arial", Font.BOLD, 20));
		button_0.setBackground(new Color(36, 36, 36));
		button_0.setForeground(Color.WHITE);
		panel_1.add(button_0);

		// Estilos boton .
		button_punto.setBounds(10, 230, 60, 40);
		button_punto.setFont(new Font("Arial", Font.BOLD, 15));
		button_punto.setBackground(new Color(36, 36, 36));
		button_punto.setForeground(Color.WHITE);
		panel_1.add(button_punto);

		// Estilos boton =
		button_igual.setBounds(150, 410, 60, 40);
		button_igual.setFont(new Font("Arial", Font.BOLD, 20));
		panel_1.add(button_igual);

		// Estilos boton clear
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Arial", Font.BOLD, 20));
		panel_1.add(btnClear);

		JButton button = new JButton("+/-");
		panel_1.add(button);
		
		frame.setJMenuBar(menuBar);
		
		menuBar.add(mnNewMenu);
		mntmAcercaDe.setIcon(new ImageIcon(Calculadora.class.getResource("/E08Calculadora/Imagenes/info.png")));
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Calculadora creada por Xavi Yamuza", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		mnNewMenu.add(mntmAcercaDe);
		
		
		mnNewMenu.add(separator);
		mntmSalir.setIcon(new ImageIcon(Calculadora.class.getResource("/E08Calculadora/Imagenes/close.png")));
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		
		mnNewMenu.add(mntmSalir);
	}

	private void botonesEvent() {
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
			txtResultado.setText(txtResultado.getText() + button_0.getText());

		} else if (source == button_1) {
			txtResultado.setText(txtResultado.getText() + button_1.getText());
		} else if (source == button_2) {
			txtResultado.setText(txtResultado.getText() + button_2.getText());
		} else if (source == button_3) {
			txtResultado.setText(txtResultado.getText() + button_3.getText());
		} else if (source == button_4) {
			txtResultado.setText(txtResultado.getText() + button_4.getText());
		} else if (source == button_5) {
			txtResultado.setText(txtResultado.getText() + button_5.getText());
		} else if (source == button_6) {
			txtResultado.setText(txtResultado.getText() + button_6.getText());
		} else if (source == button_7) {
			txtResultado.setText(txtResultado.getText() + button_7.getText());
		} else if (source == button_8) {
			txtResultado.setText(txtResultado.getText() + button_8.getText());
		} else if (source == button_9) {
			txtResultado.setText(txtResultado.getText() + button_9.getText());
		}

		/* btn-BORRADO */
		else if (source == btnClear) {
			txtResultado.setText("");
		} else if (source == button_punto) {
			txtResultado.setText(txtResultado.getText() + button_punto.getText());
		}

		/* btn-OPERACIONES */
		else if (source == button_sumar) {
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 1;
		} else if (source == button_resta) {
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 2;
		} else if (source == button_multi) {
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 3;
		} else if (source == button_division) {
			numero = Double.parseDouble(txtResultado.getText());
			txtResultado.setText("");
			refCalculo = 4;
		} else if (source == btnSqrt) {
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
