public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
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
    public void click(){
        System.out.println(name + "双击点亮了");
    }

}
