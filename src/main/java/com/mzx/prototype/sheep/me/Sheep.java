package com.mzx.prototype.sheep.me;

import java.io.*;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 16:59
 */
public class Sheep implements Serializable,Cloneable {

    public String name;
    public SheepClone sheepCloneTarget;
    public Sheep(){
        super();
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
            Object o = ois.readObject();

            return o;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
