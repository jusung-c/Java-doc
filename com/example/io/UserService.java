package com.example.io;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    // 회원정보 등록
    public void addUser(User user);

    // 회원정보 수정 - 성공 유무 반환
    public boolean updateUser(User user);

    // 회원정보 삭제 - 성공 유무 반환
    public boolean deleteUser(String email);

    // 회원 목록 반환
    public Iterator<User> getUsers();

    // email에 해당하는 회원 있는지 확인
    public boolean exists(String email);
}
