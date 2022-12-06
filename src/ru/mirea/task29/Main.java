package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo myCurrency = new CurrencyInfo(17);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\23906\\Desktop\\Java\\src\\ru\\mirea\\task29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(myCurrency);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\23906\\Desktop\\Java\\src\\ru\\mirea\\task29\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CurrencyInfo myCurrencyDeserialized = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(myCurrencyDeserialized);
    }
}