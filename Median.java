class Scorer{
	public static void main(String[] args){
		double a = Integer.parse(args[0]);
		double b = Integer.parse(args[0]);
		double c = Integer.parse(args[0]);
		double d = Integer.parse(args[0]);
		double e = Integer.parse(args[0]);
		double f = Integer.parse(args[0]);
		
		double t,min = a,max = a,avg;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		if(e < min) min = e;
		if(f < min) min = f;
		if(b > max) max = b;
		if(c > max) max = c;
		if(e > max) max = e;
		if(d > max) max = d;
		if(f > max) max = f;
		
		avg = (a + b + c + d + e + f - min - max)/6;
		System.out.println("max:" + max + ", min=" + min + ", avg=" + avg);
	}
}