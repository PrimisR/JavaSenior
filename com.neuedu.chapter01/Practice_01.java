public class Practice_01
{
    public static boolean getNum(String str){
        //�Ƿ����12345
        int arr[]={1,2,3,4,5};
        for(int num:arr) {
            if(str.indexOf(num+"")==-1) {
                return false;
            }
        }
        //�ж��Ƿ�������2����ֻ����λ��������£�
        if(str.indexOf("2")==str.lastIndexOf("2")) {
            return false;
        }
        //4���ڵ���λ
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