package com.imooc.test;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.Messaging.SyncScopeHelper;

public class HelloWorld {
  
	public static void main(String[] args) {
      // TODO Auto-generated method stub
      //����һ���ַ�����ѧϰJava��̡�
	  String str = "ѧϰJava���";
	  //��ӡ�ַ�������
	  System.out.println("�ַ������ȣ�"+str.length());
	  //�����ַ����ࡱ��λ��
	  char c = '��';
	  System.out.println("�ַ�'��'��λ�ã�"+str.indexOf(c));
	  //�����ַ�����Java��λ�á�
	  System.out.println("�ַ�����Java����λ�ã�"+str.indexOf("Java"));
	  //��ѯ���ַ�����imooc����λ�ã�����Ҳ�������-1
	  System.out.println("���ַ�����imooc����λ�ã�"+str.indexOf("imooc"));
	  //���ո���ַ�����ֳ����飬���������Ԫ��
	  String[] arr = str.split(" ");
	  System.out.println("���ո��ֳ����飺"+Arrays.toString(arr));
	  System.out.println();
	  //��ȡ����λ��[3,7��֮����Ӵ�
	  System.out.println("��ȡ����λ��[3,7)֮����Ӵ���"+str.substring(3,7));
	  //Java�ļ���
	  String fileName = "HelloWorld.java";
	  //����
	  String email = "pangzi@imooc.com";
	  //�ж�.java�ļ����Ƿ���ȷ���Ϸ����ļ���Ӧ��.java��β
	  int index = fileName.lastIndexOf(".");//��ȡ�ļ�����"."��λ��
	  String prefix = fileName.substring(index+1, fileName.length());//��ȡ�ļ���׺
	  //�жϱ������"."�ţ��Ҳ��ܳ�������λ����׺��Ϊ��java��
	  if(index != -1 && index != 0 && prefix.equals("java")){
		  System.out.println("Java�ļ�����ȷ");
	  }else{
		  System.out.println("Java�ļ�����Ч");
	  }
	  //�ж������ʽ�Ƿ���ȷ���Ϸ��������ʽ������@��������顰@���Ƿ���"."֮ǰ
	  int index2 = email.indexOf("@");//��ȡ��@�����ŵ�λ��
	  int index3 = email.indexOf(".");//��ȡ��.���ŵ�λ��
	  if(index2 != -1 && index3>index2){
		  System.out.println("�����ʽ��ȷ");
	  }else{
		  System.out.println("�����ʽ��Ч");
	  }
	}

}
