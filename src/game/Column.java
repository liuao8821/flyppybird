package game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Column {
    BufferedImage image;
    int x, y;
    int width, height;
    //gap纵向柱子之间的间隙
    int gap;
    //distance横向柱子之间的距离
    int distance;
    //random
    Random random = new Random();

    public Column(int n) throws IOException {
        image = ImageIO.read(getClass().getResource("/resources/column.png"));
        width = image.getWidth();
        height = image.getHeight();
        gap = 144;
        distance = 245;
        x = 550 + (n - 1) * distance;
        y = random.nextInt(218) + 132;
    }

    public void step() {
        x--;
        if (x == -width / 2) {
            x = distance * 2 - width / 2;
            y = random.nextInt(218) + 132;
        }
    }
}
