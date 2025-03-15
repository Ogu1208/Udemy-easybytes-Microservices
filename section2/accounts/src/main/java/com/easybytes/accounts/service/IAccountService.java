package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto - customerDtoObject
     */
    void createAccount(CustomerDto customerDto);
}
