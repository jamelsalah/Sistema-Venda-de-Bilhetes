package SistemaVendaBilhetes;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Graphics;

public class RoundJPasswordField extends JTextField {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RoundJPasswordField(int cols) {
        super(cols);
        // We must be non-opaque since we won't fill all pixels.
        // This will also stop the UI from filling our background.
        setOpaque(false);
        // Add an empty border around us to compensate for
        // the rounded corners.
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        // Paint a rounded rectangle in the background.
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, width, height, 40, 40);
        // Now call the superclass behavior to paint the foreground.
        super.paintComponent(g);
    }
}