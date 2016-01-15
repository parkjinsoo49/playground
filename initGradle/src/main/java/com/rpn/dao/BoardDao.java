package com.rpn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rpn.vo.BoardVo;

@Repository("BoardDao")
public class BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardVo> listBoard(){
		return sqlSession.selectList("listBoard");
	}
	
	public BoardVo readBoard(String boardSeq){
		return sqlSession.selectOne("readBoard", boardSeq);
	}
}
