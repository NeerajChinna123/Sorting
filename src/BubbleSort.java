
public class BubbleSort {
	void bs(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++) 
				if(arr[j] > arr[j+1]) {
					int x =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
	}
	void pa(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;++i) {
			System.out.println(arr[i]+" ");
		System.out.println();	
		
	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort c=new BubbleSort();
		int arr[]= {32,43,12,65,23,55,88};
		c.bs(arr);
		System.out.println("Sorted array");
		c.pa(arr);
		

	}

}
