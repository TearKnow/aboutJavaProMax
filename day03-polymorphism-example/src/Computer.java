public class Computer {
    //提供一个安装入口
    public void installUSB(USB u){
        u.connect();

        //独有功能
        if(u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.click();
        } else if (u instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) u;
            k.keyDown();
        }


        u.unconnect();
    }
}
