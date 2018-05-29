import java.util.Scanner;

public class ParseURL_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("://");
        if (input.length > 2 || input.length == 1) {

            System.out.println("Invalid URL");
            return;
        }
        String url = input[0];
        String server = input[1].substring(0, input[1].indexOf('/'));
        String resources = input[1].substring(server.length() + 1, input[1].length());

        System.out.println("Protocol = " + url);
        System.out.println("Server = " + server);
        System.out.println("Resources = " + resources);
    }

}