package br.com.ufc.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.ufc.DAO.FuncionarioDAO;

import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;

public class TelaDeLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordSenha;
	private FuncionarioDAO funcionarioDAO;
	
	

	/**
	 * Launch the application.
	 */
	JFormattedTextField formattedTextFieldCpf = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin frame = new TelaDeLogin();
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
	
	public void receberDAO(FuncionarioDAO funcionarioDAO) {
		this.funcionarioDAO=funcionarioDAO;
		
	}
	public TelaDeLogin() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 522);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(202, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(175))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(136)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cpf=formattedTextFieldCpf.getText();
				String senha= new String (passwordSenha.getPassword());
				
				 String resultado=funcionarioDAO.consultar(cpf, senha);
				 
				 if(resultado.equals("Banco não possui esse funcionario, ou o CPF informado ta errado")) {
					 
					 JOptionPane.showMessageDialog(contentPane,"Banco não possui esse funcionario, ou o CPF informado ta errado");
					 
					 formattedTextFieldCpf.setText("");
					 passwordSenha.setText("");
					 	 
				 }
				 
				 else if(resultado.equals("senha incorreta")) {
					 
					 JOptionPane.showMessageDialog(contentPane,"senha incorreta");
					 
					 passwordSenha.setText("");
					 
				 }
				 
				 else {
					 
					 TelaDeMenu telaDeMenu=new TelaDeMenu();
					 telaDeMenu.setVisible(true);
					 
				 }
					
				
				
				
				
				
				
				
			}
		});
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDeCadastroDeFuncionario telaDeCadastroDeFuncionario= new TelaDeCadastroDeFuncionario();
				telaDeCadastroDeFuncionario.setVisible(true);
				
				
			}
		});
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 14));
		
		passwordSenha = new JPasswordField();
		
		//JFormattedTextField formattedTextFieldCpf = null;
		try {
			formattedTextFieldCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			formattedTextFieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		} catch (ParseException e1) {
			// TODO Bloco catch gerado automaticamente
			e1.printStackTrace();
		}
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblSenha)
						.addComponent(lblCpf))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnEntrar)
							.addGap(18)
							.addComponent(btnCadastrar)
							.addGap(54))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(formattedTextFieldCpf, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
								.addComponent(passwordSenha, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
							.addGap(49))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(64, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(formattedTextFieldCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(passwordSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEntrar)
						.addComponent(btnCadastrar))
					.addGap(28))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
