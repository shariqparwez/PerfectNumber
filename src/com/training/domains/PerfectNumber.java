package com.training.domains;

public class PerfectNumber {
	private int number;
	private int max;
	private int min;

	public PerfectNumber(){
		super();
	}
	
	public PerfectNumber(int number) throws Exception {
		super();
		if(number<0) throw new Exception();
		else
		this.number = number;
	}
	
	public PerfectNumber(int max, int min) throws Exception {
		super();
		if(max < 0 || min < 0) throw new Exception();
		else{
			this.max = max;
			this.min = min;
		}
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	public boolean checkPerfectNumber(){
		boolean check = false;
		int i = 1;
		int sum = 0;
		
		while(i<number){
		      if(number%i==0)
		           sum=sum+i;
		          i++;
		  }
		
		if (sum==number)
			check = true;
		else
			check = false;
		
		return check;
			
	}
	
	public boolean checkPerfectNumber(int number){
		boolean check = false;
		int i = 1;
		int sum = 0;
		
		while(i<number){
		      if(number%i==0)
		           sum=sum+i;
		          i++;
		  }
		
		if (sum==number)
			check = true;
		else
			check = false;
		
		return check;
			
	}
	
	public void printPerfectNumbers(){
		int i = 0, n, sum = 0;
		boolean check = false;
	
		for(n = min; n <= max; n++){
			check = checkPerfectNumber(n);
				if(check)
					System.out.print(n + " ");
			  }
		System.out.println();
	}
		
}
