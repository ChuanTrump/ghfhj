package com.imooc.test;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.Messaging.SyncScopeHelper;

public class HelloWorld {
  
	public static void main(String[] args) {
      // TODO Auto-generated method stub
      //定义一个字符串“学习Java编程”
	  String str = "学习Java编程";
	  //打印字符串长度
	  System.out.println("字符串长度："+str.length());
	  //查找字符“编”的位置
	  char c = '编';
	  System.out.println("字符'编'的位置："+str.indexOf(c));
	  //查找字符串“Java的位置”
	  System.out.println("字符串‘Java’的位置："+str.indexOf("Java"));
	  //查询子字符串‘imooc’的位置，如果找不到返回-1
	  System.out.println("子字符串‘imooc’的位置："+str.indexOf("imooc"));
	  //按空格把字符串拆分成数组，并输出数组元素
	  String[] arr = str.split(" ");
	  System.out.println("按空格拆分成数组："+Arrays.toString(arr));
	  System.out.println();
	  //获取索引位置[3,7）之间的子串
	  System.out.println("获取索引位置[3,7)之间的子串："+str.substring(3,7));
	  //Java文件名
	  String fileName = "HelloWorld.java";
	  //邮箱
	  String email = "pangzi@imooc.com";
	  //判断.java文件名是否正确：合法的文件名应以.java结尾
	  int index = fileName.lastIndexOf(".");//获取文件名中"."的位置
	  String prefix = fileName.substring(index+1, fileName.length());//获取文件后缀
	  //判断必须包含"."号，且不能出现在首位，后缀名为”java“
	  if(index != -1 && index != 0 && prefix.equals("java")){
		  System.out.println("Java文件名正确");
	  }else{
		  System.out.println("Java文件名无效");
	  }
	  //判断邮箱格式是否正确：合法的邮箱格式包含“@”，并检查“@”是否在"."之前
	  int index2 = email.indexOf("@");//获取“@”符号的位置
	  int index3 = email.indexOf(".");//获取“.”号的位置
	  if(index2 != -1 && index3>index2){
		  System.out.println("邮箱格式正确");
	  }else{
		  System.out.println("邮箱格式无效");
	  }
	}

}
