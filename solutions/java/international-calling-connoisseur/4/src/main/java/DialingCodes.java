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
        if (!dialingCodeMap.containsValue(country)) dialingCodeMap.putIfAbsent(code, country);
    }

    public Integer findDialingCode(String country) {
        return dialingCodeMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(country))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer existingCode = findDialingCode(country);
        if (existingCode != null) {
            dialingCodeMap.remove(existingCode);
            addNewDialingCode(code, country);
        }
    }

}
