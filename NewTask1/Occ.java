package NewTask1;

public class Occ {
    public static void main(String[] args) {
        String str1="asdswasdaweafasdaewadadasadswfaswadadaaaaddaaad";
        String str2="";
        for(int i=0;i<str1.length();i++) {
            if (str1.charAt(i) != 'a') {
                str2 += str1.charAt(i);
            }
        }
        System.out.println("String without a:"+str2);
    }
}
