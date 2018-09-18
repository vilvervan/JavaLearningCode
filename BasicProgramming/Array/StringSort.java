class StringSort{
	public static void main(String[] args){
		String name = "Donald Trump";
		int len = name.length;
		for(i = 0;i < len;i++){
			String temp = name[i];
			name[i] = name[i-1-i];
			name[n-1-i] = temp;
		}
		System.out.println(name);
	}
}