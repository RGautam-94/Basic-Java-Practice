package serialization;

import java.io.*;
import java.util.Scanner;

public class PermanentStorage {
    public static void main(String[] args) throws IOException {
        Product p = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.print("Item Name: ");
        p.itemName = sc.next();
        System.out.print("Enter price: ");
        p.price = sc.next();

        // file output stream (Serialization)
        FileOutputStream fileOutputStream = new FileOutputStream("d:/product.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p);
        objectOutputStream.close();

        // file input stream (Deserialization)
        FileInputStream fileInputStream = new FileInputStream("d:/product.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Product p1 = null;
        try {
            p1 = (Product) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p1);

    }
}
