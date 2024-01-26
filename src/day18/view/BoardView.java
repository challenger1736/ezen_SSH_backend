package day18.view;


import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {

    //싱글톤
    private BoardView(){}
    private static BoardView boardView = new BoardView();
    public static BoardView getInstance(){
        return boardView;
    }
    //입력객체
    Scanner scanner = MainView.getInstance().scanner;

    //0. 로그인 성공시 출력되는 화면
    public void run(){
        while(true){
            System.out.println("========== ezen 게시판 ==========");
            // 추후에 현재 게시물 출력 메소드가 들어갈 자리
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택 > "); int ch = scanner.nextInt();
            if(ch==1){
                ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
                categoryDtos = BoardController.getInstance().cateList();
                for(CategoryDto i : categoryDtos){  // 카테고리DB에서 categoryDto들을 가져온 배열을 하나씩 출력해서 보여주기
                    System.out.printf("%d.%s ",i.getCno(),i.getCname());
                }
//                System.out.println("1.자바 2.C언어"); // 샘플
                System.out.print("카테고리 선택 > "); int category = scanner.nextInt();
                scanner.nextLine();
                System.out.print("글 제목 : "); String boardtitle = scanner.nextLine();
                System.out.print("글 내용 : "); String boardcontents = scanner.nextLine();
                // 입력받은 값 4개 dto에 담아서 컨트롤러로 전달
                BoardDto boardDto = new BoardDto( category, MemberController.getInstance().getLoginMno(), boardtitle, boardcontents );
                if(BoardController.getInstance().boardWrite(boardDto)==0){
                    System.out.println("글쓰기 성공");
                } else if (BoardController.getInstance().boardWrite(boardDto)==1) {
                    System.out.println("글쓰기 실패");
                }
            }
            else if(ch==2){}
            else if(ch==3){
                MemberController.getInstance().logout(); //회원 컨트롤러에 로그아웃 처리 요청
                System.out.println("<안내> 로그아웃 되었습니다.");
                return; // 여기선 break 랑 같다
            }
        }// we
    }//rune
}//ce
