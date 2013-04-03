import javax.swing.JFrame;


public class DFrame extends JFrame {
	
	public DFrame(int x, int y, String title){
		
		// this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(x, y);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
	}
	
	
}
