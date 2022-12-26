package com.example.io;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("/tmp/users.dat");
        UserService userService = new UserServiceInMemory(userDao.loadUsers());

        // 메뉴
        while (true) {
            int menuId = userUI.menu();

            // 프로그램 종료
            if (menuId == 5) {
                System.out.println("프로그램을 종료합니다.");
                userDao.saveUser(userService.getUsers());
                break;

            // User 등록
            } else if (menuId == 1) {
                User user = userUI.regUser();
                userService.addUser(user);
                System.out.println("등록이 완료되었습니다.");

            // User 목록 보기
            } else if (menuId == 2) {
                userUI.listUser(userService.getUsers());

            // User 수정
            } else if (menuId == 3) {
                String email = userUI.inputEmail();
                boolean isFindEmail = userService.exists(email);

                // 존재하는 User인 경우
                if (isFindEmail) {
                    User updateUser = userUI.inputUser(email);
                    userService.updateUser(updateUser);
                    System.out.println("수정이 완료되었습니다.");
                } else {
                    System.out.println("존재하지 않는 User입니다.");
                }

                // User 삭제
            } else if (menuId == 4) {
                String email = userUI.inputEmail();
                boolean isFindEmail = userService.exists(email);

                if (isFindEmail) {
                    userService.deleteUser(email);
                    System.out.println("삭제가 완료되었습니다.");
                } else {
                    System.out.println("존재하지 않는 User입니다.");
                }
            }

        }

    }
}
