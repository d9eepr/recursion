package rec;

public class binarySearch {

	public binarySearch() {
		// TODO Auto-generated constructor stub
	}
	public static int bSearch(int arr[],int target,int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid= start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]<target) {
			return bSearch(arr,target,mid+1,end);
		}
		return bSearch(arr,target,start,mid);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,15,20,25,45,50};
		int target=255;
		System.out.println(bSearch(arr,target,0,arr.length-1));

	}

}
