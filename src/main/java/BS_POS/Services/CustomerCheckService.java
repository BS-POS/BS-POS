package BS_POS.Services;

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
}
