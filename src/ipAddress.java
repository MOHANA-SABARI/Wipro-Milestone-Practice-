import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ipAddress {
    public static void main(String[] args) {
        // Change IP address, subnet mask, default gateway, and DNS server
        changeIPAddress("Ethernet", "192.168.1.100", "255.255.255.0", "192.168.1.1", "8.8.8.8");
    }

    public static void changeIPAddress(String networkAdapter, String ipAddress, String subnetMask, String gateway, String dnsServer) {
        try {
            // Execute the netsh command to change IP settings
            String command = "netsh interface ip set address name=\"" + networkAdapter + "\" static " + ipAddress + " " + subnetMask + " " + gateway;
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();

            // Execute the netsh command to set DNS server
            command = "netsh interface ip set dns name=\"" + networkAdapter + "\" static " + dnsServer;
            process = Runtime.getRuntime().exec(command);
            process.waitFor();

            // Display success message
            System.out.println("IP address changed successfully.");
        } catch (IOException | InterruptedException e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }
}
