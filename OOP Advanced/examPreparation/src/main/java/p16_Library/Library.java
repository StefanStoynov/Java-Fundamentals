package p16_Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Library<Book> implements Iterable<Book>{
    private List<Book> books;

    public Library(Book... books) {
        this.setBooks(books);
    }

    public void setBooks(Book... books) {
        if (books.length==0){
            this.books = new ArrayList<>();
        }else{
            this.books = new ArrayList<>(Arrays.asList(books));
        }
    }


    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    public final class LibIterator implements Iterator<Book>{

        private int counter;

        public LibIterator() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return counter<books.size();
        }

        @Override
        public Book next() {
           return books.get(counter++);
        }

    }
}
