package alzheimer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.BorderLayout;
import java.awt.List;

public class Lista extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lista() {
		setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"a", "aa", "a", "a", "a", "a", "", "a", "aa", "a", "aa", "a", "a", "a", "aa", "a", "a", "a", "a", "a", "a", "a", "a", "a", "", "a", "a", "a", "a", "a", "a", "aa", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "", "a", "aa", "a", "a", "a", "a", "a", "a", "a", "a", "a", "", "a", "aaa", "a", "a", "", "a", "a", "aa", "a", "", "", "a", "a", "a", "aa", "a", "a", "a", "", "a", "a", "a", "a", "a", "a", "aa", "a", "a", "aa", "", "aa"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		add(list, BorderLayout.CENTER);
		
		
	}

}
