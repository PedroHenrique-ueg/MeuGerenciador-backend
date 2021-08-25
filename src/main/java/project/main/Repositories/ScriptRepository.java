package project.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.main.Models.ScriptModel;

@Repository
public interface ScriptRepository extends JpaRepository<ScriptModel, Long> {

	ScriptModel findById(long id);
	
}
