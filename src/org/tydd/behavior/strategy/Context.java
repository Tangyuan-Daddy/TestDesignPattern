package org.tydd.behavior.strategy;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/3/10
 * @ Description：封装角色
 */
public class Context {

    private Calculator calendar;

    public Context(Calculator _calendar) {
        this.calendar = _calendar;
    }

    public int exec(int a, int b) {
        return this.calendar.exec(a, b);
    }
}
