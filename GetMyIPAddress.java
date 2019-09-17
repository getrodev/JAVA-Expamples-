// This program will get the IP Address

import java.net.InetAddress;

class GetMyIPAddress {
    public static void main(String args[]) throws Exception  {
        /* public static InetAddress getLocalHost()
         * throws UnknownHostException: Returns the address
         * of the local host. This is achieved by retrieving
         * the name of the host from the system, then resolving
         * that name into an InetAddress. Note: The resolved
         * address may be cached for a short period of time.

         */

        InetAddress myIP=InetAddress.getLocalHost();

        /* public String getHostAddress(): Returns
        the IP address string in textual presentation
         */

        System.out.println("My IP Address is:");
        System.out.println(myIP.getHostAddress());
    }
}


/* InetAddress class of java.net package
is used, getLocalHost method returns InetAddress
object which represents local host.
 */

/*

import java.net.InetAddress;

class GetMyIPAddress {

    public static void main(String args[]) throws Exception {
        System.out.println(InetAddress.getLocalHost());
    }
}

 */








