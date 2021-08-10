package BS_POS.Controllers;

import BS_POS.Model.CustomerCheck;
import BS_POS.Services.CustomerCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class CustomerCheckController {

    private final CustomerCheckService customerCheckService;

    @Autowired
    public CustomerCheckController(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @PostMapping("/customerCheck")
    public ResponseEntity<CustomerCheck> create(CustomerCheck customerCheck) {
        return new ResponseEntity<>(customerCheckService.createCustomerCheck(customerCheck), HttpStatus.CREATED);
    }

    @DeleteMapping("/customerCheck/delete/")
    public Boolean delete(CustomerCheck customerCheck) {
        return customerCheckService.deleteCustomerCheck(customerCheck);
    }

    //Still need to create a method to update an already existing customerCheck.
//    @PutMapping("/customerCheck/{id}")
//    public CustomerCheck update(@PathVariable Long id, CustomerCheck customerCheck) {
//        return customerCheckService.updateCheck(id, customerCheck);
//    }

}
