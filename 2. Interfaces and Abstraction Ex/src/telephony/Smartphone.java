package telephony;

/**
 * Created by Sim0o on 3/14/2017.
 */
public class Smartphone implements Phone {
    @Override
    public String call(String phoneNumber) {
        return String.format("Calling... %s", phoneNumber);
    }

    @Override
    public String browse(String url) {
        return String.format("Browsing: %s!", url);
    }

    @Override
    public String callNumber(String phone) {
        return call(phone);
    }

    @Override
    public String browsePage(String page) {
        return browse(page);
    }
}
