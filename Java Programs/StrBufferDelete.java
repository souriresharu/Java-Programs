public class StrBufferDelete {
    public static void main(String[] args) {
        StringBuffer strBuffer=new StringBuffer("Hello World");
        strBuffer.delete(6,11);
        System.out.println(strBuffer);
    }
}
