
/**  Autor: Rafael Lima Pereira
 * 	Tecnologia em Redes de Computadores	
 * 	Universidade Federal do Ceará
 * 	Programação Orientada a Objetos
 * 	Prof. Julio Martins 
 * 
 * Data de inicio: 09/11/2019
 * Data de Conclusão: 15/11/2019
 * 
 * 
 
 * **/

package br.com.ufc.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textCpf;
	private JTextField textIdade;
	private JTextField textNome;
	private JTable table;
	private PessoaDAO pessoaDAO;
	
	



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
		PessoaDAO pessoaDAO=new PessoaDAO();
		this.pessoaDAO=pessoaDAO;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 422);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
		);
		
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				
				
				new Object[][] {
					
				},
				
				
				new String[] {
						"Nome","CPF","Idade"
						
				}
				
				
				
				));
		
		
		
		
		
		
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
				 Pessoa pessoa=new Pessoa();
				 pessoa.setNome(textNome.getText());
				 pessoa.setCpf(textCpf.getText());
				 pessoa.setIdade(Integer.parseInt(textIdade.getText()));
				
				 JOptionPane.showMessageDialog(contentPane,pessoaDAO.adicionar(pessoa));
			
				textNome.setText("");
				textCpf.setText("");
				textIdade.setText("");
				 atualizar();
				 
				 
				 
				 
				
				
				
			}
		});
		btnCadastrar.setBackground(SystemColor.scrollbar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int indice=table.getSelectedRow();
				if(table.getSelectedRow()!=-1) {
					
					DefaultTableModel pessoas=(DefaultTableModel) table.getModel();
					pessoas.removeRow(table.getSelectedRow());
					pessoaDAO.remover(indice);
					
					
				}
				
				else {
					JOptionPane.showMessageDialog(null,"Selecione uma pessoa para remover");
					
					
				}
				atualizar();
			}
		});
		
				
				
				
				
				
				
				
			
			
			
		
		btnRemover.setBackground(SystemColor.activeCaptionBorder);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(SystemColor.scrollbar);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(8)
									.addComponent(lblCpf))
								.addComponent(lblIdade))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNome, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)))
						.addGroup(Alignment.LEADING, gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnAtualizar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCadastrar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnRemover, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
					.addGap(89))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(94)
					.addComponent(lblCadastro)
					.addContainerGap(134, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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
	public void relistar() {
		DefaultTableModel tabela= (DefaultTableModel) table.getModel();
		Object rowData[]= new Object[4];
		
		List<Pessoa> pessoas=pessoaDAO.retornarListaDePessoas();
		
		for(int i=0;i<pessoas.size();i++) {
			
			rowData[0]= pessoas.get(i).getNome();
			rowData[1]= pessoas.get(i).getCpf();
			rowData[2]= pessoas.get(i).getIdade();
			tabela.addRow(rowData);
			
		}
			
			
		}
	public void atualizar() {
		DefaultTableModel pessoas= (DefaultTableModel) table.getModel();
		
		int rowCount=pessoas.getRowCount();
		for(int i= rowCount-1;i>=0;i--) {
			
			pessoas.removeRow(i);
			
		}
		
		
		relistar();
	}
	 
}
