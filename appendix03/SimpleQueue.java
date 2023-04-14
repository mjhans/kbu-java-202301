import java.util.Scanner;
import java.util.Random;

public class SimpleQueue{
    private static int QSIZE = 5;
    private static int[] queue = new int[QSIZE];
    private static int rear = 0;  // 마지막으로 입력된 값의 인덱스
    private static int front = 0;  // 삭제될 값의 인덱스 (꺼내올 데이터 인덱스)
    // rear == front면 큐가 비었다
    // rear == MAX_INDEX 면 큐가 꽉찼다
    private static String getQueueString(){
        StringBuilder sb = new StringBuilder();
        for (int i = front ; i < rear ; i++){
            sb.append(queue[i] + ", ");
        }
        return sb.toString();
    }
    public static void showQueue(){
        System.out.println("------------------------------------------------------");
        if (isDisable()){
            System.out.printf("\t 더이상 큐를 사용할수 없습니다. rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
        } else if(isFull()){
            System.out.printf("\t 큐가 다 찼습니다. rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
            System.out.printf("\t\t queue : [%s] \n",getQueueString());
        } else if (isEmpty()) {
            System.out.printf("\t 큐가 비었습니다. rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
        } else {
            System.out.printf("\t 큐의 상태 rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
            System.out.printf("\t\t queue : [%s] \n",getQueueString());
        }
        System.out.println("------------------------------------------------------");
    }
    // 큐에 보관 가능한 데이터 갯수이다.
    public static int getQueueSize(){
        return QSIZE;
    }

    public static boolean isEmpty(){
        return rear == front;
    }

    public static boolean isFull(){
        return rear == getQueueSize();
    }

    public static boolean isDisable(){
        return (front == rear) && (rear == getQueueSize());
    }

    // 값을 큐의 마지막에 추가하고 rear를 증가한다.
    // 이상이 있을 경우 -1을 반환하고, 이상이 없을경우 추가한값을 반환한다.
    public static int enQueue(int x){
        int result = -1;
        if((!isFull()) && (!isDisable())){
            queue[rear++] = x;
            result = x;
        }
        return result;
    }

    // 큐의 첫번째 값을 삭제하고, front를 증가한다
    // 이상이 있을 경우 -1을 반환하고, 이상이 없을경우 삭제한 값을 반환한다.
    public static int deQueue(){
        int result = -1;
        if((!isEmpty()) && (!isDisable())){
            result = queue[front++];
        }
        return result;
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String kin = "";
        do {
            System.out.println("1: 저장");
            System.out.println("2: 삭제");
            System.out.println("3: 출력");
            System.out.println("s: Stop");
            
            kin = sc.next();
            if (kin.equals("1")) {
                int result = enQueue(rd.nextInt(20));
                if (result > -1){
                    System.out.printf("%d 값을 큐에 저장 \n", result);
                } else {
                    System.out.println("저장에 실패 했습니다.");
                }
            } else if (kin.equals("2")) {
                 int result = deQueue();
                if (result > -1){
                    System.out.printf("%d, 값이 삭제 되었습니다. \n", result);
                } else {
                    System.out.println("삭제에 실패 했습니다.");
                }
            } else if (kin.equals("3")) {
                showQueue();
            } else if (kin.equals("s")){
                System.out.println("프로그램 종료합니다.");
            } else {
                System.out.println("잘못된 메뉴 번호입니다.");
            }

        } while (!kin.equals("s"));

    }
}