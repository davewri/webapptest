package ie.dublin.webapptest.dao;

import ie.dublin.webapptest.model.JobTitle;

import java.util.List;

public interface JobTitleDao {
    // Return a list containing all the job title objects
    public List<JobTitle> findAll();

    // Return a job title with matching id
    public JobTitle findById(int id);
}
