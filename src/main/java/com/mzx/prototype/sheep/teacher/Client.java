package com.mzx.prototype.sheep.teacher;

public class Client {

	public static void main(String[] args) throws Exception {

		DeepProtoType deepProtoType = new DeepProtoType();
		deepProtoType.name="张三";
		deepProtoType.deepCloneableTarget = new DeepCloneableTarget("李四","李四");

		DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.deepClone();
		System.out.println(deepProtoType.deepCloneableTarget.hashCode());
		System.out.println(deepProtoType1.deepCloneableTarget.hashCode());
	
	}

}
