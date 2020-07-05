package com.xuxueli.executor.sample.frameless.jobhandler;

import java.util.concurrent.TimeUnit;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.log.XxlJobLogger;

public class SendMessageJobHandler extends IJobHandler {


	@Override
	public ReturnT<String> execute(String param) throws Exception {
		XxlJobLogger.log("我是传统java web项目 IDEA，即将进行短信发送---");

		for (int i = 0; i < 5; i++) {
			XxlJobLogger.log("beat at:" + i);
			TimeUnit.SECONDS.sleep(2);
		}
		return SUCCESS;
	}

}
