package be.argeus.multimodule.service.impl;

import be.argeus.multimodule.domain.entity.Account;
import be.argeus.multimodule.repository.AccountRepository;
import be.argeus.multimodule.service.api.AccountNotFoundException;
import be.argeus.multimodule.service.api.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Value("${dummy.type}")
    private String dummyType;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findOne(String number) throws AccountNotFoundException {
        if (number.equals("0000")) {
            throw new AccountNotFoundException("0000");
        }

        Account account = accountRepository.findByNumber(number);
        if (account == null) {
            account = createAccountByNumber(number);
        }

        return account;
    }

    @Override
    public Account createAccountByNumber(String number) {
        Account account = new Account();
        account.setNumber(number);
        return accountRepository.save(account);
    }

    public String getDummyType() {
        return dummyType;
    }

    public void setDummyType(String dummyType) {
        this.dummyType = dummyType;
    }

}
