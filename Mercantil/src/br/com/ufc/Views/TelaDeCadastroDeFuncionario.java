package br.com.ufc.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.ufc.DAO.FuncionarioDAO;
import br.com.ufc.Model.Funcionario;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;

public class TelaDeCadastroDeFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JPasswordField passwordSenha;
	private JPasswordField passwordConfSenha;

	/**
	 * Launch the application.
	 */
	JFormattedTextField formattedTextFieldCpf = null;
	JFormattedTextField formattedTextFieldNascimento = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastroDeFuncionario frame = new TelaDeCadastroDeFuncionario();
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
	
	public TelaDeCadastroDeFuncionario() {
		
		FuncionarioDAO funcionarioDAO= new FuncionarioDAO();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 694, 262);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 14));
		
		passwordSenha = new JPasswordField();
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Cadastro de Funcion\u00E1rio ");
		lblCadastroDeFuncionrio.setFont(new Font("Arial Black", Font.BOLD, 16));
		
		passwordConfSenha = new JPasswordField();
		
		JButton btnNewButtonCadastrar = new JButton("Cadastrar");
		btnNewButtonCadastrar.setBackground(Color.WHITE);
		btnNewButtonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario funcionario=new Funcionario();
				funcionario.setNome(textFieldNome.getText());
				
				
				
				
				funcionario.setCpf(formattedTextFieldCpf.getText());
				funcionario.setDataDeNascimento(formattedTextFieldNascimento.getText());
				
				funcionario.setSenha(new String(passwordSenha.getPassword()));
				String confSenha=new String (passwordConfSenha.getPassword());
				
				
				
				
				String resultado= funcionarioDAO.adicionar(funcionario, confSenha);
				
				if(resultado.equals("Senhas não correspondem")) {
				JOptionPane.showMessageDialog(contentPane,"Senhas não correspondem");
				limparSenha();
				}
				else {
				 if(resultado.equals("Funcionario já possui cadastro")) {
					JOptionPane.showMessageDialog(contentPane,"Usuário já se encontra cadastrado");
					
					limparTudo();
				}
				 else{
						JOptionPane.showMessageDialog(contentPane,"Usuário cadastrado com sucesso");
						limparTudo();
						dispose();
						TelaDeLogin telaDeLogin= new TelaDeLogin();
						telaDeLogin.setVisible(true);
					}
					
				}
				
				funcionarioDAO.listar();
				
				
				
			}
		});
		
		JButton btnNewButtonCancelar = new JButton("Cancelar");
		btnNewButtonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDeLogin telaDeLogin= new TelaDeLogin();
				dispose();
				telaDeLogin.setVisible(true);
				
				
				
			}
		});
		btnNewButtonCancelar.setBackground(Color.WHITE);
		
		//JFormattedTextField formattedTextFieldCpf = null;
		try {
			formattedTextFieldCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e1) {
			// TODO Bloco catch gerado automaticamente
			e1.printStackTrace();
		}
		
		//JFormattedTextField formattedTextFieldNascimento = null;
		try {
			formattedTextFieldNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			// TODO Bloco catch gerado automaticamente
			e1.printStackTrace();
		}
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCpf)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblSenha)
							.addComponent(lblNome)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(formattedTextFieldCpf)
								.addComponent(passwordSenha, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDataDeNascimento)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(formattedTextFieldNascimento, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblConfirmarSenha, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordConfSenha, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))))
					.addGap(36))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(225, Short.MAX_VALUE)
					.addComponent(lblCadastroDeFuncionrio)
					.addGap(197))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(228, Short.MAX_VALUE)
					.addComponent(btnNewButtonCadastrar)
					.addGap(18)
					.addComponent(btnNewButtonCancelar)
					.addGap(266))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblCadastroDeFuncionrio)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(lblCpf)
						.addComponent(formattedTextFieldCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextFieldNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(passwordSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConfirmarSenha)
						.addComponent(passwordConfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButtonCancelar)
						.addComponent(btnNewButtonCadastrar)))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void limparSenha() {
		
		passwordSenha.setText("");
		passwordConfSenha.setText("");
		
	}
public void limparTudo() {
		
	textFieldNome.setText("");
	formattedTextFieldCpf.setText("");
	formattedTextFieldNascimento.setText("");
	passwordSenha.setText("");
	passwordConfSenha.setText("");
		
	}
}
