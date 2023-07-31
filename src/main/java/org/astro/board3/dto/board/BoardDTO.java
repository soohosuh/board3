package org.astro.board3.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BoardDTO {

    //변수
    private Integer bno;        //pk
    private String title;       //제목
    private String content;     //내용
    private String writer;      //작성자
    private String dueDate;     //등록일
    private String updateDate;  //수정일
    
    
    
}
