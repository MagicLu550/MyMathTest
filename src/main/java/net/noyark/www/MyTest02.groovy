package net.noyark.www;

class MyTest02 {


    static final double C = 1 // 空气阻力系数

    static final double R = 1 // 空气密度

    static final double M = 1 // 空气质量

    //这里由于二维,所以空气接触面为理想的物体正面面积
    //
    // ---
    //｜  ｜
    // ---
    static final double H = 12 // 物体截面长度

    static final double W = 12 // 物体截面宽度

    static void main(String[] args) {
        BigDecimal max = 20
        BigDecimal t = max
        BigDecimal s = 0
        while(t++){
            println(-(t-max))
            println("动能: "+getEk(t))
            println("速度: "+getV(t))
            s+= getV(t)
        }
        println("路程: "+s+"m")
    }

    static final  double getV(BigDecimal t){
        return t==0?0:(2*M)/(C*R*H*W*t)
    }
    static final double getEk(BigDecimal t){
        return t==0?0:((M**2))/(2*((C**2)*(R**2)*((H*W)**2)*t))
    }
}
