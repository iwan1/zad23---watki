package zad23;

public class Watek extends Thread{
    public int X;
    public int Y;
    
    public Watek(int x, int y){
        X = x;
        Y = y;
    }
    @Override
    public void run(){
        for(int i = X; i <= Y; i++){
            if((i%3)==0){
                System.out.println(i);
            }
        }
    }

}
