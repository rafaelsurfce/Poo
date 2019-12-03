package br.com.ufc.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaInforDeCompras extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInforDeCompras frame = new TelaInforDeCompras();
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
	public TelaInforDeCompras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es de Venda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Cliente:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDataEHora = new JLabel("Data e Hora de Compra:");
		lblDataEHora.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblVendedor = new JLabel("Vendedor:");
		lblVendedor.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblNewLabelNumero = new JLabel("");
		
		JLabel lblNewLabelCliente = new JLabel("");
		
		JLabel lblNewLabelVendedor = new JLabel("");
		
		JLabel lblNewLabelData = new JLabel("");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblValorTotal = new JLabel("Valor total: R$");
		lblValorTotal.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblNewLabelTotal = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabelCliente)
					.addContainerGap(583, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(56)
					.addComponent(lblNumero)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabelNumero)
							.addPreferredGap(ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
							.addComponent(lblNewLabelData)
							.addGap(112))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblDataEHora)
							.addGap(131))))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVendedor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabelVendedor)
					.addContainerGap(564, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(216, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblValorTotal)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabelTotal)
					.addContainerGap(516, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero)
						.addComponent(lblNewLabelNumero)
						.addComponent(lblNewLabelData)
						.addComponent(lblDataEHora))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(lblNewLabelCliente))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVendedor)
						.addComponent(lblNewLabelVendedor))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValorTotal)
						.addComponent(lblNewLabelTotal))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
		);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
				new Object [][] {},
				new String [] {
						
						"Numero"," Nome", "Preço"
						
						
				}
				
				
				
				
				
				
				
				));
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
