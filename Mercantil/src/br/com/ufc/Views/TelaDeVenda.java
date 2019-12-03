package br.com.ufc.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeVenda extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTable tableProdutos;
	private JTable tableCompras;
	private JTextField textFieldPesquisar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeVenda frame = new TelaDeVenda();
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
	public TelaDeVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 735);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Venda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Arial", Font.BOLD, 14));
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setBackground(Color.WHITE);
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorTotal.setForeground(Color.RED);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblProdutos = new JLabel("PRODUTOS");
		lblProdutos.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblCarinhoDeCompras = new JLabel("Carrinho de compras");
		lblCarinhoDeCompras.setFont(new Font("Arial", Font.BOLD, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		textFieldPesquisar = new JTextField();
		textFieldPesquisar.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("Pesquisar:");
		lblPesquisar.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton btnComprar = new JButton("Comprar");
		
		JButton btnDevolver = new JButton("Devolver");
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBackground(UIManager.getColor("ToggleButton.darkShadow"));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(UIManager.getColor("TextPane.inactiveForeground"));
		
		JButton btnSelecionarCliente = new JButton("Selecionar Cliente");
		btnSelecionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaDeConsultaDeCliente telaDeConsultaDeCliente=new TelaDeConsultaDeCliente();
				telaDeConsultaDeCliente.setVisible(true);
			}
		});
		
		JButton btnPesquisar = new JButton("Pesquisar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addComponent(lblCliente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSelecionarCliente)
					.addContainerGap(154, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(150)
					.addComponent(lblProdutos)
					.addPreferredGap(ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
					.addComponent(lblCarinhoDeCompras)
					.addGap(167))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblPesquisar)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldPesquisar))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnComprar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnFinalizar))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(btnPesquisar)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnDevolver, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addGap(120)
								.addComponent(lblValorTotal)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(69)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSelecionarCliente))
					.addGap(75)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPesquisar)
						.addComponent(textFieldPesquisar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProdutos)
						.addComponent(lblCarinhoDeCompras))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(btnDevolver))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lblValorTotal)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(btnComprar)
							.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnFinalizar)
								.addComponent(btnCancelar))
							.addGap(31)))
					.addGap(60))
		);
		
		tableCompras = new JTable();
		
		tableCompras.setModel(new DefaultTableModel(
				
				new Object[][] {},
				new String[] {
						
						"Numero", "Nome","Preço "
						
						
				}
				
				
				
				
				));
		scrollPane_1.setViewportView(tableCompras);
		
		tableProdutos = new JTable();
		
tableProdutos.setModel(new DefaultTableModel(
				
				new Object[][] {},
				new String[] {
						
						"Numero", "Nome","Preço ","Quantidade"
						
						
				}
				
				
				
				
				));
		
		
		scrollPane.setViewportView(tableProdutos);
		
		JLabel labelReais = new JLabel("R$");
		labelReais.setForeground(Color.BLACK);
		labelReais.setFont(new Font("Arial", Font.BOLD, 60));
		
		JLabel labelTotal = new JLabel("0");
		labelTotal.setForeground(Color.RED);
		labelTotal.setFont(new Font("Arial", Font.BOLD, 55));
		labelTotal.setHorizontalAlignment(SwingConstants.TRAILING);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(labelReais, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(labelTotal)
					.addGap(90))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(labelReais, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addComponent(labelTotal))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
