package security.assign4.four;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
     Repository repo;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

       Optional<Model> model =Optional.of(repo.findByUserName(s));
       model.orElseThrow(()-> new UsernameNotFoundException("Not found"));

        UserDetails ud = model.map(MyUserDetails::new).get();
        return ud;

    }
}


