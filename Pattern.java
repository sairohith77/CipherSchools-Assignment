class Pattern{
	public void PrintStarPattern(int n){
		for(int i=0;i<n;i++){
			for(int j=(n-i);j>=0;j--){
				System.out.print(" ");
			}
			for(int j= 0;j<= i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void PrintCharPattern(int n){
		char ch ='A';
		for(int i=0; i<n; i++){
			for(int j=2*(n-i); j>=0; j--){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
	public static void main(String...args){
		Pattern ob = new Pattern();
		ob.PrintStarPattern(5);
		ob.PrintCharPattern(5);
	}
}