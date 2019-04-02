package school.project.dao.customDAO;

import school.project.models.custom.Deputy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeputyDAO extends JpaRepository<Deputy, Integer>{
    @Override
    List<Deputy> findAll();

    @Query("select c from Deputy c where c.id = :xxx")
    Deputy byId(@Param("xxx") Integer id);
}
