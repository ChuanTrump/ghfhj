package com.imooc.test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
		int result = tct.test();
		System.out.println("test()����ִ����ϣ�����ֵΪ��"+result);

	}
	/**
	 * divider(����)��
	 * result(���)��
	 * try-catch����whileѭ��
	 * ÿ��ѭ����divider��һ��result=result+100/divider
	 * ����������쳣����ӡ������׳��쳣�ˣ���������-1
	 * ���򣬷���result
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
    		System.out.println("ѭ���׳��쳣�ˣ�");
    		return -1;
    	}
    	
    }
    
}