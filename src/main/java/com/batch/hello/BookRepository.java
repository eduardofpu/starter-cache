package com.batch.hello;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
