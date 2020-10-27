package be.argeus.multimodule.repository;

import be.argeus.multimodule.domain.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByNumber(String number);

}
