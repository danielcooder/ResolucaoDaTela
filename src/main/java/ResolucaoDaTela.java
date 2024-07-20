import java.awt.*;
public class ResolucaoDaTela{
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        System.out.println("A resolução da tela é de " + screenWidth + " x " + screenHeight);
    }
}
