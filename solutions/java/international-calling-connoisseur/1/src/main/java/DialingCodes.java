import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> dialingCodeMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodeMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodeMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodeMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!containsCodeOrCountry(code, country)) setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        if (!dialingCodeMap.containsValue(country)) return null;
        for (Map.Entry<Integer, String> entry : dialingCodeMap.entrySet()) {
            if (entry.getValue().equals(country)) return entry.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (containsCodeOrCountry(code, country)) {
            dialingCodeMap.remove(findDialingCode(country));
            addNewDialingCode(code, country);
        }
    }

    private boolean containsCodeOrCountry(Integer code, String country) {
        return dialingCodeMap.containsKey(code) || dialingCodeMap.containsValue(country);
    }

}
