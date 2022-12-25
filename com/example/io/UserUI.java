package com.example.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    // User 수정
    public void updateUser(List<User> users) {
        try {
            System.out.print("수정할 회원의 email을 입력하세요: ");
            String userEmail = br.readLine();

            int a = 0;

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(userEmail)) {
                    System.out.println(userEmail + " 회원의 정보를 수정합니다.");
                    System.out.print("이름을 입력하시오: ");
                    String updateName = br.readLine();
                    System.out.print("생년을 입력하시오: ");
                    int updateBirthYear = Integer.parseInt(br.readLine());

                    users.remove(i);
                    users.add(new User(userEmail, updateName, updateBirthYear));
                    a=1;
                    System.out.println("수정이 완료되었습니다.");
                }
            }

            if (a == 0) {
                System.out.println("존재하지 않는 User 입니다.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // User 삭제
    public void removeUser(List<User> users) {
        try {
            System.out.print("삭제할 회원의 email을 입력하세요: ");
            String userEmail = br.readLine();
            int a=0;

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(userEmail)) {

                    users.remove(i);
                    a = 1;
                    System.out.println("삭제가 완료되었습니다.");
                }
            }

            if (a==0) System.out.println("존재하지 않는 User입니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // User 목록 보기
    public void listUser(List<User> users) {
        System.out.println("email           이름          생년");
        System.out.println("================================");
        for (User user : users) {
            System.out.print(user.getEmail());
            System.out.print("      ");
            System.out.print(user.getName());
            System.out.print("      ");
            System.out.print(user.getBirthYear());
            System.out.println("      ");
        }
    }
}
