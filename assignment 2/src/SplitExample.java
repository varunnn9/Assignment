public class SplitExample {
    public static void main(String args[]){
    String s1="java string split method by javapoint";
    String[] words=s1.split("\\s");//split the string based on whitespace
    //using java foreach loop to print elements of string array
    for (String w:words) {
        System.out.println(w);
    }
    }
}
