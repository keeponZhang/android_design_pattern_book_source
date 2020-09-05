package com.wbb.dp.chapter16;

/**
 * @author vico
 * @date 2018-12-01
 */
public interface Visitor {
    //访问工程师类型
    public void visit(Engineer engineer);

    //访问经理类型
    public void visit(Manager manager);
}
