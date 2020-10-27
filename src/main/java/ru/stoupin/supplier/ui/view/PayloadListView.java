package ru.stoupin.supplier.ui.view;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;



@PageTitle("Payload list")
@Route(value = "", layout = MainLayout.class)
public class PayloadListView extends BaseView implements RouterLayout {
	private static final Log log = LogFactory.getLog(PayloadListView.class); 
	
	
	private TextField stateFilter;

	
	public PayloadListView() {
		log.info("PayloadList started");
		stateFilter = new TextField("Payload");
		add(stateFilter);
	}

	
}
