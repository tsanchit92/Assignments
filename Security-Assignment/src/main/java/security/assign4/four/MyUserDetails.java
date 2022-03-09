package security.assign4.four;

import java.util.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class MyUserDetails implements UserDetails {

	private String userName;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;
	private boolean accountNonLocked;
	private int failedAttemp;
	private Date locktime;
	
	public MyUserDetails()
	{
		
	}

	public MyUserDetails(Model model) {
		this.userName = model.getUserName();
		this.password = model.getPassword();
		this.active = model.isActive();
		this.authorities = Arrays.stream(model.getRoles().split(",")).map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
		this.accountNonLocked = model.isAccountNonLocked();
		this.failedAttemp = model.getFailedAttemp();
		this.locktime = model.getLocktime();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return active;
	}

	public int getFailedAttemp() {
		return failedAttemp;
	}

	public Date getLocktime() {
		return locktime;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
