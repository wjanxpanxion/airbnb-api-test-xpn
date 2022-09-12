
package clients.currency.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("localized_full_name")
    @Expose
    private String localizedFullName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("unicode_symbol")
    @Expose
    private String unicodeSymbol;
    @SerializedName("is_eligible_for_guest")
    @Expose
    private Boolean isEligibleForGuest;
    @SerializedName("is_eligible_for_lys")
    @Expose
    private Boolean isEligibleForLys;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalizedFullName() {
        return localizedFullName;
    }

    public void setLocalizedFullName(String localizedFullName) {
        this.localizedFullName = localizedFullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getUnicodeSymbol() {
        return unicodeSymbol;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "code='" + code + '\'' +
                ", id='" + id + '\'' +
                ", localizedFullName='" + localizedFullName + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", unicodeSymbol='" + unicodeSymbol + '\'' +
                ", isEligibleForGuest=" + isEligibleForGuest +
                ", isEligibleForLys=" + isEligibleForLys +
                '}';
    }

    public void setUnicodeSymbol(String unicodeSymbol) {
        this.unicodeSymbol = unicodeSymbol;
    }

    public Boolean getIsEligibleForGuest() {
        return isEligibleForGuest;
    }

    public void setIsEligibleForGuest(Boolean isEligibleForGuest) {
        this.isEligibleForGuest = isEligibleForGuest;
    }

    public Boolean getIsEligibleForLys() {
        return isEligibleForLys;
    }

    public void setIsEligibleForLys(Boolean isEligibleForLys) {
        this.isEligibleForLys = isEligibleForLys;
    }

}
