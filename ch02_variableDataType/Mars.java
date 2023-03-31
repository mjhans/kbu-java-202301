public class Mars{
    public static void main(String[] args){
        
        //final은 생성과 동시에 할당 필요, 값 변경은 안된다.
        final int MINUTES_TO_SECONDS = 60; // 1분은 60초
        // 3천 4백만 마일 == 34,000,000
        int earthToMarsDistances = 34000000; // miles
        
        // 라디오 주파수 신호의 속도 == 빛의 속도 == 186,000 mile/sec
        int radioSpeed = 186000; // mile/sec
        
        // 초당 지연시간 = 거리 / 속도 , 속도 = 거리 / 걸린시간
        int nElapsedSeconds = earthToMarsDistances / radioSpeed;
        System.out.println(String.format("elapsed time : %d (sec)", nElapsedSeconds ));
        
        double dElapsedSeconds = earthToMarsDistances / radioSpeed;
        System.out.println(String.format("elapsed time : %f (sec)", dElapsedSeconds ));
        //System.out.println(String.format("elapsed time : %d (sec)", dElapsedSeconds )); 에러 %d는 정수형 값을 나타냄

        int nElapsedMinutes = nElapsedSeconds / MINUTES_TO_SECONDS;
        System.out.println(String.format("elapsed time : %d (min)", nElapsedMinutes ));

        double dElapsedMinutes = dElapsedSeconds / MINUTES_TO_SECONDS;
        System.out.println(String.format("elapsed time : %f (min)", dElapsedMinutes ));
        System.out.println(String.format("elapsed time : %02f (min)", dElapsedMinutes ));
    }
}