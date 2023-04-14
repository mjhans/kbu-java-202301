public class SimpleQueue{
    private static int Q_SIZE = 5;
    private static int[] queue = new int[Q_SIZE];
    private static int rear = 0;
    private static int front = 0;

    private static String getQueueString(){
        StringBuilder sb = new StringBuilder();
        for (int i = front ; i < rear ; i++){
            sb.append(queue[i] + ", ");
        }
        return sb.toString();
    }
    public static void showQueue(){
        System.out.println("------------------------------------------------------");
        if (isDispose()){
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

    private static boolean isFull(){
        return rear == Q_SIZE;
    }
    private static boolean isEmpty(){
        return rear == front;
    }
    public static int enQueue(int x){
        int result = -1;
        if (!isFull() && !isDispose()){
            queue[rear++] = x;
            result = x;
        }
        return result;
    }
    public static int deQueue(){
        int result = -1;
        if (!isEmpty() && !isDispose()){
            result = queue[front++];
        }
        return result;
    }
    private static boolean isDispose(){
        return(front == Q_SIZE) && (rear == Q_SIZE);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String kin = "";

        do{
            System.out.println("1: 저장");
            System.out.println("2: 삭제");
            System.out.println("3: 출력");
            System.out.println("s: Stop");
            
            kin = sc.next(); 
            if (kin.equals("1")){
                
                
            } else if (kin.equals("2")){
                
            } else if (kin.equals("3")){
                
            } else if (kin.equals("s")){
                System.out.println("Stop");
            } else {
                System.out.println("메뉴번호를 다시 입력해주세요.");
            }

        }while(!kin.equals("s"));
    }
}