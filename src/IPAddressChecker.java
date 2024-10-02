import java.net.InetAddress;
        import java.net.UnknownHostException;
        import java.net.Inet4Address;
        import java.net.Inet6Address;

public class IPAddressChecker {
    public static void main(String[] args) {
        // Example IP address to check
        String ipAddress = "2001:db8::ff00:42:8329";  // Replace with your IP address
        // Check if the address is IPv4 or IPv6
        String result = checkIPVersion(ipAddress);
        System.out.println(result);
    }
    public static String checkIPVersion(String ipAddress) {
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            // Check if it's an instance of IPv4 or IPv6
            if (inetAddress instanceof Inet4Address) {
                return ipAddress + " belongs to IPv4 block.";
            } else if (inetAddress instanceof Inet6Address) {
                return ipAddress + " belongs to IPv6 block.";
            } else {
                return ipAddress + " is neither IPv4 nor IPv6.";
            }
        } catch (UnknownHostException e) {
            return "Invalid IP address: " + ipAddress;
        }
    }
}
