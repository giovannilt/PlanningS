package it.agilis.mens.plannings.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


public class Application
        implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        final Label label = new Label("gwt-maven-plugin Archetype :: Project org.codehaus.mojo.gwt-maven-plugin");
        RootPanel.get().add(label);
    }
}
