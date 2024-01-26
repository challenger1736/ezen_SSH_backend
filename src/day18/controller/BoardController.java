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

    public ArrayList<BoardDto> boardView(){
        ArrayList<BoardDto> result = new ArrayList<>(); // 3. 객체 담을 배열 생성
        result = BoardDao.getInstance().boardView();   // 4. 배열에 BoardDao boardView 메소드 결과값 리턴
        return result;  // 11. boardView() 결과값 다시 리턴
    };

    public String findId(int num){
        return BoardDao.getInstance().findId(num);
    }

    public String findCategory(int num){
        return BoardDao.getInstance().findCategory(num);
    }

    public BoardDto view(int num){ return BoardDao.getInstance().view(num);}

    public boolean dropBoard(int num){ return BoardDao.getInstance().dropBoard(num);}


}
