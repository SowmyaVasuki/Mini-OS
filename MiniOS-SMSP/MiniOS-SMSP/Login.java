import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class Login {

	private JFrame frame;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\one.png"));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 558, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterPassword = new JLabel("PASSWORD");
		lblEnterPassword.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
		lblEnterPassword.setForeground(Color.WHITE);
		lblEnterPassword.setBounds(217, 109, 114, 36);
		frame.getContentPane().add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 145, 114, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Viner Hand ITC", Font.BOLD, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass=passwordField.getText();
				
				if(pass.equals("smsp"))
				{
					new Desktop().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Invalid password.Try again!");
				}
			}
		});
		btnLogin.setBounds(238, 187, 68, 23);
		frame.getContentPane().add(btnLogin);
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Sowmya Vasuki\\Downloads\\MiniOS-Lazzarus--master\\MiniOS-Lazzarus--master\\if_user_285655.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(238, 25, 68, 73);
		frame.getContentPane().add(btnNewButton);
	}
}
