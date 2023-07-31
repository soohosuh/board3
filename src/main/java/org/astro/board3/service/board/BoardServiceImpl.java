package org.astro.board3.service.board;

import java.util.List;

import org.astro.board3.dto.board.BoardDTO;
import org.astro.board3.mappers.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getList() {
        
        return boardMapper.getList();
    }

    @Override
    public int register(BoardDTO boardDTO) {
        return boardMapper.register(boardDTO);
    }

    @Override
    public BoardDTO getOne(Integer bno) {
        return boardMapper.getOne(bno);
    }

    @Override
    public int delete(Integer bno) {
        return boardMapper.delete(bno);
    }

    @Override
    public int modify(BoardDTO boardDTO) {
        return boardMapper.modify(boardDTO);
    }
    
}
