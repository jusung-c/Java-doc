package practice;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("사용법: java FileDelete 파일이름");
            System.exit(0);
        }

        File f = new File(args[0]);
        if (f.exists()) { // 파일이 존재할 경우
            boolean deleteflag = f.delete();
            if (deleteflag) {
                System.out.println("파일 삭제 성공");
            } else {
                System.out.println("파일 삭제 실패");
            }
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
