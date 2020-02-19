package net.noyark.www

class MyTest03 {

    static final def V0 = 100

    static final def M = 100

    static final def W = 100

    static final def H = 100

    static final def K = 0.2

    static void main(String[] args) {

        double t = 1

        def before = 0
        while (true){
            def now = getDamage(t)
            println now
            println("变化量: "+(before==0?now:before-now))
            println("速度: "+getV(t))
            println("路程: "+(Integer)(getV(t)*t))
            println("伤害: "+(Integer)now)
            if(now == 0)break
            before = now
            t++
        }

    }

    static def getDamage(t){
        def ans = (V0**2)*M - K * (W * H * M * Math.log(t))
        return ans<0?0:ans
    }

    static def getV(t){
        return getDamage(t)/100
    }


}
