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
                case 1: // 1. 조회

            }
        }



    }

}
