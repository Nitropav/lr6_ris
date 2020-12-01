package laba;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FirmClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
        QName qname = new QName("http://lab6/", "FirmImplService");
        Service service = Service.create(url, qname);
        FirmInterface firmInterface = service.getPort(FirmInterface.class);
        Scanner scanner = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.println("1 - add new firm");
            System.out.println("2 - search by month");
            System.out.println("3 - search by profit for the month");
            System.out.println("4 - get all information");
            choice = scanner.nextLine();
            if (choice.equals("1")) {
                String month;
                int profitOfMonth;
                System.out.println("Enter month: ");
                month = scanner.nextLine();
                System.out.println("Please enter price");
                profitOfMonth = Integer.parseInt(scanner.nextLine());
                System.out.println(firmInterface.addFirm(month, profitOfMonth));
            } else if (choice.equals("2")) {
                String month;
                System.out.println("Enter month:");
                month = scanner.nextLine();
                System.out.println(firmInterface.searchByMonth(month));
            } else if (choice.equals("3")) {
                int profitOfMonth;
                System.out.println("Enter profit for the month");
                profitOfMonth = Integer.parseInt(scanner.nextLine());
                System.out.println(firmInterface.searchByProfitOfMonth(profitOfMonth));

            } else if (choice.equals("4")) {
                System.out.println(firmInterface.getAllInformation());
            }
        }
    }
}
