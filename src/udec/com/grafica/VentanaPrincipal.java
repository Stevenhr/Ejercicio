package udec.com.grafica;
import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		super("Mi ventana principal");
		inicio();
	}
	
	public VentanaPrincipal inicio() {
		Dimension dims = new Dimension(500, 550);
		this.setSize(dims);
		this.setResizable( false );
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}
	
	
	
}