package src.designpattern._06_adapter._02_after.security;

public interface UserDetailService {

	UserDetails loadUser(String username);
}
