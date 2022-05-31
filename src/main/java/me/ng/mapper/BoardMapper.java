package me.ng.mapper;

import java.util.List;

import me.ng.model.Board;


public interface BoardMapper {

	List<Board> getList();
	
	Board findByBno(Long board);
	
	void insert(Board board);
	
	void delete(Board board);
	
	void update(Long bno);
}
