package ru.lesson.miner.gui;


import ru.lesson.miner.Cell;
import ru.lesson.miner.GeneratingOfBoard;
import ru.lesson.miner.logics.BaseLogics;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
/*
made by ilyjava (i love you java) =)
alfa-version
*/
public class Main  {
	private static final JPanel controlPanel = new JPanel();
	private static final BoardGUI board = new BoardGUI();

	public static void main(String[] arg) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final JFrame frame = new JFrame();
				frame.setTitle("�����");
				frame.setLayout(new BorderLayout());
				frame.setSize(500, 500);
				frame.add(board, BorderLayout.CENTER);
                board.setBorder(new EmptyBorder(10, 10, 10, 10));
				frame.add(controlPanel, BorderLayout.PAGE_END);
				controlPanel.setLayout(new FlowLayout());

				final JButton generate = new JButton("������");

				generate.addActionListener(
						new ActionGUI(
						new BaseLogics(), board,
						new GeneratingOfBoardGUI(8)
				));

				controlPanel.add(generate);
				centre(frame);
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						closePerform(frame);
					}
				});
				frame.setVisible(true);
			}
		});
	}

	public static void centre(Window w) {
		Dimension us = w.getSize();
		Dimension them = Toolkit.getDefaultToolkit().getScreenSize();
		int newX = (them.width - us.width) / 2;
		int newY = (them.height - us.height) / 2;
		w.setLocation(newX, newY);
	}

	public static void closePerform(JFrame frame) {
		frame.setVisible(false);
		frame.dispose();
		System.exit(0);
	}
}
