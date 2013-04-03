import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import static javax.swing.Action.*;

public class ToolBarDemo extends DFrame implements MouseListener{
	
	private MyAction miAccion;
	private JToolBar toolBar;
	private JButton btnMiAccion;
	private JPopupMenu popUp;
	
	public ToolBarDemo(int x, int y, String title) {
		super(x, y, title);
		
		toolBar = new JToolBar();
		
		miAccion = new MyAction("Opcion1");
		miAccion.putValue(LARGE_ICON_KEY, new ImageIcon("img/21.png"));
		// miAccion.putValue(SHORT_DESCRIPTION, "SPIDER-MAN");
		
		btnMiAccion = new JButton(miAccion);
		btnMiAccion.setHideActionText(true);
		btnMiAccion.setFocusable(false);
		btnMiAccion.setBorderPainted(false);
		btnMiAccion.setBackground( Color.LIGHT_GRAY );
		btnMiAccion.setToolTipText("Spider-Man");
		
		// btnMiAccion.setBorder( BorderFactory.createCompoundBorder(new EmptyBorder(2,5,5,2), BorderFactory.createRaisedBevelBorder()) );
		
		popUp = new JPopupMenu("Spider-man");
		popUp.add( new JMenuItem("Scarlet") );
		popUp.add( new JMenuItem("2099") );
		popUp.add( new JMenuItem("Iron") );
		popUp.add( new JMenuItem("Symbiote") );
		
		toolBar.add(btnMiAccion);
		
		this.addMouseListener(this);
		this.getContentPane().add( toolBar , BorderLayout.NORTH );
	}

	public void mouseClicked(MouseEvent arg0) { }
	public void mouseEntered(MouseEvent arg0) { }
	public void mouseExited(MouseEvent arg0) { }
	public void mousePressed(MouseEvent arg0) { 
		
		if(arg0.getButton() == arg0.BUTTON3){
			popUp.show(this, arg0.getX(), arg0.getY());
		}
		
	}
	public void mouseReleased(MouseEvent arg0) { }

}
