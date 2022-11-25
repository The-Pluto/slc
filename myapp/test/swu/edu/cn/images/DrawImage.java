package swu.edu.cn.images;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

public class DrawImage {

    public static void main(String[] args) throws IOException {
        DrawImage drawImage = new DrawImage();
        drawImage.drawImage(100,40,"f0jib","D:\\desktop\\test.png");
    }

    public void drawImage(int width, int height, String code, String outFile) throws IOException {
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g2d = image.getGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0,width,height);

        Font font = new Font("Arial",Font.BOLD|Font.ITALIC,20);
        g2d.setFont(font);
        g2d.setColor(Color.RED);
        g2d.drawString(code,width/4,height/2);

        try(FileOutputStream fileOutputStream = new FileOutputStream(outFile)){
            ImageIO.write(image, "png",fileOutputStream);
        }

    }

}
