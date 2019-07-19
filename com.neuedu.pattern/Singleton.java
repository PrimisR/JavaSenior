public class Singleton
{
    //����ʽ
    //private static Singleton instance = new Singleton();

    //������.��������
/*  public static Singleton getInstance()
    {
        return instance;
    }
*/

    private Singleton()//������˽��
    {

    }

    //����ʽ ���ײ����̰߳�ȫ����,Ҫ����
    private static Singleton instance;
    
    public synchronized static Singleton getInstance()
    {
        if(instance==null) instance=new Singleton();
        return instance;
    }
}
/**
 * 1��������
 * 2��û������
 * �ô���
 * һ�����󣬽�ʡ��Դ
 * static����
 */