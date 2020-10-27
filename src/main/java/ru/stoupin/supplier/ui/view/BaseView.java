package ru.stoupin.supplier.ui.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;

//Override base layout theme. All generic views have specific style
//@HtmlImport("frontend://styles/general-styles13.html")

public class BaseView extends VerticalLayout implements RouterLayout{
	private static final Log log = LogFactory.getLog(BaseView.class); 
		

	
	public BaseView() {
		log.info("BaseView started");

    }

}
