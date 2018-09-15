package com.prs.gui;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import com.prs.game.Round;
import com.prs.gestures.Game;
import com.prs.gestures.Gesture;

public class PrsGui {

	private static JLabel computerGestureIcon;
	private static JLabel scoreLabel;
	private static JList<String> scoreList;

	public static void main(String args[]) {
		Game game = new Game();
		JFrame frame = new JFrame("Paper Rock Scissor Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(300, 300);
		GridLayout gridLayout = new GridLayout(2, 3);
		frame.setLayout(gridLayout);

		ImageIcon imageIcon;

		ButtonGroup buttonGroup = new ButtonGroup();

		for (Gesture gesture : Gesture.values()) {
			imageIcon = createImageIcon(gesture.getImage());
			JToggleButton button = new JToggleButton(imageIcon);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					boolean isSelected = ((AbstractButton) e.getSource()).getModel().isSelected();
					if (isSelected) {

						Round round = game.playRound(gesture);
						round.getComputerGesture();
						computerGestureIcon.setIcon(new ImageIcon(round.getComputerGesture().getImage()));
						scoreLabel.setText(round.getResult().getDescription());

						DefaultListModel<String> listModel = (DefaultListModel<String>) scoreList.getModel();
						listModel.addElement((listModel.size() + 1) + " --> " + round.getResult().getDescription());

					}
				}
			});
			buttonGroup.add(button);
			frame.getContentPane().add(button);
		}

		computerGestureIcon = new JLabel();
		frame.getContentPane().add(computerGestureIcon);
		scoreLabel = new JLabel();
		scoreLabel.setFont(new Font(scoreLabel.getName(), Font.PLAIN, 36));
		frame.getContentPane().add(scoreLabel);
		scoreList = new JList<String>(new DefaultListModel<String>());
		JScrollPane scrollPane = new JScrollPane(scoreList);
		frame.getContentPane().add(scrollPane);
		frame.pack();
		frame.setVisible(true);
	}

	public static ImageIcon createImageIcon(String path) {
		return new ImageIcon(path);
	}
}
