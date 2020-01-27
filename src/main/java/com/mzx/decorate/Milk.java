package com.mzx.decorate;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 21:44
 */
public class Milk extends Decorater {

   public Milk(Drink drink){
       super(drink);
       super.setPrice(2);
       super.setMessage(" 牛奶");
   }

}
