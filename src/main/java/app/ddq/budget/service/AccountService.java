package app.ddq.budget.service;

import app.ddq.budget.dto.AccountDto;

import java.util.List;

/**
 * @Author DDQ
 * @Description TO-DO
 * @Date 2021/05/11 21:39
 */
public interface AccountService {

    void insertOne(AccountDto accountDto);

    void insertMany(List<AccountDto> accountList);

    void selectOne(AccountDto condition);

    void selectMany(AccountDto condition);

    void updateOne(AccountDto condition);

    void updateMany(AccountDto condition);

    void deleteOne(AccountDto condition);

    void deleteMany(AccountDto condition);
}
