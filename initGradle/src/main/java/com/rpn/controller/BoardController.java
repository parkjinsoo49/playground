package com.rpn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rpn.service.BoardService;
import com.rpn.vo.BoardVo;


@Controller
public class BoardController {
	
	@Resource(name="BoardService")
	BoardService boardService;
	
	@RequestMapping(value="listBoard.do", method = RequestMethod.GET)
	public String listBoard(Model model){
		List<BoardVo> listBoard = boardService.listBoard();		
		
		model.addAttribute("listBoard", listBoard);
		
		return "board/listBoard";
	}
	
	@RequestMapping(value="readBoard.do")
    public String readBoard(@RequestParam("boardSeq") String boardSeq, Model model){
    	BoardVo boardVo = boardService.readBoard(boardSeq);
    	
    	model.addAttribute("board", boardVo);
    	
    	return "board/readBoard";
    }
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String indexPage(){
		return "index";
	}
}
