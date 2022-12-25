package com.example.io;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("/tmp/users.dat");
        List<User> users = userDao.loadUsers();

        // 메뉴
        while (true) {
            int menuId = userUI.menu();

            // 프로그램 종료
            if (menuId == 5) {
                System.out.println("프로그램을 종료합니다.");
                userDao.saveUser(users);
                break;

            // User 등록
            } else if (menuId == 1) {
                User user = userUI.regUser();
                users.add(user);
                System.out.println("등록이 완료되었습니다.");

            // User 목록 보기
            } else if (menuId == 2) {
                userUI.listUser(users);

            // User 수정
            } else if (menuId == 3) {
                userUI.updateUser(users);

            // User 삭제
            } else if (menuId == 4) {
                userUI.removeUser(users);
            }

        }

    }
}
