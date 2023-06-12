package com.example.dao;

import java.util.List;
import java.util.Map;

import com.example.vo.Board;

public interface BoardMapper {
	// 게시글 등록 (create)
	int insertBoard(Board board);

	// 게시글 읽기 (read)
	Map <String, String> readBoard(int board_id);
	
	// 게시글 읽기 (boardMap)
	Board readBoardMap  (int board_id);

	// 게시글 수정 (update)
	int updateBoard(Board board);

	// 게시글 삭제 (delete)
	int deleteBoardById(int board_id);
	
	// 게시글 검색 (search)
	List<Board> searchBoard (Board board);
	
	// 게시글 검색 (in 조건)
	List<Board> searchBoardIn (List<Integer> list);

}
