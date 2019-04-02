package school.project.service.impl.customImpl;

import school.project.dao.customDAO.DeputyDAO;
import school.project.models.custom.Deputy;
import school.project.models.custom.Teachers;
import school.project.service.customService.DeputyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeputyServiceImpl implements DeputyService{

    @Autowired
    DeputyDAO deputyDAO;

    @Override
    public void save(Deputy deputy){
        deputyDAO.save(deputy);
    }

    @Override
    public List<Deputy> findAll() {
        return deputyDAO.findAll();
    }

    @Override
    public Deputy byId(Integer id) {
        return deputyDAO.byId(id);
    }
}
