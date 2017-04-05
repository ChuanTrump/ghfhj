package com.imooc.test;

public class ChainTest {
	/*
	 * test1():抛出“喝大了”异常
	 * test2():调用test1(),捕获“喝大了”异常，并且包装成运行时异常，继续抛出
	 * main方法中调用test2，尝试捕获test()方法抛出的异常
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
		throw new DrunkException("喝酒别开车");
	}
    public void test2(){
    	try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc = new RuntimeException("司机不要喝酒");
			newExc.initCause(e);
			throw newExc;
			
		}
    }
   
}
