package converter.client;

import converter.webService.UnitConversion;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:8080/ws?wsdl");

        QName qName = new QName("http://webService.converter/", "UnitConversionImplService");

        Service service = Service.create(url, qName);

        UnitConversion conversion = service.getPort(UnitConversion.class);

        System.out.println("5 km = " + conversion.km2m(5) + " meters");
        System.out.println("1 cm = " + conversion.cm2m(1) + " meters");
        System.out.println("3 m = " + conversion.m2km(3) + " kilometers");
    }
}
