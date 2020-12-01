package laba;

import javax.xml.ws.Endpoint;

public class FirmPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7779/ws/hello", new ServiceFirm());
    }
}
