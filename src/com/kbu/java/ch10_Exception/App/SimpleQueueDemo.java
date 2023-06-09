package com.kbu.java.ch10_Exception.App;

import java.util.*;

class BufferFullException extends Exception {
    public BufferFullException(String msg){
        super(msg);
    }
}

class BufferEmptyException extends Exception {
    public BufferEmptyException(String msg){
        super(msg);
    }
}

class QueueDisableException extends Exception {
    public QueueDisableException(String msg){
        super(msg);
    }
}
class SimpleQueue {
    private int[] buffer = null;
    private int front = 0;
    private int rear = 0;
    private int queueSize = 5;

    public SimpleQueue(){
        buffer = new int[queueSize];
    }
    public SimpleQueue(int size){
        queueSize = size;
    }

    public int getQueueSize(){
        return this.queueSize;
    }

    private boolean isEmpty(){
        return rear == front;
    }   

    private boolean isFull(){
        return rear == getQueueSize();
    }

    private boolean isDisable(){
        return (front == rear) && (rear == getQueueSize());
    }

    public int enQueue(int x) throws QueueDisableException, BufferEmptyException, BufferFullException{
        int result = -1;
        if (isFull()){
            throw new BufferFullException("buffer full");
        } else if(isDisable()) {
            throw new QueueDisableException("disable");
        }
        return result;
    }

    // 큐의 첫번째 값을 삭제하고, front를 증가한다
    // 이상이 있을 경우 -1을 반환하고, 이상이 없을경우 삭제한 값을 반환한다.
    public int deQueue() throws QueueDisableException, BufferEmptyException, BufferFullException{
        int result = -1;
        if (isEmpty()){
            throw new BufferEmptyException("buffer empty");
        } else if(isDisable()){
            throw new QueueDisableException("disable");
        }

        return result;
    }
}
public class SimpleQueueDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        SimpleQueue sq = new SimpleQueue();
        int kin = 0;
        do {
            System.out.println("1: 저장");
            System.out.println("2: 삭제");
            System.out.println("3: Stop");
            
            try{

                kin = sc.nextInt();
                System.out.printf("kin : %s \n", kin);
                int result = switch (kin) {
                    case 1      -> sq.enQueue(rd.nextInt(20));
                    case 2      -> sq.deQueue();
                    case 3      -> {
                        System.out.println("exit");
                        yield kin;                        
                    }         
                    default     -> {                
                        throw new Exception("unknown Exception");
                    }
                };
            } catch (InputMismatchException e){
                System.out.println(e); 
            } catch (IllegalStateException | NoSuchElementException  e) {
                System.out.println(e);
            } catch (QueueDisableException | BufferEmptyException | BufferFullException e){
                System.out.println(e);
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }while (kin!=3);
    }
}
