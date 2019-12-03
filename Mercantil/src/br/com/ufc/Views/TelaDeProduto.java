package br.com.ufc.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

public class TelaDeProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldPreco;
	private JTextField textFieldQuantidade;
	private JFormattedTextField formattedTextFieldFabricacao_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeProduto frame = new TelaDeProduto();
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
	public TelaDeProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		
		textFieldPreco = new JTextField();
		textFieldPreco.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Arial", Font.BOLD, 14));
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setColumns(10);
		
		JLabel lblDataDeFabricao = new JLabel("Data de Fabrica\u00E7\u00E3o:");
		lblDataDeFabricao.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDataDeVencimento = new JLabel("Data de Vencimento:");
		lblDataDeVencimento.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JLabel lblCadastroDeProduto = new JLabel("CADASTRO DE PRODUTO");
		lblCadastroDeProduto.setFont(new Font("Arial", Font.BOLD, 20));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"               ", "Alimento", "Limpeza", "Higiene"}));
		
		JFormattedTextField formattedTextFieldFabricacao = null;
		try {
			formattedTextFieldFabricacao_1 = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		}
		
		JFormattedTextField formattedTextFieldVencimento = null;
		try {
			formattedTextFieldVencimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
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
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNome)
										.addComponent(lblPreo))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textFieldPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblQuantidade)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textFieldQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(95)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDataDeVencimento)
										.addComponent(lblDataDeFabricao))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(formattedTextFieldVencimento)
										.addComponent(formattedTextFieldFabricacao_1, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(240)
							.addComponent(btnCadastrar)
							.addGap(18)
							.addComponent(btnCancelar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(198)
							.addComponent(lblCadastroDeProduto)))
					.addGap(91))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblCadastroDeProduto)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreo)
						.addComponent(lblQuantidade)
						.addComponent(textFieldQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeFabricao)
						.addComponent(formattedTextFieldFabricacao_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeVencimento)
						.addComponent(formattedTextFieldVencimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnCadastrar)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
