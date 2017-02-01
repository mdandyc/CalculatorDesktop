import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField Angka1;
	private JTextField Angka2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAngka = new JLabel("Angka");
		lblAngka.setBounds(55, 50, 46, 14);
		frame.getContentPane().add(lblAngka);
		
		JLabel label = new JLabel("Angka");
		label.setBounds(55, 108, 46, 14);
		frame.getContentPane().add(label);
		
		Angka1 = new JTextField();
		Angka1.setBounds(55, 75, 86, 20);
		frame.getContentPane().add(Angka1);
		Angka1.setColumns(10);
		
		Angka2 = new JTextField();
		Angka2.setColumns(10);
		Angka2.setBounds(55, 133, 86, 20);
		frame.getContentPane().add(Angka2);
		
		JRadioButton rdbtnTambah = new JRadioButton("Tambah");
		buttonGroup.add(rdbtnTambah);
		rdbtnTambah.setBounds(55, 165, 109, 23);
		frame.getContentPane().add(rdbtnTambah);
		
		JRadioButton rdbtnKurang = new JRadioButton("Kurang");
		buttonGroup.add(rdbtnKurang);
		rdbtnKurang.setBounds(55, 191, 109, 23);
		frame.getContentPane().add(rdbtnKurang);
		
		JRadioButton rdbtnBagi = new JRadioButton("Bagi");
		buttonGroup.add(rdbtnBagi);
		rdbtnBagi.setBounds(166, 165, 109, 23);
		frame.getContentPane().add(rdbtnBagi);
		
		JRadioButton rdbtnKali = new JRadioButton("Kali");
		buttonGroup.add(rdbtnKali);
		rdbtnKali.setBounds(166, 191, 109, 23);
		frame.getContentPane().add(rdbtnKali);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String angkake1=Angka1.getText();
				String angkake2=Angka2.getText();
				int angkake1v2=Integer.parseInt(angkake1);
				int angkake2v2=Integer.parseInt(angkake2);
				int nilai;
				String keterangan;
				
				if(rdbtnTambah.isSelected()){
					nilai=angkake1v2+angkake2v2;
				}else if(rdbtnKurang.isSelected()){
					nilai=angkake1v2-angkake2v2;
				}else if (rdbtnBagi.isSelected()){
					nilai=angkake1v2/angkake2v2;
				}else{
					nilai=angkake1v2*angkake2v2;
				}
				JOptionPane.showMessageDialog(null,nilai);
			}
		});
		btnOk.setBounds(55, 221, 89, 23);
		frame.getContentPane().add(btnOk);
	}
}
