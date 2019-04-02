package school.project.service.impl;


import school.project.dao.UserDAO;
import school.project.models.User;
import school.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import java.lang.String;

//change

//change

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserDAO userDAO;

////gbgg
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDAO.findByUsername(s);
    }

    @Override
    public User byId(Integer id) {
        return userDAO.byId(id);
    }

    @Override
    public User findAll() {
        return null;
    }


}
