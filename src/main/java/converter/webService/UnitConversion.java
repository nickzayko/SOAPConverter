package converter.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UnitConversion {
    @WebMethod double m2cm (double meter);
    @WebMethod double cm2m (double cm);
    @WebMethod double km2m (double kilometer);
    @WebMethod double m2km (double meter);
}
