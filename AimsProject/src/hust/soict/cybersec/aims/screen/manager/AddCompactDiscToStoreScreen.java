package hust.soict.cybersec.aims.screen.manager;

import hust.soict.cybersec.aims.store.*;
import hust.soict.cybersec.aims.media.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
	private JTextField tfId;
	private JTextField tfTitle;
	private JTextField tfCategory;
	private JTextField tfDirector;
	private JTextField tfLength;
	private JTextField tfCost;
	private JTextField tfArtist;
	
	public AddCompactDiscToStoreScreen(Store store) {
		super(store);
		
	}
	
	public JPanel createCenter() {
		ButtonListener btnListener = new ButtonListener();
		
		JPanel center = new JPanel();
		
		center.setLayout(new GridLayout(8, 2));
		
		
		JLabel enterId = new JLabel("Enter the ID of the CD:", SwingConstants.CENTER);
		enterId.setFont(new Font(enterId.getFont().getName(), Font.PLAIN, 15));
		enterId.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterId);
		
		tfId = new JTextField(10);
		center.add(tfId);
		
		JLabel enterTitle = new JLabel("Enter the Title of the CD:", SwingConstants.CENTER);
		enterTitle.setFont(new Font(enterTitle.getFont().getName(), Font.PLAIN, 15));
		enterTitle.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterTitle);
		
		tfTitle = new JTextField(50);
		center.add(tfTitle);
		
		JLabel enterCategory = new JLabel("Enter the Category of the CD:", SwingConstants.CENTER);
		enterCategory.setFont(new Font(enterCategory.getFont().getName(), Font.PLAIN, 15));
		enterCategory.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterCategory);
		
		tfCategory = new JTextField(50);
		center.add(tfCategory);
		
		JLabel enterDirector = new JLabel("Enter the Director of the CD:", SwingConstants.CENTER);
		enterDirector.setFont(new Font(enterDirector.getFont().getName(), Font.PLAIN, 15));
		enterDirector.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterDirector);
		
		tfDirector = new JTextField(10);
		center.add(tfDirector);
		
		JLabel enterLength = new JLabel("Enter the Length of the CD:", SwingConstants.CENTER);
		enterLength.setFont(new Font(enterLength.getFont().getName(), Font.PLAIN, 15));
		enterLength.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterLength);
		
		tfLength = new JTextField(50);
		center.add(tfLength);
		
		JLabel enterCost = new JLabel("Enter the Cost of the CD:", SwingConstants.CENTER);
		enterCost.setFont(new Font(enterCost.getFont().getName(), Font.PLAIN, 15));
		enterCost.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterCost);
		
		tfCost = new JTextField(50);
		center.add(tfCost);
		
		JLabel enterArtist = new JLabel("Enter the Artist of the CD:", SwingConstants.CENTER);
		enterArtist.setFont(new Font(enterArtist.getFont().getName(), Font.PLAIN, 15));
		enterArtist.setAlignmentX(CENTER_ALIGNMENT);
		center.add(enterArtist);
		
		tfArtist = new JTextField(50);
		center.add(tfArtist);
		
		
		center.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addActionListener(btnListener);
		
		container.add(confirmButton);
		
		center.add(Box.createVerticalGlue());
		center.add(container);
		
		
		return center;
	}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if(button.equals("Confirm")) {
				int id = Integer.parseInt(tfId.getText());
				String title = tfTitle.getText();
				String category = tfCategory.getText();
				String director = tfDirector.getText();
				int length = Integer.parseInt(tfLength.getText());
				float cost = Float.parseFloat(tfCost.getText());
				String artist = tfArtist.getText();
				
				
				CompactDisc toAddCD = new CompactDisc(10, "Huhu", "CD", 8.88f, 8, "Vanh", "Vanh2", null);
				
				store.addMedia(toAddCD);
				
				JOptionPane.showMessageDialog(null, "CD added successfully");
			}
		}
	}
}