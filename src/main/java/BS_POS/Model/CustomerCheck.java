package BS_POS.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class CustomerCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serverName;
    private String checkName;
    private Date timeStamp;
    private String tableNumber;
    private Double checkTotal;
    private String paymentMethod;
    private String lastFourCardDigits;
    @OneToMany
    private Set<Item> itemLog;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Double getCheckTotal() {
        return checkTotal;
    }

    public void setCheckTotal(Double checkTotal) {
        this.checkTotal = checkTotal;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getLastFourCardDigits() {
        return lastFourCardDigits;
    }

    public void setLastFourCardDigits(String lastFourCardDigits) {
        this.lastFourCardDigits = lastFourCardDigits;
    }

    public Set<Item> getItemLog() {
        return itemLog;
    }

    public void setItemLog(Set<Item> itemLog) {
        this.itemLog = itemLog;
    }
}
