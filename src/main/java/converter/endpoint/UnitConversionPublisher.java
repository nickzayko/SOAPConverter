package converter.endpoint;

import converter.webService.UnitConversionImpl;

import javax.xml.ws.Endpoint;

public class UnitConversionPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws", new UnitConversionImpl());
    }
}
