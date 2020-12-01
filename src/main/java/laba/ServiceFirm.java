package laba;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "laba.FirmInterface")
public class ServiceFirm implements FirmInterface {
    private ArrayList<Firm> firmArrayList = new ArrayList<>();
    private final static String strYes = "Successfully";
    private final static String strNo = "No Successfully";

    public String addFirm(String month, int profitOfMonth) {
        Firm firm = new Firm();
        firm.setMonth(month);
        firm.setProfitOfMonth(profitOfMonth);
        firmArrayList.add(firm);
        return strYes;
    }

    public String searchByMonth(String month) {
        for (Firm firm : firmArrayList) {
            if (firm.getMonth().equals(month)) {
                return "Month: " + month + " profit for the month: " + firm.getProfitOfMonth();
            }
        }
        return strNo;
    }

    public String searchByProfitOfMonth(int profitOfMonth) {
        for (Firm firm : firmArrayList) {
            if (firm.getProfitOfMonth() == profitOfMonth) {
                return "Month: " + firm.getMonth() + " profit for the month: " + profitOfMonth;
            }
        }
        return strNo;
    }

    public String getAllInformation() {
        String result = "";
        for (Firm firm : firmArrayList) {
            result = result + "Month: " + firm.getMonth() + " profit of month: " + firm.getProfitOfMonth();
        }
        return result;
    }
}
