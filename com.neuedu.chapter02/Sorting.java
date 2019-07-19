public class Sorting
{
    public static void main(String[] args) {
        Integer[] arr1={60,78,99,88};
        bubbleSort(arr1);
        for(Integer item:arr1)
            System.out.println(item);

        String[] arr2={"dbc","acb","bcc","bca"};
        bubbleSort(arr2);
        for(String str:arr2)
            System.out.println(str);
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr)
    //String,Student..只要继承comparable<T>都可以比较
    {
        T temp=null;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    //switch places
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;//引用类型
                }   
            }
        }
    }
}