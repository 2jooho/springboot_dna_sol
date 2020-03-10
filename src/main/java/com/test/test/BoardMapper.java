package com.test.test;



import com.test.test.Board.Service;
import org.springframework.data.repository.CrudRepository;
//crud로  service를 사용 값은 long
public interface BoardMapper extends CrudRepository<Service, Long> {

}

