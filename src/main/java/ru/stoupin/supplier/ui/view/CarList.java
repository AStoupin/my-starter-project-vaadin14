package ru.stoupin.supplier.ui.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;

import ru.stoupin.supplier.domain.Car;
import ru.stoupin.supplier.service.CarService;


@PageTitle("Car List")
@Route(value = "cars", layout = MainLayout.class)
public class CarList extends  BaseView  implements RouterLayout{
	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(CarList.class); 


	private Grid<Car> crudGrid ;

	
	private CarService carService;

	@Autowired
	public CarList(CarService carService) {
		log.info("RepaymentItemList started");
		
		this.carService = carService;

		Label caption = new Label();
		caption.setText("Cars");
		caption.addClassName("splitter");

		crudGrid = new Grid<Car>(Car.class);
	
		
		crudGrid.setItems(carService.getCars());
		

		
		crudGrid.setColumns("vin", "model");
		
		add(crudGrid);
		crudGrid.setSizeFull();
		setHeightFull();
	}

	

	public void reloadList() {

		
		crudGrid.setItems(carService.getCars());
		

		
	}




	
}
