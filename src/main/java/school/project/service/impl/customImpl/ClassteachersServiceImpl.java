package school.project.service.impl.customImpl;

import school.project.dao.customDAO.ClassteachersDAO;
import school.project.models.custom.Classteachers;
import school.project.service.customService.ClassteachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassteachersServiceImpl implements ClassteachersService{

    @Autowired
    ClassteachersDAO classteachersDAO;

    @Override
    public void save(Classteachers classteachers){
        classteachersDAO.save(classteachers);
    }

    @Override
    public List<Classteachers> findAll() {
        return classteachersDAO.findAll();
    }

    @Override
    public Classteachers byId(Integer id) {
        return classteachersDAO.byId(id);
    }
}
