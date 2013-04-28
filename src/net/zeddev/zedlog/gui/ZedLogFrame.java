/* Copyright (C) 2013  Zachary Scott <zscott.dev@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.zeddev.zedlog.gui;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import net.zeddev.zedlog.Config;

/**
 * The main GUI frame.
 *
 * @author Zachary Scott <zscott.dev@gmail.com>
 */
public final class ZedLogFrame extends javax.swing.JFrame {

	/**
	 * Creates new form <code>ZedLogFrame</code>.
	 *
	 */
	public ZedLogFrame() {

		initComponents();

		// center on screen
		setLocationRelativeTo(null);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mitemSave = new javax.swing.JMenuItem();
        mitemLogFile = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitemQuit = new javax.swing.JMenuItem();
        menuTools = new javax.swing.JMenu();
        mitemAdd = new javax.swing.JMenuItem();
        mitemRemove = new javax.swing.JMenuItem();
        javax.swing.JMenuItem mitemProgramLog = new javax.swing.JMenuItem();
        mitemMsgLogFile = new javax.swing.JMenuItem();
        mitemLogWindow = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        mitemHelp = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator sep1 = new javax.swing.JPopupMenu.Separator();
        mitemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Config.INSTANCE.FULL_NAME);
        setPreferredSize(new java.awt.Dimension(640, 480));

        btnAdd.setText("Add");

        btnRemove.setText("Remove");

        btnNext.setText(">");

        btnPrev.setText("<");

        menuFile.setText("File");

        mitemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemSave.setMnemonic('S');
        mitemSave.setText("Save");
        menuFile.add(mitemSave);

        mitemLogFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mitemLogFile.setText("Set Log File");
        menuFile.add(mitemLogFile);
        menuFile.add(jSeparator1);

        mitemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mitemQuit.setMnemonic('q');
        mitemQuit.setText("Quit");
        menuFile.add(mitemQuit);

        menubar.add(menuFile);

        menuTools.setMnemonic('T');
        menuTools.setText("Tools");

        mitemAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_MASK));
        mitemAdd.setMnemonic('A');
        mitemAdd.setText("Add Logger");
        menuTools.add(mitemAdd);

        mitemRemove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_MASK));
        mitemRemove.setMnemonic('R');
        mitemRemove.setText("Remove Logger");
        menuTools.add(mitemRemove);

        mitemProgramLog.setText("----- Program Log -----");
        mitemProgramLog.setEnabled(false);
        menuTools.add(mitemProgramLog);

        mitemMsgLogFile.setText("Set Log File");
        menuTools.add(mitemMsgLogFile);

        mitemLogWindow.setText("Show Log Window");
        menuTools.add(mitemLogWindow);

        menubar.add(menuTools);

        menuHelp.setMnemonic('H');
        menuHelp.setText("Help");

        mitemHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mitemHelp.setMnemonic('H');
        mitemHelp.setText("Help");
        menuHelp.add(mitemHelp);
        menuHelp.add(sep1);

        mitemAbout.setMnemonic('A');
        mitemAbout.setText("About");
        menuHelp.add(mitemAbout);

        menubar.add(menuHelp);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnNext)
                    .addComponent(btnPrev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("ZedLog v0.1 alpha");

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public JMenuItem getMItemAdd() {
		return mitemAdd;
	}

	public JMenuItem getMItemRemove() {
		return mitemRemove;
	}

	public JMenuItem getMItemSave() {
		return mitemSave;
	}

	public JMenuItem getMItemLogFile() {
		return mitemLogFile;
	}

	public JMenuItem getMItemLogWindow() {
		return mitemLogWindow;
	}

	public JMenuItem getMItemMsgLogFile() {
		return mitemMsgLogFile;
	}

	public JMenuItem getMItemQuit() {
		return mitemQuit;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnRemove() {
		return btnRemove;
	}

	public JButton getBtnNext() {
		return btnNext;
	}

	public JButton getBtnPrev() {
		return btnPrev;
	}

	public JMenu getMenuHelp() {
		return menuHelp;
	}

	public JMenuBar getMenubar() {
		return menubar;
	}

	public JTabbedPane getTabs() {
		return tabs;
	}

	public JMenuItem getMItemAbout() {
		return mitemAbout;
	}

	public JMenuItem getMItemHelp() {
		return mitemHelp;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRemove;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuTools;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem mitemAbout;
    private javax.swing.JMenuItem mitemAdd;
    private javax.swing.JMenuItem mitemHelp;
    private javax.swing.JMenuItem mitemLogFile;
    private javax.swing.JMenuItem mitemLogWindow;
    private javax.swing.JMenuItem mitemMsgLogFile;
    private javax.swing.JMenuItem mitemQuit;
    private javax.swing.JMenuItem mitemRemove;
    private javax.swing.JMenuItem mitemSave;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables

}
