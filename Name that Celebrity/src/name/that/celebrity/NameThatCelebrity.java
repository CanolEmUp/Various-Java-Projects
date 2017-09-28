//Ned Ean
//Name that Celebrity
//April 11th, 2017
package name.that.celebrity;

public class NameThatCelebrity {

    public static void main(String[] args) {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        int s1_len = s1.length();
        int s2_len = s2.length();
        int s3_len = s3.length();

        System.out.println(s1 + ">>>" + s1.substring(s1_len-8,5) + " " + s1.substring(s1_len-1));
        System.out.println(s2 + ">>>" + s2.substring(s2_len-8,5) + " " + s2.substring(s2_len-5,7));
        System.out.println(s3 + ">>>" + s3.substring(s3_len-10,7) + " " + s3.substring(s3_len-4,9));
    }
    
}
