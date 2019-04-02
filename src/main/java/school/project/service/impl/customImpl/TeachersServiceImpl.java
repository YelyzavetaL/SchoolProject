package school.project.service.impl.customImpl;

import school.project.dao.customDAO.TeachersDAO;
import school.project.models.custom.Teachers;
import school.project.service.customService.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersServiceImpl implements TeachersService {

    @Autowired
    TeachersDAO teachersDAO;

    @Override
    public void save(Teachers teachers) {
        teachersDAO.save(teachers);
    }

    @Override
    public List<Teachers> findAll() {
        return teachersDAO.findAll();
    }

    @Override
    public Teachers byId(Integer id) {
        return teachersDAO.byId(id);
    }
}
