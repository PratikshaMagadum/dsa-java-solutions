class Solution {
    public int[] sortArray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        mergeSort(nums,low,high);
        return nums;
    }

    public void mergeSort(int arr[],int low,int high){

        if ( low == high ){
            return;
        }

        int mid = ( high + low ) / 2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);

        return;
    }

    public void merge (int arr[] , int low , int mid, int high){

        int left=low;
        int right=mid+1;
        int index=0;

        int [] temp= new int [high-low+1];

        while(left<=mid && right<=high){

                if(arr[left]<=arr[right]){

                    temp[index]=arr[left];
                    left++;
                    index++;

                }
                else{

                    temp[index]=arr[right];
                    right++;
                    index++;

                }

        }

        while(left<=mid){
            temp[index] = arr[left];
            left++;
            index++;
        }

        while(right<=high){
            temp[index] = arr[right];
            right++;
            index++;
        }

        for(int i=low;i<=high;i++){

            arr[i] = temp[i-low];

        }

        
    }
}
