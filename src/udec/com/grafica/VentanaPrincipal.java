package udec.com.grafica;
import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
	
	RegistroPersonaPanel obj_panel_registro;
	TablaPersonaPanel obj_paneltablapersona;
	
	public VentanaPrincipal() {
		super("Mi ventana principal");
		inicio();
		componentes();
		pack();
		setLocationRelativeTo(null);
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
	
	private void componentes() {
		
		obj_panel_registro = new RegistroPersonaPanel();
		add(obj_panel_registro, BorderLayout.NORTH);
		
		obj_paneltablapersona = new TablaPersonaPanel();
		add(obj_paneltablapersona, BorderLayout.CENTER);
		
	}
	
}