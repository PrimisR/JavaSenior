public class TestString2
{
    public static void main(String[] args) {
        String str="helloworld";
        //indexOf用来判断包含
        System.out.println(str.indexOf("ll"));//2
        System.out.println(str.indexOf("a"));//-1

        System.out.println(str.lastIndexOf("l"));//8

        //split
        String str2="aa1bb2cc";
        String[] arr=str2.split("\\d");//给\转义，\是正常字符
        //正则表达式中\d代表数字
        //split接受正则表达式
        for(String s:arr)
            System.out.println(s);

        String _str2="aa   bb cc    dd";
        // \s表示空白字符，+表示一个或多个
        String[] _arr=_str2.split("\\s++");
        for(String s:_arr)
            System.out.println(s);

        String __str2="aa.bb.cc.dd";
        //"."是正则表达式的关键符号，写两个\\可以转义
        String[] __arr=__str2.split("\\.");
        for(String s:__arr)
            System.out.println(s);

        String str3="helloworld";
        System.out.println(str3.replace("l", "a"));
    }
}