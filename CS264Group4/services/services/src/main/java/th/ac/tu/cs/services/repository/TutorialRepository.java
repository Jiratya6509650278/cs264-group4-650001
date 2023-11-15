package th.ac.tu.cs.services.repository;
import java.util.List;

import th.ac.tu.cs.services.model.Tutorial;

public interface TutorialRepository {
    int save(Tutorial tu);

    Tutorial findById(String id);

    List<Tutorial> findAll();

    int deleteAll();

    int update(Tutorial tu);

}