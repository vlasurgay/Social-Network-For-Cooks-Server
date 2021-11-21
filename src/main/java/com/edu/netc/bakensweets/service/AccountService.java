package com.edu.netc.bakensweets.service;

import com.edu.netc.bakensweets.dto.AccountDTO;
import com.edu.netc.bakensweets.dto.UpdateAccountDTO;
import com.edu.netc.bakensweets.model.Account;

public interface AccountService {
    String signIn(String email, String password);
    String signUp(AccountDTO accountDTO);
    UpdateAccountDTO updateProfile(UpdateAccountDTO accountDTO, String username);
    String changePassword(String oldPassword,String newPassword,String username);
    Account getByEmail(String email);
}
