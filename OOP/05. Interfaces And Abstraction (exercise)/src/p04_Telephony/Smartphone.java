package p04_Telephony;



public class Smartphone implements Browsing,Calling {

    public Smartphone() {
    }


    @Override
    public String browse(String url) {
        if (url.matches(".*\\d.*")){
            return "Invalid URL!";
        }
        return String.format("Browsing: %s!",url);
    }

    @Override
    public String call(String phoneNumber) {
        if (!phoneNumber.matches("\\d+")){
            return "Invalid number!";
        }
        return String.format("Calling... %s",phoneNumber);
    }
}
