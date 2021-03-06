package com.imooc.test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
		int result = tct.test();
		System.out.println("test()方法执行完毕！返回值为："+result);

	}
	/**
	 * divider(除数)：
	 * result(结果)：
	 * try-catch捕获while循环
	 * 每次循环，divider减一，result=result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！”，返回-1
	 * 否则，返回result
	 * @return
	 */
    public int test(){
    	int divider = 10;
    	int result = 100;
    	try{
    		while(divider>-1){
    			divider--;
    			result = result+100/divider;
    		}
    		return result;
    	}catch(Exception e){
    		e.printStackTrace();
    		System.out.println("循环抛出异常了！");
    		return -1;
    	}
    	
    }
    
}
