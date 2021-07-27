import GUI_package.GUI;
import org.junit.jupiter.api.Test;

public class GUI_test {

    @Test
    public void testEmptyBoard() {
        GUI test = new GUI();
        try {
            test.drawEmptyBoard();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Something definitely went wrong");
        }
    }

}
