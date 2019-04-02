package school.project.dao.customDAO;

import school.project.models.custom.Classteachers;
import school.project.models.custom.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassteachersDAO extends JpaRepository<Classteachers, Integer>{
    @Override
    List<Classteachers>   findAll();



    @Query("select c from Classteachers c where c.id = :xxx")
    Classteachers byId(@Param("xxx") Integer id);
}
