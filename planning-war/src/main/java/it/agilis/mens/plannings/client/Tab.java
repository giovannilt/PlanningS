package it.agilis.mens.plannings.client;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.LayoutData;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;

public class Tab extends LayoutContainer {

    @Override
    protected void onRender(Element parent, int pos) {
        super.onRender(parent, pos);
        VerticalPanel vp = new VerticalPanel();
        vp.setSpacing(10);

        TabPanel folder = new TabPanel();
        folder.setWidth(1250);
        folder.setHeight(550);

        TabItem tab1 = new TabItem("Short Text");
        tab1.add(new GridStoreBinding());
        folder.add(tab1);

        TabItem tab2 = new TabItem("Long Text");
        tab2.add(new GridStoreBinding());
        folder.add(tab2);

        vp.add(folder);
        add(vp);
    }

}