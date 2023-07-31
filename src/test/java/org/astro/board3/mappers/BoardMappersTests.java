package org.astro.board3.mappers;

import java.util.List;

import org.astro.board3.dto.board.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardMappersTests {

    //의존성 주입
    @Autowired
    private BoardMapper boardMapper;

        @Test
    public void testRegistefr(){


    }

    //list test
    @Test
    public void testList(){

        BoardDTO boardDTO = new BoardDTO();

        log.info("------------");
        //log.info(boardMapper.getList());

        List<BoardDTO> list = boardMapper.getList();
    }

    //regist test
    @Test
    public void testRegister(){
        BoardDTO boardDTO = BoardDTO.builder()
                .title("Title test")
                .content("Content Test")
                .writer("User00")
                .dueDate("23-07-28")
                .build();
        
        boardMapper.register(boardDTO);

        log.info("------------------------");
        log.info(boardMapper.register(boardDTO));

    }

    //read test
    @Test
    public void testGetOne(){

        log.info("----------------------------");

        // BoardDTO dto = boardMapper.getOne(TEST_BNO);

        // log.info(boardMapper.getOne(TEST_BNO));
    }
    //delete test
    @Test
    public void testDelete(){
        log.info("-------------------------------");
        // boardMapper.delete(TEST_BNO);
    }
    //modify test
    @Test
    public void testModify(){
        log.info("----------------------------");
        // boardMapper.modify(boardDTO);
    }
}
