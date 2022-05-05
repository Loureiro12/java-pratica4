package pratica4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pratica3.questao1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField textValor;
	private JTextField textQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao2 frame = new questao2();
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
	public questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora Bovina");
		lblNewLabel.setBounds(162, 6, 125, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor da Arroba");
		lblNewLabel_1.setBounds(30, 76, 102, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidades de Arrobas");
		lblNewLabel_2.setBounds(30, 117, 164, 16);
		contentPane.add(lblNewLabel_2);
		
		textValor = new JTextField();
		textValor.setBounds(157, 71, 130, 26);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(189, 112, 130, 26);
		contentPane.add(textQuantidade);
		textQuantidade.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular total a pagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(textValor.getText());
				int quantidade = Integer.parseInt(textQuantidade.getText());
				
				int resultado = valor * quantidade;
				
				JOptionPane.showMessageDialog(null, "O valor a pagar é: " + resultado);
			}
		});
		btnNewButton.setBounds(122, 226, 223, 29);
		contentPane.add(btnNewButton);
	}
}
