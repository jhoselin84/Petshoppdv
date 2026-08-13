package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmFornecedor extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFornecedor dialog = new frmFornecedor();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public frmFornecedor() {
		setResizable(false);
		setTitle("Fornecedores");
		setBounds(100, 100, 640, 480);

		// iniciar centralizado
				setLocationRelativeTo(null);
				getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Nome");
				lblNewLabel.setBounds(40, 135, 46, 14);
				getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Fone");
				lblNewLabel_1.setBounds(40, 163, 46, 14);
				getContentPane().add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("E-mail");
				lblNewLabel_2.setBounds(40, 201, 46, 14);
				getContentPane().add(lblNewLabel_2);
				
				textField = new JTextField();
				textField.setBounds(78, 132, 296, 20);
				getContentPane().add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setBounds(78, 160, 253, 20);
				getContentPane().add(textField_1);
				textField_1.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setBounds(78, 199, 500, 17);
				getContentPane().add(textField_2);
				textField_2.setColumns(10);
				
				JButton btnNewButton = new JButton("Adicionar");
				btnNewButton.setBounds(40, 322, 89, 23);
				getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Editar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_1.setBounds(161, 322, 89, 23);
				getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("Excluir");
				btnNewButton_2.setBounds(285, 322, 89, 23);
				getContentPane().add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("Relatorio");
				btnNewButton_3.setBounds(438, 322, 89, 23);
				getContentPane().add(btnNewButton_3);
				
				JLabel lblNewLabel_3 = new JLabel("ID");
				lblNewLabel_3.setBounds(40, 95, 46, 14);
				getContentPane().add(lblNewLabel_3);
				
				textField_3 = new JTextField();
				textField_3.setBounds(78, 92, 86, 20);
				getContentPane().add(textField_3);
				textField_3.setColumns(10);
				
				JButton btnNewButton_4 = new JButton("Buscar");
				btnNewButton_4.setBounds(384, 131, 89, 23);
				getContentPane().add(btnNewButton_4);
				
	}//fim do construtor
}
