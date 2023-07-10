package registeration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserRegister {

	private JFrame frame;
	private JTextField name;
	private JTextField name2;
	private JTextField age;
	private JTextField email;
	private JTextField numb;
	private JTextField clgname;
	private JTextField cmpname;
	private JTextField address;
	private JTextField parentname;
	private JTextField parentno;
	private JTextField id;
	private JTextField cname;
	private JTextField cfee;
	private JTextField due;
	private JTextField paid;
	private JTextField id1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegister  window = new UserRegister ();
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
	public UserRegister () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 480, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ainwik Infotech Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(87, 11, 269, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:-");
		lblNewLabel_2.setBounds(118, 53, 73, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(186, 53, 96, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:-");
		lblNewLabel_3.setBounds(292, 53, 78, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		name2 = new JTextField();
		name2.setBounds(360, 53, 96, 20);
		frame.getContentPane().add(name2);
		name2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age:-");
		lblNewLabel_4.setBounds(10, 91, 49, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		age = new JTextField();
		age.setBounds(58, 90, 96, 20);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email:-");
		lblNewLabel_5.setBounds(182, 93, 49, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		email = new JTextField();
		email.setBounds(241, 90, 201, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Contect Number:*");
		lblNewLabel_6.setBounds(10, 137, 114, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		numb = new JTextField();
		numb.setBounds(134, 134, 182, 20);
		frame.getContentPane().add(numb);
		numb.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Education : Degree and professional qualifications:-");
		lblNewLabel_7.setBounds(10, 162, 346, 29);
		frame.getContentPane().add(lblNewLabel_7);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Graduate");
		chckbxNewCheckBox.setBounds(6, 198, 87, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Post Graduate");
		chckbxNewCheckBox_1.setBounds(103, 198, 128, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Other");
		chckbxNewCheckBox_2.setBounds(252, 198, 64, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_8 = new JLabel("University / College Name:-");
		lblNewLabel_8.setBounds(10, 228, 181, 19);
		frame.getContentPane().add(lblNewLabel_8);
		
		clgname = new JTextField();
		clgname.setBounds(201, 227, 241, 20);
		frame.getContentPane().add(clgname);
		clgname.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Professional Experience (in years):-");
		lblNewLabel_9.setBounds(10, 265, 296, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("0-1");
		chckbxNewCheckBox_3.setBounds(6, 290, 53, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("1-2");
		chckbxNewCheckBox_4.setBounds(71, 290, 49, 23);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("2-3");
		chckbxNewCheckBox_5.setBounds(134, 290, 49, 23);
		frame.getContentPane().add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("3-4");
		chckbxNewCheckBox_6.setBounds(196, 290, 49, 23);
		frame.getContentPane().add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("4-5");
		chckbxNewCheckBox_7.setBounds(257, 290, 49, 23);
		frame.getContentPane().add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("5+");
		chckbxNewCheckBox_8.setBounds(321, 290, 49, 23);
		frame.getContentPane().add(chckbxNewCheckBox_8);
		
		JLabel lblNewLabel_10 = new JLabel("Company Name:-");
		lblNewLabel_10.setBounds(10, 333, 114, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		cmpname = new JTextField();
		cmpname.setBounds(118, 330, 290, 20);
		frame.getContentPane().add(cmpname);
		cmpname.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Correspondence Address*");
		lblNewLabel_11.setBounds(10, 358, 160, 23);
		frame.getContentPane().add(lblNewLabel_11);
		
		address = new JTextField();
		address.setBounds(172, 361, 256, 20);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Father’s / Guardian Name*");
		lblNewLabel_12.setBounds(10, 392, 160, 19);
		frame.getContentPane().add(lblNewLabel_12);
		
		parentname = new JTextField();
		parentname.setBounds(172, 392, 144, 20);
		frame.getContentPane().add(parentname);
		parentname.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Guardian Mobile Number:*");
		lblNewLabel_13.setBounds(10, 422, 160, 26);
		frame.getContentPane().add(lblNewLabel_13);
		
		parentno = new JTextField();
		parentno.setBounds(182, 425, 134, 20);
		frame.getContentPane().add(parentno);
		parentno.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Valid ID (Aadhar card / Voter ID / DL):");
		lblNewLabel_15.setBounds(10, 459, 224, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		id = new JTextField();
		id.setBounds(226, 456, 202, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		
		
		id1= new JTextField();
		id1.setBounds(226, 456, 202, 20);
		frame.getContentPane().add(id);
		id1.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Payment Details: (for official use only):-");
		lblNewLabel_16.setForeground(new Color(0, 0, 255));
		lblNewLabel_16.setBounds(10, 494, 256, 19);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Course Name:-");
		lblNewLabel_17.setBounds(10, 524, 96, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		cname = new JTextField();
		cname.setBounds(104, 524, 90, 20);
		frame.getContentPane().add(cname);
		cname.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Course Fee");
		lblNewLabel_18.setBounds(201, 524, 79, 14);
		frame.getContentPane().add(lblNewLabel_18);
		
		cfee = new JTextField();
		cfee.setBounds(270, 521, 73, 20);
		frame.getContentPane().add(cfee);
		cfee.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Amount Due:-");
		lblNewLabel_14.setBounds(10, 564, 83, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		due = new JTextField();
		due.setBounds(118, 561, 96, 20);
		frame.getContentPane().add(due);
		due.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Amount Paid:-");
		lblNewLabel_19.setBounds(226, 564, 117, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		paid = new JTextField();
		paid.setBounds(346, 561, 96, 20);
		frame.getContentPane().add(paid);
		paid.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstid = id1.getText();
				String firstname = name.getText();
				String lastname = name2.getText();
				String emailid = email.getText();
				String Age = age.getText();
				String coursename = cname.getText();
				String coursefee = cfee.getText();
				String adharid = id.getText();
				String pname = parentname.getText();
				String pnumber = parentno.getText();
				String amountpaid = paid.getText();
				String amountdue = due.getText();
				
				
				String msg = "" + firstname;
                msg += " \n";
                try {
                	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ainwik","root","Rashi");

                    String query = "INSERT INTO registeration values('" + firstid +"','"+ firstname + "','" + lastname + "','" + emailid + "','" +
                        Age + "','" + coursename + "','"+ coursefee + "','"+ adharid +"','"+pname + "','"  + pnumber + "','" + amountpaid +  "')";

                    Statement stmt = con.createStatement();
                    int x = stmt.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    }
                    else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    con.close();
                } 
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
				 
			
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setBounds(179, 600, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_30 = new JLabel("id");
		lblNewLabel_30.setBounds(14, 56, 45, 13);
		frame.getContentPane().add(lblNewLabel_30);
		
		id1 = new JTextField();
		id1.setBounds(35, 53, 64, 19);
		frame.getContentPane().add(id1);
		id1.setColumns(10);
	}
}

