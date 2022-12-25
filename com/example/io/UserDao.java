package com.example.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private  String filename;

    public UserDao(String filename) {
        this.filename = filename;
    }

    public void saveUser(List<User> userList) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> loadUsers() {
        File file = new File(filename);

        // 파일이 존재하는 지 확인
        if (!file.exists()) {
            return new ArrayList<>();
        }

        List<User> list = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
             list = (List<User>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
