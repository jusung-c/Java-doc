package practice;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/tmp");

        printFile(file);
    }

    private static void printFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println("[dir] - " + files[i]);
                printFile(files[i]);
            }
        } else {
            System.out.println(file.getName());
        }
    }
}
