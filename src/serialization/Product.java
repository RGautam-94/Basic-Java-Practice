package serialization;

import java.io.Serializable;

public class Product implements Serializable {
    String itemName;
    String price;

    @Override
    public String toString() {
        return "\nItemName: " + itemName +
                "\nPrice: " + price;
    }
}
