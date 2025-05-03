

public class Pattern {

	public static void main(String[] args) {
		//A Pattern
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0&&j!=0&&j!=n-1)||
				  (i>0&&(j==0||j==n-1))||
				  i==(n-1)/2){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//B
			for(int j=0;j<n;j++) {
				if((i==0&&j<n-1)|| j==0 || j==n-1&&i!=0&&i!=(n-1)/2&&i!=n-1||
						i==(n-1)/2&& j!=n-1||i==n-1&&j!=n-1)				
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print(" ");
			//C
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0)||
					(j==0&&i>0&&i!=n-1)||
					(i==n-1&&j>0))				
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print(" ");
			//D
			for(int j=0;j<n;j++) {
				if((i==0 && j<n-1)||
					(j==0&&i>0)||
					(j==n-1&&i>0&&i<n-1)||
					(i==n-1&&j<n-1))				
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.print(" ");//D
		//K
		for(int j=0;j<n;j++) {
			if((j==0)||(i<(n-1)/2&&i+j==(n-1)/2)||(i>(n-1)/2&&i-j==(n-1)/2))				
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println(" ");

	}
	}

}
