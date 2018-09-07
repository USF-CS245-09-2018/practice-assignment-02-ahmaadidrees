public class BinaryRecursiveSearch implements Practice2Search {
    public String searchName(){
        return "Binary recursive search";
    }

    public int search(int [] arr, int target) {
        return search(arr, target, 0, arr.length-1);
    }

    public int search(int [] arr, int target, int low , int upper ){
        if(low > upper){
            return -1;
        }
        int mid = (low + upper)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            return search(arr, target,low, mid -1);
        }
        else{
            return search(arr,target,mid+1, upper);
        }
    }
}
