package quartjob;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

public class JobSchedular {
    public void jobStrater() {
        JobDetail jobDetail=JobBuilder.newJob(MainJob.class).build();

        Trigger trigger=TriggerBuilder.newTrigger().withIdentity("cornTrigger")
                .withSchedule(CronScheduleBuilder. cronSchedule("0 0/1 * 1/1 * ? *")).build();
 try{   Scheduler scheduler=StdSchedulerFactory.getDefaultScheduler();
   scheduler.start();
   scheduler.scheduleJob(jobDetail,trigger);
 } catch (SchedulerException ex) {
     System.out.println(ex);
 }

    }
}
