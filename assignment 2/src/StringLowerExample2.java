import java.util.Locale;
public class StringLowerExample2 {
    public static void main(String args[]){
        String s="JAVAPOINT HELLO stRING";
        String eng=s.toLowerCase(Locale.ENGLISH);
        System.out.println(eng);
        String turkish=s.toLowerCase(Locale.forLanguageTag("tr"));// it shows i without dot
        System.out.println(turkish);
    }

}
