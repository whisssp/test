package test;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import component.BookDetail;
import java.awt.Color;
import java.awt.ComponentOrientation;

public class MainFrame extends JFrame {

	private JPanel contentPane = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					BookDetail bookDetail = new BookDetail();
					frame.addContent(bookDetail);
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1152, 864);
		this.setLocationRelativeTo(null);
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 81, 825);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel);
	}
	 
	public void addContent(JComponent component) {
		getContentPane().add(component);
		component.setBounds(112, 80, 1040, 650);
	}

}
