import javax.swing.JOptionPane;

public class fibonacci {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How many numbers of the Fibonnaci sequence would you like?");
		int a = Integer.parseInt(answer);
		int x = 1;
		int y = 1;
		System.out.print(0);
		System.out.print(", " +x);
		System.out.print(", " +y);
		for (int i = 0; i < a-3; i++) {
		int z = x + y;
		System.out.print(", " +z);
		x = y;
		y = z;
		}
		System.out.println("...");
	}
}
