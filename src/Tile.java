import java.util.ArrayList;
public class Tile {
    byte x;
    byte y;
    ArrayList<Human> presents=new ArrayList<>();
    Tile(byte givenx, byte giveny) {
        this.x = givenx;
        this.y = giveny;

    }
}
