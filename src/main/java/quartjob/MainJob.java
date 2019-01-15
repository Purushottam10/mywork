package quartjob;

import org.quartz.*;

import java.util.Date;

public class MainJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date date=new Date();

        System.out.println(date+"    this method is quartz ");
    }

}
