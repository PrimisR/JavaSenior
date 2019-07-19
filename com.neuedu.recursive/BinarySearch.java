public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,8,9,12,15,17};
        System.out.println(search(arr, 5, 0, arr.length-1));
    }

    public static int search(int[] arr,int data,int startIndex,int endIndex)
    {
        int middleIndex=(startIndex+endIndex)/2;
        if(data<arr[startIndex]||data>arr[endIndex]||startIndex>endIndex) return -1;
        if(data<arr[middleIndex]) return search(arr,data,startIndex,middleIndex-1);
        else if(data>arr[middleIndex]) return search(arr,data,middleIndex+1,endIndex);
        else return middleIndex;
    }
}