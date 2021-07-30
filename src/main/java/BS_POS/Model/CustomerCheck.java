package BS_POS.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String tableNumber;
    @OneToMany
    private Set<Item> itemLog;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Set<Item> getItemLog() {
        return itemLog;
    }

    public void setItemLog(Set<Item> itemLog) {
        this.itemLog = itemLog;
    }
}
