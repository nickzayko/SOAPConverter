package converter.webService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService (endpointInterface = "converter.webService.UnitConversion")
public class UnitConversionImpl implements UnitConversion {
    @Override
    public double m2cm(double meter) {
        return meter*100;
    }

    @Override
    public double cm2m(double cm) {
        return cm/100;
    }

    @Override
    public double km2m(double kilometer) {
        return kilometer*1000;
    }

    @Override
    public double m2km(double meter) {
        return meter/1000;
    }
}
