package elements;

import utils.Drawing;
import java.awt.Graphics;
import java.io.Serializable;
public class PowerPellet extends ElementGivePoint{
	// Contrutor da PowerPellet
    public PowerPellet(String imageName) {
        super(imageName);
        this.numberPoints=50;
    }
}
