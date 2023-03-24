package ventanas;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JOSE
 */
public class JPaneles extends JPanel{
    private URL url = getClass().getResource("/imagenes/FondoDePaneles.png");
    Image image = new ImageIcon(url).getImage();
    
    @Override
    public void paint(Graphics ImagenFondoPanel){
        ImagenFondoPanel.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(ImagenFondoPanel);
    }
}
