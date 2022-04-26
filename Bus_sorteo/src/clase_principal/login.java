/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package clase_principal;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Cosechatech
 */
public class login extends login_interface{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
      login_interface log = new login_interface();      
      log.setTitle("Sorteo de Rutas");      
      Image retValue = Toolkit.getDefaultToolkit().getImage("src/imagenes/bus_icono.png");
      log.setIconImage(retValue);
      log.setVisible(true);
            
    }
}
