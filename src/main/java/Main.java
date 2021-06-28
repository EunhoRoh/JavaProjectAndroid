import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //인스턴스 생성
        CRUD crud = new CRUD();
        MenuShow showMenu = new MenuShow();

        //변수선언
        int chNum;

        while(true){
            showMenu.showMenu();

            chNum = sc.nextInt();

            switch (chNum) {
                case 1: // 1. 추가
                    crud.insert();
                    break;
                case 2: // 2. 삭제
                    crud.delete();
                    break;
                case 3: //3. 검색
                    crud.search();
                    break;
                case 4: //4. 수정
                    crud.update();
                    break;
                case 5: // 5. 모든 리스트
                    crud.searchAll();
                    break;
                default://종료
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
            System.out.println();
        }

    }

}
