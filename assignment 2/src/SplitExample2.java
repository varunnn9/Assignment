public class SplitExample2 {
    public static void main(String args[]){
        String str="javapointt";
        System.out.println("returning words:");
        String[] arr=str.split ("t",0);
        for (String w:arr){
            System.out.println(w);
        }
        System.out.println("split array length:"+arr.length);
    }
}
;
