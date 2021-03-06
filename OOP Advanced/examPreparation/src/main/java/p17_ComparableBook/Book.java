package p17_ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(String... authors) {
        if (authors.length==0){
            this.authors = new ArrayList<>();
        }else{
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }

    }

    @Override
    public int compareTo(Book o) {
      if (this.title.compareTo(o.title)==0){
         return Integer.compare(this.year,o.year);
      }
      return this.title.compareTo(o.title);
    }
}
