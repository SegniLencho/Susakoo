package com.susakoo.shop.db_service.resource;

import com.susakoo.shop.db_service.domain.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.susakoo.shop.db_service.repository.StockRepository;

@RestController
@RequestMapping("/rest/")
public class DbServiceResource {

	@Autowired
	private StockRepository stockRepository;

	public DbServiceResource(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return getAllBook();
	}

	@PostMapping("/addBook")
	public List<Book> saveBook(@RequestBody Book book) {
		stockRepository.save(book);
		return getAllBook();
	}

	public List<Book> getAllBook() {
		return stockRepository.findAll();
	}
}
