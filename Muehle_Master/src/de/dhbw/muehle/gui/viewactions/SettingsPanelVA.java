package de.dhbw.muehle.gui.viewactions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import de.dhbw.muehle.gui.ViewController;
import de.dhbw.muehle.gui.menus.GamePanel.LblGameStone;

public class SettingsPanelVA {
	
	ViewController vController;
	
	
	public SettingsPanelVA(ViewController vController) {
		this.vController = vController;
	}
	
	/**
	 * ActionListener
	 */
//	{
		//btnBack
		public class btnBack implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				vController.displayMainMenu();
			}
		}
//	}
		
		
		
	/**
	 * ItemListener
	 */
//	{
		//themeSelector
		public class themeSelector implements ItemListener{
			@Override
			public void itemStateChanged(ItemEvent e) {
				vController.setTheme((String) e.getItem());
			}
		}
//	}
}