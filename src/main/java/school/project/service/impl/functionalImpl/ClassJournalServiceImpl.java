package school.project.service.impl.functionalImpl;

import school.project.dao.functionalDAO.ClassJournalDAO;
import school.project.models.functional.ClassJournal;
import school.project.service.functionalService.ClassJournalService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassJournalServiceImpl implements ClassJournalService {
    @Autowired
    ClassJournalDAO classJournalDAO;

    @Override
    public void save(ClassJournal classJournal) {
        classJournalDAO.save(classJournal);
    }
}
