public class Practice_01
{
    public static boolean getNum(String str){
        //是否包含12345
        int arr[]={1,2,3,4,5};
        for(int num:arr) {
            if(str.indexOf(num+"")==-1) {
                return false;
            }
        }
        //判断是否有两个2（在只有六位数的情况下）
        if(str.indexOf("2")==str.lastIndexOf("2")) {
            return false;
        }
        //4不在第三位
        if(str.charAt(2)=='4') {
            return false;
        }
        if(str.indexOf("35")!=-1||str.indexOf("53")!=-1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i=122345;i<=543221;i++)
        {
            if(getNum(i+"")) System.out.println(i);
        }
    }
}