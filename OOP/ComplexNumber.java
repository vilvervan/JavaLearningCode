class Complex{
	private double re;
	private double im;

	public double modulus(){
		return Math.hypot(re,im);
	}
				
	public String toString() {
		if (im == 0) 
			return re + "";
		if (re == 0) 
			return im + "i";
		if (im <  0) 
			return re + " - " + (-im) + "i";
		return re + " + " + im + "i";
	}	
}
