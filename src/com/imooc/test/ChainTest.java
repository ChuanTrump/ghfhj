package com.imooc.test;

public class ChainTest {
	/*
	 * test1():�׳����ȴ��ˡ��쳣
	 * test2():����test1(),���񡰺ȴ��ˡ��쳣�����Ұ�װ������ʱ�쳣�������׳�
	 * main�����е���test2�����Բ���test()�����׳����쳣
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}
	public void test1() throws DrunkException{
		throw new DrunkException("�ȾƱ𿪳�");
	}
    public void test2(){
    	try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc = new RuntimeException("˾����Ҫ�Ⱦ�");
			newExc.initCause(e);
			throw newExc;
			
		}
    }
   
}
