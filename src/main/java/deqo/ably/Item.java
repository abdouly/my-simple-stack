package deqo.ably;

/**
 * Created by ASUS on 04/11/2016.
 */
public class Item {
    private Integer value;

    public Item(Integer val) {
        value = val;
    }

    public Item() {

    }
    public  Integer getValue() {
        return  value;
    }

    public  void setValue(int val) {
        value = val;
    }
}