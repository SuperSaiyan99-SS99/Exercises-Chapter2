package tutorials;

import javax.swing.JOptionPane;

public class NumberDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int creditDays = 30;
		
		JOptionPane.showMessageDialog(null, "" + creditDays);
		JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");
	}

}
