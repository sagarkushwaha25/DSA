class LinearSrch {
	public static void search(int arr[], int x) {
		int l = 0;
		int length = arr.length;
		int r = length - 1;
		int position = -1;

		for (l = 0; l <= r;) {
			if (arr[l] == x) {
				position = l;
				System.out.println("Element found at " + (position + 1) + " Position ");
				break;
			}
	
			if (arr[r] == x){
				position = r;
				System.out.println(
					"Element found at "+ (position + 1) + " Position");
				break;
			}
			l++;
			r--;
		}

		if (position == -1)
			System.out.println("Not found");
	}

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};
		int x = 5;
		search(arr,x);
	}
}
