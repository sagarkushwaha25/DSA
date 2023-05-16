public class BinarySearchRec {
    public static int binarysearchrec(int arr[],int first,int last,int item) {
        if(last>=first) {
            int mid = (last + first) / 2;
            if (arr[mid]==item) {
                return mid;
            }
            if (arr[mid]>item) {
                return binarysearchrec(arr,first,mid-1,item);
            }
            else 
                return binarysearchrec(arr,mid+1,last,item);
        }
        if (first > last) {  
			return -1;
	  	}
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int item =60;
        int last = arr.length - 1;
        int r = binarysearchrec(arr,0,last,item);
        if (r == -1)
            System.out.println("Item not found"); 
        else 
            System.out.println("Item found at : " + r);
    } 
}
