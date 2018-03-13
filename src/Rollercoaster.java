import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("How tall are you in inches?");
	int height = Integer.parseInt(input);
	
	if(height>48)
	{
		JOptionPane.showMessageDialog(null, "You can ride the rollercoaster");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "You should grow more first");
	}
}
}
