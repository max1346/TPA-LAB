import java.util.Scanner;
import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        String vocale=new String("aeiou");
        int sw=0;
        String result="";
        Scanner scan = new Scanner(System.in); 
        System.out.print("Introduceti Textul : ");
        String text = scan.nextLine();
        text=text.toLowerCase();
                System.out.println("Cuvintele Obtinute : "+text);
        System.out.print("Introduceti lungimea cuvineteor : ");
        int num = scan.nextInt();  
        StringTokenizer text_final=new StringTokenizer(text, " ,.:;?!");
        while (text_final.hasMoreTokens()) 
        {
            String x=new String(text_final.nextToken());
            if(x.length()==num)
            {
                for(int y=0;y<vocale.length();y++)
                {
                   if(x.charAt(0)==vocale.charAt(y))
                   {
                      sw=1;
                      break;
                   }
                }
                if(sw==1)
                    sw=0;
                else 
                {
                    result+=" "+x;
                    sw=0;
                }
            }
        }
        System.out.println("Cuvintele Obtinute : "+result);
    }
}
