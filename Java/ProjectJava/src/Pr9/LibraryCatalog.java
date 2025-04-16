package Pr9;
import java.util.*;

interface LibraryCatalog {
    void addAuthor(String author, List<String> books);
    List<String> getBooksByAuthor(String author);
    Map<String, List<String>> getAllAuthors();
    void printCatalog();
}

abstract class AbstractLibrary implements LibraryCatalog {
    protected TreeMap<String, List<String>> authorCatalog = new TreeMap<>();

    public AbstractLibrary() {
        this.authorCatalog = new TreeMap<>();
    }

    @Override
    public void addAuthor(String author, List<String> books) {
        authorCatalog.put(author, new ArrayList<>(books));
    }

    @Override
    public List<String> getBooksByAuthor(String author) {
        return authorCatalog.containsKey(author) ? new ArrayList<>(authorCatalog.get(author)) : new ArrayList<>();
    }

    @Override
    public Map<String, List<String>> getAllAuthors() {
        return new TreeMap<>(authorCatalog);
    }
}

class Library extends AbstractLibrary {
    private String libraryName;

    public Library(String libraryName) {
        super();
        this.libraryName = libraryName;
    }

    @Override
    public void printCatalog() {
        System.out.println("Library: " + libraryName);
        if (authorCatalog.isEmpty()) {
            System.out.println("No authors in catalog.");
        } else {
            for (Map.Entry<String, List<String>> entry : authorCatalog.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
