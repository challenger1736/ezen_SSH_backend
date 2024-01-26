package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dao.MemberDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;

public class BoardController {
    private static BoardController boardController = new BoardController();
    private BoardController(){};
    public static BoardController getInstance(){
        return boardController;
    }

    public int boardWrite(BoardDto boardDto){
        int result = BoardDao.getInstance().boardWrite(boardDto);
        return result;
    }

    public ArrayList<CategoryDto> cateList(){
        ArrayList<CategoryDto> result = new ArrayList<>();
        result = BoardDao.getInstance().cateList();
        return result;
    }
}
