package com.mzx.groupmodel;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 15:45
 */
public class Client {
    public static void main(String[] args) {

        OriginComponent university = new University("清华大学","顶尖大学");

        OriginComponent computerColleage = new Colleage("计算机与信息学院","计算机与信息学院");
        OriginComponent makesiColleage = new Colleage("马克思学院","马克思学院");


        OriginComponent colleageDepartment1 = new Department("软件工程","软件工程");
        OriginComponent colleageDepartment2 = new Department("网络学院","网络学院");

        OriginComponent makesiDepartment1 = new Department("英语","英语");

        computerColleage.add(colleageDepartment1);
        computerColleage.add(colleageDepartment2);

        makesiColleage.add(makesiDepartment1);

        university.add(computerColleage);
        university.add(makesiColleage);

        university.print();
        System.out.println("-----------");

        computerColleage.print();
        System.out.println("------------");

        makesiColleage.print();




    }
}
