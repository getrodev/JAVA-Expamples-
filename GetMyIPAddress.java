// This program will get the IP Address

import java.net.InetAddress;

class GetMyIPAddress {
    public static void main(String args[]) throws Exception  {
        /* public static InetAddress getLocalHost()
         * throws UnknownHostException: Returns the address
         * of teh local host. This is achieved by retrieving
         * teh name of teh host from the system, then resolving
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