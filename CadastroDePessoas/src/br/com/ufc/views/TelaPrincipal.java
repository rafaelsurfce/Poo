package br.com.ufc.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.DAOS.PessoaDAO;
import br.com.ufc.model.Pessoa;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTable;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textCpf;
	private JTextField textIdade;
	private JTextField textNome;
	private JTable tablePessoa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		
		tablePessoa = new JTable();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tablePessoa, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tablePessoa, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PessoaDAO pessoaDAO=new PessoaDAO();
				Pessoa pessoa=new Pessoa();
				 pessoa.setNome(textNome.getText());
				 pessoa.setCpf(textCpf.getText());
				 pessoa.setIdade(Integer.parseInt(textIdade.getText()));
				

				 if(pessoaDAO.adicionar(pessoa)==true) {
					 JOptionPane.showMessageDialog(contentPane,"Pessoa Adicionada com sucesso");
				 }
				 
				 else if(pessoaDAO.adicionar(pessoa)==false) {
					 JOptionPane.showMessageDialog(contentPane,"Pessoa já consta no banco de dados");
					 
				 }
				 
				 pessoaDAO.listar();
				
				
				
			}
		});
		btnCadastrar.setBackground(SystemColor.scrollbar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(SystemColor.activeCaptionBorder);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textNome, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(8)
											.addComponent(lblCpf))
										.addComponent(lblIdade))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
								.addComponent(btnAtualizar)
								.addComponent(btnCadastrar)
								.addComponent(btnRemover)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(96)
							.addComponent(lblCadastro)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCadastro)
					.addGap(120)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdade)
						.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addComponent(btnCadastrar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAtualizar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRemover)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
