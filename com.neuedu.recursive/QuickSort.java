public class QuickSort
{
    public static void main(String[] args) {

        int arr[]={4,2,5,7,9,7,4,6,8,9,0,7,4,5,6,8,9,6,6,8,9,7,4,3,55,44,33,77,65,25,78,46,98,46,88};
        sort(arr,0,arr.length-1);
        for(int item:arr) System.out.print("-"+item);
        
    }

    public static void sort(int[] arr,int left,int right)
    {//双指针
        if(left>=right) return;

        int base=arr[left];
        int i=left;
        int j=right;
        while(i!=j)
        {
            //从右向左找
            while(arr[j]>=base&&i<j) j--;
            //从左向右找
            while(arr[i]<=base&&i<j) i++;
            //i,j交换
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        arr[left]=arr[i];
        arr[i]=base;//基准数归位,位置是i

        sort(arr,left,i-1);
        sort(arr,i+1,right);

    }
}