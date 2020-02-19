package net.noyark.www

import javax.swing.*
import java.awt.*

class MyTest04 {


    static void main(String[] args) {
        MyPanel p = new MyPanel()
        Thread panelThread = new Thread(p)
        JFrame frame = new JFrame()
        frame.add(p)
        frame.setSize(10000, 100)
        frame.setLocationRelativeTo(null)
        frame.setVisible(true)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        panelThread.start()
    }


    static class MyPanel extends JPanel implements Runnable{

        private BigDecimal t = 1

        def s = 0

        @Override
        void paint(Graphics g) {
            super.paint(g)
            g.setColor(new Color(0x5AFF9E))
            def x = (Integer)((Integer)(MyTest03.getV(t))/100)
            x = x == (Integer)((Integer)(MyTest03.getV(1))/100)?0:x
            g.drawString("[]==",0,30)
            g.drawString("x: ${s}\n"+" v:${MyTest03.getV(t)}",10,10)
            s+=x
            g.fillOval((Integer)(s/10),30,10,10)
            g.drawString("^(${s},30,${x}):Damage:${MyTest03.getDamage(t)}",(Integer)(s/10),35)
            t++
        }

        @Override
        void run() {
            while (true) {

                this.repaint()
                try {
                    Thread.sleep(100)
                } catch (InterruptedException e) {
                    e.printStackTrace()
                }
            }
        }
    }
}
