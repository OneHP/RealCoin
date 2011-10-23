package uk.co.onehp.btcirl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller("irlController")
@Configurable(preConstruction=true)
public class IrlControllerImpl implements IrlController{

	@Autowired
	Store store;

	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModelAndView modelAndView = new ModelAndView("irl.jsp");
		modelAndView.addObject("transactions", this.store.getTransactions());
		return modelAndView;
	}
}
