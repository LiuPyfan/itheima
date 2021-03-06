package com.blueice.mobilelottery.test;

import com.blueice.mobilelottery.bean.User;
import com.blueice.mobilelottery.engine.UserEngine;
import com.blueice.mobilelottery.net.protocal.Message;
import com.blueice.mobilelottery.utils.EngineFactory;

import android.test.AndroidTestCase;
import android.util.Log;

public class EngineTest extends AndroidTestCase {

	public void testUserLogin(){
		
		UserEngine userEngine = EngineFactory.Instance(UserEngine.class);
		User user = new User();
		user.setUserName("qweasd");
		user.setPassWord("123321");
		
		Message message = userEngine.login(user);
		
		Log.i("MyLog", message.getBody().getServiceBodyInsideInfo());
		
		Log.i("MyLog", message.getBody().getOelement().getErrorcode());
		Log.i("MyLog", message.getBody().getOelement().getErrormsg());
		
	}

//	public void testUserLogin(){
//		
//		UserEngineImpl userEngine = new UserEngineImpl();
//		
//		User user = new User();
//		user.setUserName("213213213");
//		user.setPassWord("123321");
//		
//		ServerResponsMessage message = userEngine.login(user);
//		
//		Log.i("MyLog", message.getErrorcode());
//	}
	
}
