import java.applet.Applet;
import java.awt.Graphics;

class StarApplet extends Applet {

    public void paint(Graphics g) {
        int startX = 50;
        int startY = 50;
        int size = 20;
        int numRows = 5;
        int numCols = 5;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                drawStar(g, startX + col * 2 * size, startY + row * 2 * size, size);
            }
        }
    }

    private void drawStar(Graphics g, int x, int y, int size) {
        g.drawLine(x, y, x + size, y);
        g.drawLine(x, y, x + size / 2, y + size);
        g.drawLine(x + size, y, x + size / 2, y + size);
    }
}
/*<applet code="star.java" width="1000" height="1000"></applet> */