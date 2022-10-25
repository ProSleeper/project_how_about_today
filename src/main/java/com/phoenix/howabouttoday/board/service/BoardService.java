package com.phoenix.howabouttoday.board.service;

import com.phoenix.howabouttoday.board.dto.*;

import java.util.List;

public interface BoardService {

    // Board : Notice, About Us

    List<BoardListDTO> findAll_Board(String boardCategoryName); // 게시판 리스트 (모든 게시글 조회)
    BoardDetailDTO findOne_Board(Long boardNum); // 게시판 디테일 (게시글 1개 조회)

    void addBoard(BoardDTO boardDTO); // 게시글 작성
    void editBoard(Long boardNum, BoardDTO boardDTO); // 게시글 수정
    void deleteBoard(BoardDetailDTO boardDetailDTO); // 게시글 삭제
}
