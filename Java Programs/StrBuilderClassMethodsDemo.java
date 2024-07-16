public class StrBuilderClassMethodsDemo {
    public static void main(String args[]){
        char ch[]={'h','e','l','l','o'};
        String s1=new String(ch);
        System.out.println(s1);

        String s2=new String("my");
        System.out.println(s2);

        String s3=new String("Friends");
        System.out.println(s1+" "+s2+" "+s3);
    
        StringBuilder buff=new StringBuilder("Hello");
        buff.append("Sharwari").insert(0,"Oh! ").replace(4,9,"Hi").delete(0,4);
        System.out.println(buff.reverse());    
    }
}
