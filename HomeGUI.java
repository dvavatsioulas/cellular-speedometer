//DEVELOPER: DIMITRIOS VAVATSIOULAS

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class HomeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField initialDistance;
	private JTextField initialDbm;
	private JTextField finalDbm;
	private JTextField timeSec;
	Calculator c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					HomeGUI frame = new HomeGUI();

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
	public HomeGUI() {
		c= new Calculator();
		setResizable(false);
		setTitle("Cellular Speedometer - Dimitris Vavatsioulas \u00A92020 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u03A5\u03BB\u03BF\u03C0\u03BF\u03AF\u03B7\u03C3\u03B7: \u0394\u03B7\u03BC\u03AE\u03C4\u03C1\u03B7\u03C2 \u0392\u03B1\u03B2\u03B1\u03C4\u03C3\u03B9\u03BF\u03CD\u03BB\u03B1\u03C2");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(168, 517, 268, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("στα πλαίσια του μαθήματος Κινητή & Διάχυτη Υπολογιστική με την επιμέλεια του υπεύθυνου διδάσκοντα Κ.Ψάννη\r\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 540, 604, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("\u03A5\u03C0\u03BF\u03BB\u03BF\u03B3\u03B9\u03C3\u03BC\u03CC\u03C2 \u03C4\u03B1\u03C7\u03CD\u03C4\u03B7\u03C4\u03B1\u03C2 \u03BA\u03B1\u03B9 \u03B1\u03C0\u03CC\u03C3\u03C4\u03B1\u03C3\u03B7\u03C2 \u03C3\u03B5 \u03B5\u03C0\u03AF\u03C0\u03B5\u03B4\u03B7 \u03B5\u03C0\u03B9\u03C6\u03AC\u03BD\u03B5\u03B9\u03B1 LOS");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1, 23, 609, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u03B1\u03C0\u03CC\u03C3\u03C4\u03B1\u03C3\u03B7 \u03BC\u03B5\u03C4\u03B1\u03BE\u03CD \u03BA\u03B5\u03C1\u03B1\u03AF\u03B1\u03C2 \u03BA\u03B1\u03B9 \u03C0\u03B1\u03C1\u03B1\u03BB\u03AE\u03C0\u03C4\u03B7/\u03C4\u03B5\u03C1\u03BC\u03B1\u03C4\u03B9\u03BA\u03BF\u03CD (m):");
		lblNewLabel_3.setBounds(131, 82, 349, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u03B9\u03C3\u03C7\u03CD\u03C2 \u03C0\u03B1\u03C1\u03B1\u03BB\u03AE\u03C0\u03C4\u03B7/\u03C4\u03B5\u03C1\u03BC\u03B1\u03C4\u03B9\u03BA\u03BF\u03CD (dBm)");
		lblNewLabel_4.setBounds(192, 166, 227, 16);
		contentPane.add(lblNewLabel_4);
		
		JTextArea result = new JTextArea();
		result.setEditable(false);
		result.setText("\u03B5\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B5 \u03B4\u03B5\u03B4\u03BF\u03BC\u03AD\u03BD\u03B1 \u03BA\u03B1\u03B9 \u03C0\u03B1\u03C4\u03AE\u03C3\u03C4\u03B5 \"\u03A5\u03C0\u03BF\u03BB\u03BF\u03B3\u03B9\u03C3\u03BC\u03CC\u03C2\"...");
		result.setBounds(24, 477, 564, 28);
		contentPane.add(result);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(8, 60, 602, 11);
		contentPane.add(separator);
		
		JLabel lblNewLabel_5 = new JLabel("\u03A4\u03B5\u03BB\u03B9\u03BA\u03AE \u03B9\u03C3\u03C7\u03CD\u03C2 \u03C0\u03B1\u03C1\u03B1\u03BB\u03AE\u03C0\u03C4\u03B7/\u03C4\u03B5\u03C1\u03BC\u03B1\u03C4\u03B9\u03BA\u03BF\u03CD (dBm):");
		lblNewLabel_5.setBounds(192, 248, 228, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Χρόνος που διανύθηκε (s):\r\n");
		lblNewLabel_6.setBounds(238, 332, 136, 16);
		contentPane.add(lblNewLabel_6);
		
		initialDistance = new JTextField();
		initialDistance.setBounds(270, 110, 72, 28);
		contentPane.add(initialDistance);
		initialDistance.setColumns(10);
		
		initialDbm = new JTextField();
		initialDbm.setBounds(270, 196, 72, 28);
		contentPane.add(initialDbm);
		initialDbm.setColumns(10);
		
		finalDbm = new JTextField();
		finalDbm.setBounds(270, 280, 72, 28);
		contentPane.add(finalDbm);
		finalDbm.setColumns(10);
		
		timeSec = new JTextField();
		timeSec.setBounds(270, 360, 72, 28);
		contentPane.add(timeSec);
		timeSec.setColumns(10);
		
		JButton btnNewButton = new JButton("\u03A5\u03C0\u03BF\u03BB\u03BF\u03B3\u03B9\u03C3\u03BC\u03CC\u03C2");
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton.setBounds(155, 410, 303, 38);
		contentPane.add(btnNewButton);
		DecimalFormat df2 = new DecimalFormat("##.##");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				try {
					double d0=Double.valueOf(initialDistance.getText());
					double pdbm=Double.valueOf(initialDbm.getText());;
					double pdbm_after_nsec=Double.valueOf(finalDbm.getText());;
					double diff_time=Double.valueOf(timeSec.getText());
					
					c.setVariables(d0, pdbm, pdbm_after_nsec, diff_time);
					c.calc();
					
					double finalD=c.getD1();
					double finalVelocity=c.getU_km_h();
					String ss = "Η απόσταση που διανύθηκε είναι "+df2.format(finalD) +"m και η μέση ταχύτητα κίνησης ήταν "+df2.format(finalVelocity)+" km/h";
					result.setText(ss);
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε σωστά τα ζητούμενα δεδομένα.");

					}
		
				
			}
		});

		

	}
}
