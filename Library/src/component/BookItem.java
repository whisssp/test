package component;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class BookItem extends JPanel {

	/**
	 * Create the panel.
	 */
	public BookItem(int i) {
		setPreferredSize(new Dimension(125, 180));
		this.setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		JPanel c = new JPanel();
		c.setPreferredSize(new Dimension(this.getWidth(), 40));
		c.setLayout(new GridLayout(2, 1, 0, 3));
		JLabel lblTitle = new JLabel("Ten tac pham");
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		for (int j = 0; j < 2; j++) {
			if (j == 0)
				panel_1.add(lblTitle);
			if (j == 1) {
				panel_2.setLayout(new BorderLayout(6, 0));
				panel_2.add(new JLabel("4.8"), BorderLayout.WEST);
				panel_2.add(new JLabel("500"), BorderLayout.EAST);
				
			}
		}
		this.add(panel, BorderLayout.CENTER);
		this.add(c, BorderLayout.SOUTH);
		
		c.add(panel_1);
		
		c.add(panel_2);
	}
	
}
