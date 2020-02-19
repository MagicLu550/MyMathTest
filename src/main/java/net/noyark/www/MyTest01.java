package net.noyark.www;

public class MyTest01 {

    public static double S = 0;//路程

    public static double V = 10;//初速度

    public static final double W = 0.4;// 长

    public static final double H = 0.9;//宽

    public static final double R = 2;//空气密度

    public static final double M = 1;//质量



    public static void main(String[] args) {
        double a = W*H*R;
        new Thread(()->{
            while (true) {
                try {
                    Thread.sleep(1000);
                    double i = getE(a, M);
                    if(i <0)break;
                    System.out.println(i);
                    S += V;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("最远路程: "+S);
        }).start();
    }

    public static double getE(double a,double m){
        a = a * 2 * Math.abs(Math.log(V));
        return (0.5*(V-=a))/m;
    }
}
