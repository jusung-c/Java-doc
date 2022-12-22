package com.example.io;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ObjectOutputExam {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User u1 = new User("lee@naver.com", "lee", 1999);
        User u2 = new User("kim@naver.com", "kim", 2003);
        User u3 = new User("park@naver.com", "park", 2010);

        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        // 얉은 복사1
        ArrayList<User> users2 = users;


        // 얉은 복사2
        ArrayList<User> users3 = new ArrayList<>();
        for (User u : users2) {
            users3.add(u);
        }

        // 깊은 복사
        ArrayList<User> users4 = copy(users);

        for (User u : users4) {
            System.out.println(u);
        }
    }

    private static ArrayList<User> copy(ArrayList<User> users) throws IOException, ClassNotFoundException {
        // 깊은 복사를 위해선 직렬화가 필요하다.
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);

        out.writeObject(users);

        out.close();
        bout.close();

        byte[] array = bout.toByteArray();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> userList = (ArrayList<User>) in.readObject();

        in.close();

        return userList;

    }
}
