package edu.bit.ex.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;


@Service
public class BoardService {

	@Inject
	BoardMapper boardMapper;
	
    public List<BoardVO> selectBoardList() throws Exception {
		return boardMapper.getList();
    }
    
}
