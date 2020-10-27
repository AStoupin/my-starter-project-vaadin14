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
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;



@PageTitle("Dictionary")
@Route(value = "dic", layout = MainLayout.class)
public class DictionaryView extends BaseView implements RouterLayout, HasUrlParameter<String>  {
	private static final Log log = LogFactory.getLog(DictionaryView.class); 
	
	
	private TextField stateFilter;
	
	public DictionaryView() {
		log.info("DictionaryView started");
		stateFilter = new TextField("Dictionary");
		add(stateFilter);
	}
	
    @Override
    public void setParameter(BeforeEvent event,
            @OptionalParameter String parameter) {
        if (parameter == null) {
        	log.info("no params");
        } else {
        	log.info("Has param" +parameter );
        	stateFilter.setLabel("Dictionary " + parameter );
        }
    }
	
}
