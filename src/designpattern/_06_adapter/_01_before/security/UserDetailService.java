package src.designpattern._06_adapter._01_before.security;

public interface UserDetailService {

	UserDetails loadUser(String username);
}
