public class Main {
    public static void main(String[] args) {
        //目标：设计一个电脑对象，可以安装两个usd设备
        /**
         * 1. 定义usd接口，接入 拔出
         * 2. 定义两个usd的实现类，鼠标和键盘
         */

        Computer c = new Computer();
        
        USB u = new Mouse("罗技");
        c.installUSB(u);

        USB k = new KeyBoard("DELL");
        c.installUSB(k);

    }
}