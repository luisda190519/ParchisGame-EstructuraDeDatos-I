package interfaz;

import javax.swing.ImageIcon;

public class ImagenesResul {

    public ImageIcon iconoImagen;

    public ImageIcon pngDadoR(float DadoR) {
        if (DadoR == 1) {
            iconoImagen = new ImageIcon("imagenes/uno.jpg");
        } else if (DadoR == 2) {
            iconoImagen = new ImageIcon("imagenes/dos.jpg");
        } else if (DadoR == 3) {
            iconoImagen = new ImageIcon("imagenes/tres.jpg");
        } else if (DadoR == 4) {
            iconoImagen = new ImageIcon("imagenes/cuatro.png");
        } else if (DadoR == 5) {
            iconoImagen = new ImageIcon("imagenes/cinco.jpg");
        } else if (DadoR == 6) {
            iconoImagen = new ImageIcon("imagenes/seis.jpg");

        }

        return iconoImagen;
    }

}
