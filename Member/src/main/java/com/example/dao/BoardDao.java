package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.example.vo.Board;

public class BoardDao {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	// 게시글 등록
	public int writeBoard(Board board) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			System.out.println("등록 전 : " + board);
			int result = mapper.insertBoard(board);
//			System.out.println("result : " + result);
			System.out.println("등록 후 : " + board);
			Board readBoardMap = mapper.readBoardMap(board.getBoard_id());
			System.out.println("검색한 게시글 : " + readBoardMap);
			// 등록 전과 등록 후에 board_id는 다르다.
			session.commit();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 게시글 읽기
	public Board readBoard(int board_id) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			Map<String, String> result = mapper.readBoard(board_id);
			System.out.println("board : " + result);
			System.out.println("제목 : " + result.get("TITLE"));
			System.out.println("작성자 : " + result.get("NAME"));
			return null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	// 게시글 읽기 (boardMap)
	public Board readBoardMap (int board_id) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper (BoardMapper.class);
			Board board = mapper.readBoardMap(board_id);
			System.out.println("board" + board);
			return board;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	// 게시글 수정
	public int updateBoard(Board board) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			int result = mapper.updateBoard(board);
			System.out.println("result : " + result);
			session.commit();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	// 게시글 삭제
	public int deleteBoardById(int board_id) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			int result = mapper.deleteBoardById(board_id);
			System.out.println("result : " + result);
			session.commit();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	// 게시글 검색 (search 조건)
	public void searchBoard (Board board) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			List<Board> result = mapper.searchBoard(board);
			for (Board b : result) {
				System.out.println(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 게시글 검색 (in 조건)
	public void searchBoardIn (List<Integer> list) {
		try (SqlSession session = factory.openSession()) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			List<Board> result = mapper.searchBoardIn(list);
			for (Board b : result) {
				System.out.println(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		Board board = new Board("제목", "내용2", "lee");
		dao.writeBoard(board);
//		dao.readBoardById(27);
//		Board searchBoard = dao.readBoard(26);
//		searchBoard.setTitle("수정된 제목");
//		searchBoard.setContent("수정된 내용");
//		dao.updateBoard(searchBoard);
//		dao.deleteBoardById(27);
//		dao.readBoardMap(25);
		
		
//		Board board = new Board();
//		board.setBoard_id(37);
//		board.setTitle("수정된 내용2");
//		board.setContent("수정된 내용2");
//		dao.updateBoard(board);
		
//		board.setTitle("제목");
//		board.setContent("내용");
//		dao.searchBoard(board);
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(35);
//		list.add(36);
//		list.add(37);
//		dao.searchBoardIn(list);


	}

}
