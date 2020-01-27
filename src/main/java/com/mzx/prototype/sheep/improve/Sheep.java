package com.mzx.prototype.sheep.improve;

import lombok.Data;
import lombok.ToString;

import java.io.*;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 16:18
 */
@Data
@ToString
public class Sheep implements Serializable , Cloneable {

    private String name;

    public SheepClone sheepClone;

    public Sheep(){
        super();
    }


    /**
     *  深拷贝实现方式一
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object object = null;
        // 先克隆基本属性
        object = super.clone();

        Sheep sheep1 = (Sheep) object;
        //  将当前对象的引用类型对象 进行克隆
        sheep1.sheepClone = (SheepClone) sheepClone.clone();

        return sheep1;
    }

    public Object sheepClone(){

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep o = (Sheep) ois.readObject();

            return o;

        }catch (Exception e){
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }


    }
}
