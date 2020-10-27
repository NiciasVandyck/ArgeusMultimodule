package be.argeus.multimodule.service.api;

import be.argeus.multimodule.domain.entity.Account;

public interface AccountService {

    Account findOne(String number) throws AccountNotFoundException;

    Account createAccountByNumber(String number);
}
