package BS_POS.Services;

import BS_POS.Model.CustomerCheck;
import BS_POS.Repositories.CustomerCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCheckService {
    private final CustomerCheckRepository customerCheckRepository;

    @Autowired
    public CustomerCheckService(CustomerCheckRepository customerCheckRepository) {
        this.customerCheckRepository = customerCheckRepository;
    }

    public Iterable<CustomerCheck> indexAllCustomerChecks() {
        return customerCheckRepository.findAll();
    }

    public CustomerCheck showCustomerCheck(Long id) {
        return customerCheckRepository.findById(id).get();
    }

    public CustomerCheck createCustomerCheck(CustomerCheck newCheck) {
        return customerCheckRepository.save(newCheck);
    }

    public Boolean deleteCustomerCheck (CustomerCheck customerCheck) {
        customerCheckRepository.delete(customerCheck);
        return true;
    }

    //the calculatedCheckTotalMethod should calculate the total number of the items
    // and save it to the current checkTotal field.
    //First we need to make sure the itemCost the method is looking for has already
    // the modifier cost into consideration.
    public Double calculateCheckTotal (CustomerCheck customerCheck){
        Double tabSum = 0.0;
        return tabSum;
    }

}
