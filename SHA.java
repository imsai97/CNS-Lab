import java.math.*;
import java.security.*;
import java.util.Scanner;
public class SHA
{

    public static String encryptThString(String input)
    {
        try {
            MessageDigest md=MessageDigest.getInstance("SHA-1");
            byte[] messagedigest=md.digest(input.getBytes());
            BigInteger no=new BigInteger(1,messagedigest);
            String hashtext=no.toString(16);
            while(hashtext.length()<32)
            {
                hashtext="0"+hashtext;
            }
            return hashtext;
        } 
        catch (NoSuchAlgorithmException e) {
            // TODO: handle exception
            throw new RuntimeException(e);

        }
    }
    public static void main(String[] args) throws NoSuchAlgorithmException 
    {    
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         System.out.println("\n"+s+":"+encryptThString(s));
    }
    
}