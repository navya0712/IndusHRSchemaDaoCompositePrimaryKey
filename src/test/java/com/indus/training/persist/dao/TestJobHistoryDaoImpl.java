package com.indus.training.persist.dao;

import java.sql.Date;

import com.indus.training.persist.impl.JobHistoryDaoImpl;
import com.indus.training.persist.entity.JobHistory;
import com.indus.training.persist.entity.JobHistoryId;
import com.indus.training.persist.exceptions.JobHistoryDaoException;
import junit.framework.TestCase;

public class TestJobHistoryDaoImpl extends TestCase {

	private JobHistoryDaoImpl jobHistoryDaoImplObj;

	@Override
	protected void setUp() throws Exception {
		jobHistoryDaoImplObj=new JobHistoryDaoImpl();
	}

	@Override
	protected void tearDown() throws Exception {
		jobHistoryDaoImplObj=null;
	}

	// Test case for inserting job history
	public void testInsertJobHistory() {
        try {
            // Create a new JobHistory object
            JobHistory jobHistory = new JobHistory();
            JobHistoryId id = new JobHistoryId();
            id.setEmployeeId(1001);
            id.setStartDate(Date.valueOf("2021-10-11"));
            id.setEndDate(Date.valueOf("2022-10-11"));
            jobHistory.setId(id);
            jobHistory.setJobId("101");
            jobHistory.setDepartmentId(null);

            // Attempt to insert the JobHistory object
            Boolean isInserted = jobHistoryDaoImplObj.insertJobHistory(jobHistory);
            assertTrue("Job history should be inserted", isInserted.booleanValue());

            // Fetch the JobHistory object to confirm insertion
            JobHistory fetchedJobHistory = jobHistoryDaoImplObj.fetchJobHistoryById(id);
            assertNotNull("Job history should be found", fetchedJobHistory);
            assertEquals("Job ID should match", "101", fetchedJobHistory.getJobId());
            assertEquals("Department ID should match", null, fetchedJobHistory.getDepartmentId());
        } catch (JobHistoryDaoException e) {
            // Print the exception and fail the test with a message
            fail("An exception occurred: " + e.getMessage());
        }
    }

}