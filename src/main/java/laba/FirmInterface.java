package laba;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface FirmInterface {
    @WebMethod String addFirm(String month, int profitOfMonth);
    @WebMethod String searchByMonth(String month);
    @WebMethod String searchByProfitOfMonth(int profitOfMonth);
    @WebMethod String getAllInformation();
}
