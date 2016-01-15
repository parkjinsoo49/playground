package com.rpn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.rpn.dao.BoardDao;
import com.rpn.vo.BoardVo;

@Repository("BoardService")
public class BoardService {
	
	@Resource(name="BoardDao")
	BoardDao boardDao;
	
	public List<BoardVo> listBoard(){
		return boardDao.listBoard();
	}
	
	public BoardVo readBoard(String boardSeq){
		return boardDao.readBoard(boardSeq);
	}
}
