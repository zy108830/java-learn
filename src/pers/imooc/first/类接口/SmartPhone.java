package pers.imooc.first.类接口;

/**
 * Created by xinchao on 10/31/16.
 */
public class SmartPhone extends Telphone implements IPlayGame{

    public static void main(String[] args) {

    }

    public void call(){
        System.out.println("智能手机通过微信打电话");
    }


    public void message(){
        System.out.println("智能手机通过微信发消息");
    }

    @Override
    public void playGame() {
        System.out.println("智能手机可以用来玩游戏");
    }



}
