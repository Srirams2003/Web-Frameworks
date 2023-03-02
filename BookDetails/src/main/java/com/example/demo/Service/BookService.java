package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Books;
import com.example.demo.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public Books addbooks(Books obj)
	{
		return repo.save(obj);
	}
	
	public List<Books> getAllBooks()
	{
		return repo.findAll();
	}
	public String delete(int id) {
			repo.deleteById(id);
			return"deleted";
		}
	
	public Books update(int id,Books obj) {
		return repo.saveAndFlush(obj);
	}
}
