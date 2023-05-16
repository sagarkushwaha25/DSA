class BinarySearch{  
	public static int binarySearch(int arr[],int f,int l,int x) {  
	  	int mid = (f + l)/2;  
		while(f <= l) {  
			if (arr[mid] == x) {  
		    	System.out.println("x is found at index: " + mid);
				break;
			}
			if (arr[mid] < x) {  
				f = mid + 1;     
			}
			else{  
				l = mid - 1;  
			}  
			mid = (f + l)/2;  
		}  
		if (f > l) {  
			System.out.println("x not found");  
	  	} 
		return -1; 
	}  
	public static void main(String args[]){  
		int arr[] = {1,2,3,4,5,6};  
		int x = 5;  
		int l=arr.length-1;  
		binarySearch(arr,0,l,x); 
	
	}  
}  