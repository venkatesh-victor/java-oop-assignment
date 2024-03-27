package inheritance.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String name;
    private String id;
    private String password;
    private String searchString;

    public List<Book> bookList = new ArrayList<>();

    public void verifyLibrarian() {}
    public void search() {}
}
