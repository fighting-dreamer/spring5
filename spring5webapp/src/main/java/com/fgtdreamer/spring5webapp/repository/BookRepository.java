package com.fgtdreamer.spring5webapp.repository;

import com.fgtdreamer.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
