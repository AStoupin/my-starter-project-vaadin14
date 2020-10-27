package ru.stoupin.supplier.ui.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.Tabs.Orientation;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;
import com.vaadin.flow.theme.lumo.Lumo;

@Theme(value = Material.class, variant = Material.DARK)
//@Theme(value=Lumo.class, variant=Lumo.DARK) 
//@CssImport(value = "./styles/shared-styles.css") 14+npm
//@CssImport(value = "./styles/app-layout-custom.css",  themeFor = "vaadin-app-layout") 14+npm
@HtmlImport("frontend://styles/app-layout-custom13.html")
@HtmlImport("frontend://styles/general-styles13.html")

@PWA(name = "X-Factor Supplier Starter Kit", shortName = "X-Factor Supplier")
public class MainLayout extends AppLayout {
	private static final Log log = LogFactory.getLog(MainLayout.class);

	MainLayout() {

		setPrimarySection(AppLayout.Section.NAVBAR);
		HorizontalLayout leftLayout = new HorizontalLayout();
		leftLayout.setClassName("leftLayout");
		
		Image img = new Image("/icons/logo.png", "X-Factor Logo");
		img.setHeight("44px");
		 
		final DrawerToggle drawerToggle = new DrawerToggle();
		Tabs tabs = new Tabs();
		leftLayout.add(drawerToggle, img);
		
		
		tabs.add(new Tab(new RouterLink("PayloadListView", PayloadListView.class)));
		tabs.add(new Tab(new RouterLink("Dictionary xxx", DictionaryView.class, new String("xxx"))));
		tabs.add(new Tab(new RouterLink("Dictionary yyy", DictionaryView.class, new String("yyy"))));
		tabs.add(new Tab(new RouterLink("CarList", CarList.class)));		
		
		
		tabs.setOrientation(Orientation.HORIZONTAL);

		addToNavbar(leftLayout,  tabs);
		


		setDrawerOpened(false);

	}


}
