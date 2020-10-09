import java.util.*;
public class StringTwist{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Three words : \n");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int l1 = str1.length();
        int l2 = str2.length();

        String s1 = "";
        String s2 = "";
        String s3 = "";

        char c;

        for(int i = 0; i < l1; i++){
            c = str1.charAt(i);
            if (c=='A'|| c=='a'|| c=='E'|| c=='e'|| 
            c=='I'|| c=='i'|| c=='O'|| c=='o'|| c=='U'|| c=='u') {
                s1 = s1 + "%";
            } else {
                s1 = s1 + c;
            }

        }

        for(int i = 0; i < l2; i++){
            c = str2.charAt(i);
            if (c >= 'A'&& c <= 'Z'|| c >= 'a' && c <= 'z') {
                if (c=='A'|| c=='a'|| c=='E'|| c=='e'|| 
                c=='I'|| c=='i'|| c=='O'|| c=='o'|| c=='U'|| c=='u') {
                    s2 = s2 + c;
                } else {
                    s2 = s2 + "#";
                }
            } else {
                s2 = s2 + c;
            }
        }

        s3 = str3.toUpperCase();
        System.out.println(s1+s2+s3);

    }
}