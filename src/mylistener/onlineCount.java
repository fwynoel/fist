package mylistener;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class onlineCount implements HttpSessionListener {
	private static int count=0;
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
		arg0.getSession().setAttribute("userNum", ++count);
		System.out.println(df.format(new Date())+"µÇÂ¼£¡"+ count );
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		arg0.getSession().setAttribute("userNum", --count);
		System.out.println(df.format(new Date())+"×¢Ïú!"+ count);

	}

}
