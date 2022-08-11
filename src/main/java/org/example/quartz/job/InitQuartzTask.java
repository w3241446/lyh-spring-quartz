package org.example.quartz.job;

import org.quartz.Scheduler;

public class InitQuartzTask {

    private Scheduler schedulerFactoryBean;

    public void setSchedulerFactoryBean(Scheduler schedulerFactoryBean) {
        this.schedulerFactoryBean = schedulerFactoryBean;
    }

    private void initTask() {
        System.out.println("来开始定时任务吧");
    }

}
