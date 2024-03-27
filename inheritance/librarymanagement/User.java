package inheritance.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;

    public List<Book> bookList = new ArrayList<>();
    public Account account;

    public void verify() {}
    public void checkAccount() {}
    public void getBookInfo() {}

}
