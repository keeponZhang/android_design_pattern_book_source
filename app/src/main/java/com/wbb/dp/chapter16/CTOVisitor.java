package com.wbb.dp.chapter16;

/**
 * @author vico
 * @date 2018-12-01
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 ："+engineer.name+",代码函数："+engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 ： "+manager.name+"产品数量 ： "+manager.getProducts());
    }
}
