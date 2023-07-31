package org.astro.board3.service.board;

import java.util.List;

import org.astro.board3.dto.board.BoardDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BoardService {

    List<BoardDTO> getList();

    int register(BoardDTO boardDTO);

    BoardDTO getOne(Integer bno);

    int delete(Integer bno);

    int modify(BoardDTO boardDTO);


    
}
