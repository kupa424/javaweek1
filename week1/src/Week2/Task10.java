package Week2;

public class Task10 {
    public static interface USB {
        public abstract void on();

        public abstract void off();
    }
    public static class Mouse implements USB{
        public void on(){
            System.out.println("鼠标启动了");
        }
        public void off(){
            System.out.println("鼠标关闭了");
        }
    }
    public static class Keyboard implements USB{
        public void on(){
            System.out.println("键盘启动了");
        }
        public void off(){
            System.out.println("键盘关闭了");
        }
    }
    public static class Mike implements USB{
        public void on(){
            System.out.println("麦克风启动了");
        }
        public void off(){
            System.out.println("麦克风关闭了");
        }
    }
    public static class Laptop{
        public void useUSBon(USB usb){
            usb.on();
        }
        public void useUSBoff(USB usb){
            usb.off();
        }
        public void poweron(){
            System.out.println("电脑开机成功");
        }
        public void poweroff(){
            System.out.println("电脑关机成功");
        }
    }

    public static void main(String[] args) {
        Laptop laptop =new Laptop();
        USB mouse=new Mouse();
        USB keyboard=new Keyboard();
        USB mike=new  Mike();
        laptop.useUSBon(mouse);
        laptop.useUSBon(keyboard);
        laptop.useUSBon(mike);
        laptop.poweron();
        System.out.println("------------------");
        laptop.useUSBoff(mouse);
        laptop.useUSBoff(keyboard);
        laptop.useUSBoff(mike);
        laptop.poweroff();
    }
}
