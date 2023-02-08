public class EqualsExample {
    public static void main(String args[]){
        String s1="javapoint";
        String s2="javapoint";
        String s3="javapoint";
        System.out.println(s1.equals(s2));//true because content is same
        if (s1.equals(s3)){
            System.out.println("Both strings are equals");

        }else System.out.println("both strings are unequal");
    }
}
