package com.example.bookexam;

public class BookMain {
    public static void main(String[] args) {
        BookUI bookUI = new BookUI();
        BookDAO bookDAO = new BookDAO("/tmp/books.dat");
        BookService bookService = new BookServiceImpl(bookDAO.loadBooks());

        while (true) {
            int menuId = bookUI.menu();

            if (menuId == 5) {
                bookDAO.saveBooks(bookService.bookList());
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (menuId == 1) {
                Book book = bookUI.regBook();
                bookService.addBook(book);
            } else if (menuId == 2) {
                bookUI.bookList(bookService.bookList());
            } else if (menuId == 3) {
                String inputTitle = bookUI.inputTitle();
                bookService.updateBook(inputTitle);
            } else if (menuId == 4) {
                String inputTitle = bookUI.inputTitle();
                bookService.deleteBook(inputTitle);
            }

        }

    }
}
