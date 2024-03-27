package inheritance.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private String userType;
    private String userName;
    private String password;

    public List<User> userList = new ArrayList<>();
    public List<Book> bookList = new ArrayList<>();
    public Librarian librarian;

    public void login() {}
    public void register() {}
    public void logout() {}

}
