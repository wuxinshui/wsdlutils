package org.wuxinshui.boosters.designPatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2016/11/16
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class AirCondition {
    public void on() {
        System.out.println("空调正在开启。。。");
    }

    public void off() {
        System.out.println("空调正在关闭");
    }
}
