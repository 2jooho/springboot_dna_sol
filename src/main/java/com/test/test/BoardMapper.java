package com.test.test;



import com.test.test.Board.Service;
import org.springframework.data.repository.CrudRepository;

public interface BoardMapper extends CrudRepository<Service, Long> {

}

