package myaddress;

/**
 *
 * @author Babeen
 */
import java.net.*;
public class IBiblioAliases {
 public static void main (String args[]) {
 try {
 InetAddress ibiblio = InetAddress.getByName("www.facebook.com");
 InetAddress helios = InetAddress.getByName("business.facebook.com");
 if (ibiblio.equals(helios)) {
 System.out.println
 ("www.facebook.com is the same as business.facebook.com");
 } else {
 System.out.println
 ("www.facebook.com is not the same as business.facebook.com");
 }
 } catch (UnknownHostException ex) {
 System.out.println("Host lookup failed.");
 }
 }
}
