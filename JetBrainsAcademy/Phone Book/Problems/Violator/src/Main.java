import java.util.ArrayList;

/**
 * Class to work with
 */
class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        List<Box<? extends Bakery>> list = new ArrayList<>();
        Box box = new Box();
        box.put(new Paper());
        list.add(box);
        return list;
    }

}