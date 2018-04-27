package com.susakoo.shop.db_service.repository;


import com.susakoo.shop.db_service.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Book,Integer> {

}
