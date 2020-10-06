package com.example.Streams;

public class PerformOperation {

	public boolean performOp(int num,Operation op) {
		return op.perform(num);
	}
	
	public static void main(String[] args) {
		PerformOperation po=new PerformOperation();
		
		System.out.println(po.performOp(2, num->num%2==0)?"Even Number":"Odd Number");
		
		System.out.println(po.performOp(7, num->{
			for(int i=2;i<num/2;i++) {
				if(num%i==0)  return false;
			}
			return true;
		})?"Prime Number":"Not Prime Number");
		
		System.out.println(po.performOp(121,num->{
			int n=num,r=0,rN=0;
			 while (n != 0) {
			        r = n % 10;
			        rN = rN * 10 + r;
			        n /= 10;
			    }
			 if(rN==num) return true;
			 else return false;
		})?"Pallindrome ":"Not Palindorme ");
		
	}
	
interface Operation{
	boolean perform(int num);
}
}