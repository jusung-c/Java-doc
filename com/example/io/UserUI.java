package com.example.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class UserUI {
    private BufferedReader br;

    public UserUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu(){
        System.out.println("1. 회원 등록");
        System.out.println("2. 회원 목록 보기");
        System.out.println("3. 회원 수정");
        System.out.println("4. 회원 삭제");
        System.out.println("5. 프로그램 종료");

        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(line);
    }

    // User 등록
    public User regUser() {
        try {
            System.out.print("email을 입력하세요: ");
            String email = br.readLine();
            System.out.print("이름을 입력하세요: ");
            String name = br.readLine();
            System.out.print("생년을 입력하세요: ");
            int birthYear = Integer.parseInt(br.readLine());

            User user = new User(email, name, birthYear);
            return user;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // email 받기
    public String inputEmail() {
        System.out.print("수정할 회원의 email을 입력하시오: ");
        String email = "";
        try {
            email = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return email;
    }

    public User inputUser(String email) {
        try {
            System.out.print("이름을 입력하세요: ");
            String name = null;
            name = br.readLine();
            System.out.print("생년을 입력하세요: ");
            int birthYear = Integer.parseInt(br.readLine());

            User user = new User(email, name, birthYear);
            return user;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // User 목록 보기
    public void listUser(Iterator<User> iter) {
        System.out.println("email           이름          생년");
        System.out.println("================================");
        while (iter.hasNext()) {
            User user = iter.next();
            System.out.print(user.getEmail());
            System.out.print("      ");
            System.out.print(user.getName());
            System.out.print("      ");
            System.out.print(user.getBirthYear());
            System.out.println("      ");
        }
    }
}
