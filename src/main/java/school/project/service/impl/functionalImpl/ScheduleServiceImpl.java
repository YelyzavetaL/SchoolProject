package school.project.service.impl.functionalImpl;

import school.project.dao.functionalDAO.ScheduleDAO;
import school.project.models.custom.Schedule;
import school.project.service.functionalService.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleDAO scheduleDAO;

    @Override
    public void save(Schedule schedule) {

    }

    @Override
    public void delete(Schedule schedule) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Schedule> findAll() {
        return null;
    }

    @Override
    public Schedule byId(Integer id) {
        return null;
    }

    @Override
    public Integer maxById() {
        return null;
    }

    @Override
    public Schedule byName(String name) {
        return null;
    }
}
