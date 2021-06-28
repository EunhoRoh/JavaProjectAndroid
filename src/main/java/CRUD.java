import java.util.Scanner;

public class CRUD {
    private long id;
    private String name;
    private String regiDate;
    private String split;
    private String part;
    private long numOfSets;
    private long reps;
    private long weight;
    private String exercise;
    DataManage dataCall = new DataManage();
    Scanner sc = new Scanner(System.in);

    DataManage dataSchedule[] = new DataManage[100];

    //변수 선언
    private boolean  swit[] = new boolean[100];
    private int numPeople;
    private String check;

    // init in mainProcess
    public CRUD() {
        init();
    }

    //init
    public void init(){
        for (int i=0; i< swit.length; i++){
            swit[i] = false;
        }
    }

    //Insert - 추가
    public void insert(){
        System.out.println();// 개행
        for(int i=0; i<dataSchedule.length; i++){
            if(swit[dataSchedule.length -1] == true){
                System.out.println("더 이상 스케쥴을 추가 할 수 없습니다.");
                return;
            } else if(swit[i] == false){
                System.out.println((i+1) + " 번 스케쥴에 작성 하실 수 있습니다.\n");
                break;
            }
        }
        System.out.print("ID : ");
        dataCall.setId(sc.nextLong());
        System.out.print("이름 : ");
        dataCall.setName(sc.next());
        System.out.print("등록일자 : ");
        dataCall.setRegiDate(sc.next());
        //System.out.print("분할 : ");
        //dataCall.setPart(sc.next());
        System.out.print("운동 : ");
        dataCall.setExercise(sc.next());
        System.out.print("셋트수 : ");
        dataCall.setNumOfSets(sc.nextLong());
        System.out.print("횟수 : ");
        dataCall.setReps(sc.nextLong());
        System.out.print("무게 : ");
        dataCall.setWeight(sc.nextLong());
        
        for (int i=0; i< dataSchedule.length; i++){
            if(swit[i] == false) {
                swit[i] = true;
                numPeople = i+1;
                dataSchedule[i] = new DataManage(dataCall.getId(), dataCall.getName(), dataCall.getRegiDate(), 
                        dataCall.getExercise(), dataCall.getNumOfSets(), dataCall.getReps(), dataCall.getWeight());
                System.out.println("\n" + numPeople + " 번째 스케쥴이 작성되었습니다.");
                break;
            }
        }
    }
    
    //Delete - 삭제
    public void delete(){
        System.out.println("\n삭제하고 싶은 스케쥴의 번호를 입력하시오(1 ~ 100) : ");
        numPeople = sc.nextInt();
        if(dataSchedule[numPeople -1] == null){
            System.out.println("\n작성된 스케쥴이 없는 번호입니다.");
            return;
        }
        System.out.println("\n삭제하고 싶은 " + numPeople + "페이지의 내용입니다.");
        System.out.println(dataSchedule[numPeople -1].toString());
        System.out.print("페이지를 삭제하고 싶으시면 'Y'아니면 'N'를 입력하시오\n : ");
        check = sc.next();
        if (check.equals("y") || check.equals("Y")){
            swit[numPeople -1] = false;
            dataSchedule[numPeople -1] = null;
            System.out.println("\n페이지가 삭제되었습니다.");
        } else{
            System.out.println("\n삭제를 취소합니다.");
            return;
        }
    }
    
    public void search() {
        System.out.println(); //개행
        System.out.print("검색하고 싶은 책의 쪽수를 입력하시오(1~100) : ");
        numPeople = sc.nextInt();
        if(dataSchedule[numPeople-1]==null){
            System.out.println("\n작성된 페이지가 없는 쪽수입니다.\n");
            return;
        }
        System.out.println("\n검색하고 싶은 " + numPeople + "페이지의 내용입니다.");
        System.out.println(dataSchedule[numPeople -1].toString());
    }
    
    //Update - 수정
    public void update() {
        System.out.println(); //개행
        System.out.print("수정하고 싶은 스케쥴의 번호를 입력하시오(1~100) : ");
        numPeople = sc.nextInt();
        if(dataSchedule[numPeople-1]==null){
            System.out.println("\n작성된 스케쥴이 없는 번호입니다.");
            return;
        }
        System.out.println("\n수정하고 싶은 " + numPeople + "번째 스케쥴의 내용입니다.");
        System.out.println(dataSchedule[numPeople -1].toString());
        System.out.print("스케쥴을 수정하고 싶으시면 'Y'아니면 'N'를 입력하시오\n : ");
        check = sc.next();
        if(check.equals("y") || check.equals("Y")){
            System.out.print("이름 : ");
            dataCall.setName(sc.next());
            System.out.print("등록일자 : ");
            dataCall.setRegiDate(sc.next());
            //System.out.print("분할 : ");
            //dataCall.setPart(sc.next());
            System.out.print("운동 : ");
            dataCall.setExercise(sc.next());
            System.out.print("셋트수 : ");
            dataCall.setNumOfSets(sc.nextLong());
            System.out.print("횟수 : ");
            dataCall.setReps(sc.nextLong());
            System.out.print("무게 : ");
            dataCall.setWeight(sc.nextLong());

            dataSchedule[numPeople -1] = new DataManage();

            System.out.println("\n스케쥴이 수정되었습니다.");
        }
    }


}
