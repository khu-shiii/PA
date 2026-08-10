import java.util.*;
class BinaryWatch {
    static List<String> answer=new ArrayList<>();
    public static void backtrack(int index,int count,int turnedOn,int[] leds){
        if(count==turnedOn){
            int hour=0;
            int minutes=0;
            for(int i=0;i<4;i++){
                if(leds[i]==1){
                    hour+=(1<<i);
                }
            }
            for(int i=4;i<10;i++){
                if(leds[i]==1)
                minutes+=(1<<(i-4));
            }
            if(hour<=11 && minutes<=59){
                String time=hour+":"+String.format("%02d",minutes);
                answer.add(time);
            }
            return ;
        }
        if(index==10){
            return;
        }
        leds[index]=1;
        backtrack(index+1,count+1,turnedOn,leds);
        leds[index]=0;
        backtrack(index+1,count,turnedOn,leds);
    }
    public static void main(String[] arga) {
        answer.clear();
        int[] leds = new int[10];
	int turnedOn=1;

        backtrack(0, 0, turnedOn, leds);
         System.out.print(answer);
    }
}