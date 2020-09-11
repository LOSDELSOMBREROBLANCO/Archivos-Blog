package imagenFondo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel {

	private Image imagen;

	public ImagenFondo(String ruta) {
		if (!ruta.equals(""))
			imagen = new ImageIcon(ruta).getImage();
	}

	public void setImagen(String rutanueva) {
		if (!rutanueva.equals(""))
			imagen = new ImageIcon(rutanueva).getImage();
		else
			imagen = null;
		repaint();
	}

	public void paint(Graphics g) {
		if (imagen != null) {
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			setOpaque(false);
		} else {
			setOpaque(true);
		}
		super.paint(g);
	}

}
