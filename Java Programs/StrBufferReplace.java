public class StrBufferReplace{
    public static void main(String[] args) {
        StringBuffer strBuffer=new StringBuffer("Hello World");
        strBuffer.replace(0,5,"Hey");
        System.out.println(strBuffer);
    }
}
