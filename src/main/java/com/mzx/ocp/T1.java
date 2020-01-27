package com.mzx.ocp;

/**
 * @author ZhenXinMa
 * @date 2020/1/23 16:04
 *
 *      开闭原则：提供方可以扩展代码，使用方不能修改代码
 *
 */
public class T1 {
    public static void main(String[] args) {
        EditShape editShape = new EditShape();
        editShape.edit(new Circle());
        editShape.edit(new Trangle());
    }
}

// 使用方
class EditShape{
    public void edit(Shape s){
        s.draw();
    }
}

// 提供方
interface Shape{
    void draw();
}

// 圆
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("画圆");
    }
}

class Trangle implements Shape{

    @Override
    public void draw() {
        System.out.println("画三角");
    }
}



