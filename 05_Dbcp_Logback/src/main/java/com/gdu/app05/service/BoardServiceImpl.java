package com.gdu.app05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdu.app05.domain.BoardDTO;
import com.gdu.app05.repository.BoardDAO;


// @Service 대신 AppConfig에 @Bean이 등록되어 있다.
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<BoardDTO> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO getboardNo(int board_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addBoard(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyBoard(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeBoard(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

}
