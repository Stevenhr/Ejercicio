package udec.com.grafica;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class TablaPersonaPanel extends JPanel {

	public TablaPersonaPanel() {
		
		setLayout(new BorderLayout());		
		Border borde1 = BorderFactory.createTitledBorder("Contenido Tabla Persona");
		setBorder (borde1);
	}
	
	
}
