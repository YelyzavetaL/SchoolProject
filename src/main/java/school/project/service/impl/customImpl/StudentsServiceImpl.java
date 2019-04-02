package school.project.service.impl.customImpl;


import school.project.dao.customDAO.StudentsDAO;
import school.project.models.custom.Students;
import school.project.models.functional.Classes;
import school.project.service.customService.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService{

    @Autowired
    StudentsDAO studentsDAO;

    @Override
    public void save(Students students) {
        studentsDAO.save(students);
    }

    @Override
    public List<Students> findAll() {
        return studentsDAO.findAll();
    }

    @Override
    public Students byId(Integer id) {
        return studentsDAO.byId(id);
    }

    @Override
    public List<Students> byClassId(Integer id) {
        return studentsDAO.byClassId(id);
    }


}
