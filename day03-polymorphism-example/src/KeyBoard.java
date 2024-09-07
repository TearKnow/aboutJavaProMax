public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功接入了设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功弹出了");
    }

    //独有功能
    public void keyDown(){
        System.out.println(name + "写下了：老铁 666");
    }

}
