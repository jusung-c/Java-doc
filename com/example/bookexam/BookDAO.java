package com.example.bookexam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public String filename;

    public BookDAO(String filename) {
        this.filename = filename;
    }

    public void saveBooks(List<Book> books) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(books);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Book> loadBooks() {
        File file = new File(filename);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        List<Book> books = null;

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            books = (List<Book>)in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }
}
