package org.astro.board3.mappers;

import java.util.List;

import org.astro.board3.dto.board.BoardDTO;

public interface BoardMapper {

    //board list
    List<BoardDTO> getList();

    //board register
    int register(BoardDTO boardDTO);

    //board read
    BoardDTO getOne(Integer bno);

    //board delete
    int delete(Integer bno);

    //board modify
    int modify(BoardDTO boardDTO);
    
}
