package com.visual.shelf.demo.db.repository;

import com.visual.shelf.demo.db.entites.Book;
import com.visual.shelf.demo.db.entites.BookKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, BookKey> {
}
