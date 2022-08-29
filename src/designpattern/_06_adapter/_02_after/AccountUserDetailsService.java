package src.designpattern._06_adapter._02_after;

import src.designpattern._06_adapter._02_after.security.UserDetailService;
import src.designpattern._06_adapter._02_after.security.UserDetails;

public class AccountUserDetailsService implements UserDetailService {

	private AccountService accountService;

	public AccountUserDetailsService(AccountService accountService) {
		this.accountService = accountService;
	}

	@Override
	public UserDetails loadUser(String username) {
		return new AccountUserDetails(accountService.findAccountByUsername(username));
	}
}
