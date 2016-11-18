package pers.imooc.second.demo4_5;
public class Common {
    public static void main(String[] args) {
        CellPhone phone1=new CellPhone();
        SmartPhone phone2=new SmartPhone();
        phone1.call();
        phone2.call();

        //常规调用
        IPlayGame ip1=new SmartPhone();
        IPlayGame ip2=new Psp();
        ip1.playGame();
        ip2.playGame();

        //匿名内部类调用
        IPlayGame ip3=new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("ipad可以用来玩游戏");
            }
        };
        ip3.playGame();
    }
}
