public class StrBuffer {
    public static void main(String []args){
        //  StringBuffer s = new StringBuffer("Learn Coading");

        //  System.out.println(s.reverse());

        //  StringBuilder x = new StringBuilder("reverse string ");

        //  System.out.println(x.reverse());

        //  String r1 = "Learn Java";
        //  String r2 = " ";

        //  int len = r1.length();

        //  for(int i=len-1;  i>=0; i--){
        //     r2 =  r2 + r1.charAt(i);
        //  }
        //  System.out.println(r2);


        String r1 = "Learn Java";
        String r2 = " ";

        int len = r1.length();

        for(int i=len-1;  i>=0; i--){
            r2 =  r2 + r1.charAt(i);
        }
        System.out.println(r2);


        

    }
}