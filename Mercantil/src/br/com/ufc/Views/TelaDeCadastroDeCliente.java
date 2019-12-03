package br.com.ufc.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeCadastroDeCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JFormattedTextField formattedTextFieldcPF_1;
	private JFormattedTextField formattedTextFieldTelefone_1;
	private JFormattedTextField formattedTextFieldNascimento_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastroDeCliente frame = new TelaDeCadastroDeCliente();
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
	public TelaDeCadastroDeCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 252);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Arial", Font.BOLD, 14));
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		JLabel lblCadastroDeCliente = new JLabel("CADASTRO DE CLIENTE");
		lblCadastroDeCliente.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastroDeCliente.setBackground(UIManager.getColor("TextPane.selectionForeground"));
		
		JFormattedTextField formattedTextFieldcPF = null;
		try {
			formattedTextFieldcPF_1 = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		}
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 14));
		
		JFormattedTextField formattedTextFieldTelefone = null;
		try {
			formattedTextFieldTelefone_1 = new JFormattedTextField(new MaskFormatter("(##)#  ########"));
		} catch (ParseException e1) {
			// TODO Bloco catch gerado automaticamente
			e1.printStackTrace();
		}
		
		JFormattedTextField formattedTextFieldNascimento = null;
		try {
			formattedTextFieldNascimento_1 = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		}
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCpf)
									.addGap(18)
									.addComponent(formattedTextFieldcPF_1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblTelefone)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(formattedTextFieldTelefone_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addGap(145))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNome)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(195)
							.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar)))
					.addContainerGap(155, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(190, Short.MAX_VALUE)
					.addComponent(lblCadastroDeCliente)
					.addGap(200))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDataDeNascimento)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextFieldNascimento_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(399, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblCadastroDeCliente)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(lblTelefone)
						.addComponent(formattedTextFieldTelefone_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextFieldcPF_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(formattedTextFieldNascimento_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(47))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
