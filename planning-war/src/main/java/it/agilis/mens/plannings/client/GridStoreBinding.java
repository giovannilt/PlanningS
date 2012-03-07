package it.agilis.mens.plannings.client;

import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.form.DateField;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.NumberField;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.Element;


import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.Store;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.DateField;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.NumberField;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnData;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridCellRenderer;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;
import com.extjs.gxt.ui.client.widget.table.NumberCellRenderer;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.Element;
import com.extjs.gxt.ui.client.widget.form.Radio;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ture
 * Date: 3/3/12
 * Time: 12:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class GridStoreBinding extends LayoutContainer {

    private FormBinding formBindings;

    @SuppressWarnings("rawtypes")
    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        setStyleAttribute("margin", "10px");

        ContentPanel cp = new ContentPanel();

        cp.setHeading("Form Bindings");
        cp.setFrame(true);
        cp.setHeight(500);
        cp.setAutoWidth(true);
        cp.setLayout(new RowLayout(Orientation.HORIZONTAL));

        final Grid<Stock> grid = createGrid();
        grid.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        grid.getSelectionModel().addListener(Events.SelectionChange,
                new Listener<SelectionChangedEvent<Stock>>() {
                    public void handleEvent(SelectionChangedEvent<Stock> be) {
                        if (be.getSelection().size() > 0) {
                            formBindings.bind((ModelData) be.getSelection().get(0));
                        } else {
                            formBindings.unbind();
                        }
                    }
                });
        cp.add(grid, new RowData(.8, 1));

        FormPanel panel = createForm();
        formBindings = new FormBinding(panel, true);
        formBindings.setStore((Store) grid.getStore());

        cp.add(panel, new RowData(.4, 1));

        cp.setButtonAlign(HorizontalAlignment.LEFT);
        cp.addButton(new Button("Reset", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                grid.getStore().rejectChanges();
            }
        }));
        cp.addButton(new Button("Commit", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                grid.getStore().commitChanges();
            }
        }));
        add(cp);
    }

    private FormPanel createForm() {
        FormPanel panel = new FormPanel();
        panel.setHeaderVisible(false);

        panel.setFieldWidth(140);

        TextField<String> week = new TextField<String>();
        week.setName("Week");
        week.setFieldLabel("Week");
        panel.add(week);

        TextField<String> name = new TextField<String>();
        name.setName("OrderNumber");
        name.setFieldLabel("Order nr");
        panel.add(name);

        TextField<String> symbol = new TextField<String>();
        symbol.setName("PONumber");
        symbol.setFieldLabel("PO nr");
        panel.add(symbol);

        NumberField open = new NumberField();
        open.setName("CodeNumber");
        open.setFieldLabel("Code nr");
        panel.add(open);

        TextField<String> model = new TextField<String>();
        model.setName("Model");
        model.setFieldLabel("Model");
        panel.add(model);

        NumberField quantity = new NumberField();
        quantity.setName("Quantity");
        quantity.setFieldLabel("Quantity");
        panel.add(quantity);

        DateField prod = new DateField();
        prod.setName("FinishDate");
        prod.setFieldLabel("Finish");
        panel.add(prod);

        DateField insp = new DateField();
        insp.setName("InspectionDate");
        insp.setFieldLabel("Inspection");
        panel.add(insp);

        DateField load = new DateField();
        load.setName("LoadingDate");
        load.setFieldLabel("Loading");
        panel.add(load);

        DateField ETD = new DateField();
        ETD.setName("ETD");
        ETD.setFieldLabel("ETD");
        panel.add(ETD);

        DateField oldETA = new DateField();
        oldETA.setName("OldETA");
        oldETA.setFieldLabel("OLD ETA");
        panel.add(oldETA);

        DateField newETA = new DateField();
        newETA.setName("NewETA");
        newETA.setFieldLabel("NEW ETA");
        panel.add(newETA);

        DateField reqETA = new DateField();
        reqETA.setName("ReqETA");
        reqETA.setFieldLabel("ETA Req");
        panel.add(reqETA);

        TextField<String> country = new TextField<String>();
        country.setName("Destination");
        country.setFieldLabel("Destination");
        panel.add(country);

        Radio radio = new Radio();
        radio.setBoxLabel("Shipped");
        radio.setValue(true);

        Radio radio2 = new Radio();
        radio2.setBoxLabel("Not Shipped");

        RadioGroup radioGroup = new RadioGroup();
        radioGroup.setFieldLabel("Status");
        radioGroup.add(radio);
        radioGroup.add(radio2);
        panel.add(radioGroup);

        return panel;
    }

    private Grid<Stock> createGrid() {
        final NumberFormat currency = NumberFormat.getCurrencyFormat();
        final NumberFormat number = NumberFormat.getFormat("0.00");
        final NumberCellRenderer<Grid<Stock>> numberRenderer = new NumberCellRenderer<Grid<Stock>>(
                currency);

        GridCellRenderer<Stock> change = new GridCellRenderer<Stock>() {

            public String render(Stock model, String property, ColumnData config, int rowIndex,
                                 int colIndex, ListStore<Stock> store, Grid<Stock> grid) {
                Double val = (Double) model.get(property);
                if (val == null) {
                    val = 0d;
                }
                String style = val < 0 ? "red" : "green";
                return "<span style='color:" + style + "'>" + number.format(val) + "</span>";
            }
        };

        GridCellRenderer<Stock> gridNumber = new GridCellRenderer<Stock>() {
            public String render(Stock model, String property, ColumnData config, int rowIndex,
                                 int colIndex, ListStore<Stock> store, Grid<Stock> grid) {
                return numberRenderer.render(null, property, model.get(property));
            }
        };

        List<ColumnConfig> configs = new ArrayList<ColumnConfig>();

        ColumnConfig column = new ColumnConfig();
        column.setId("week");
        column.setHeader("Week");
        column.setWidth(55);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("orderNumber");
        column.setHeader("Order Number");
        column.setWidth(85);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("PONumber");
        column.setHeader("PO Number");
        column.setWidth(75);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("CodeNumber");
        column.setHeader("Code Number");
        column.setWidth(75);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("Model");
        column.setHeader("Model");
        column.setWidth(75);
        configs.add(column);


        column = new ColumnConfig();
        column.setId("Quantity");
        column.setHeader("Quantity");
        column.setWidth(75);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("ContainerID");
        column.setHeader("Container ID");
        column.setWidth(75);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("ContainerType");
        column.setHeader("Type");
        column.setWidth(55);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("FinishDate");
        column.setHeader("Finish Date");
        column.setWidth(85);
        column.setRenderer(change);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("Inspection Date");
        column.setHeader("Inspection");
        column.setWidth(75);
        column.setRenderer(change);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("LoadingDate");
        column.setHeader("Loading");
        column.setWidth(75);
        column.setRenderer(change);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("ETD");
        column.setHeader("ETD");
        column.setWidth(75);
        column.setRenderer(change);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("OldETA");
        column.setHeader("OLD ETA");
        column.setWidth(75);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("NewETA");
        column.setHeader("NEW ETA");
        column.setWidth(75);
        column.setRenderer(change);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("ETARequested");
        column.setHeader("ETA Requested");
        column.setWidth(75);
        column.setDateTimeFormat(DateTimeFormat.getFormat("MM/dd/yyyy"));
        configs.add(column);

        column = new ColumnConfig();
        column.setId("DestCountry");
        column.setHeader("Dest Country");
        column.setWidth(75);
        configs.add(column);

        ListStore<Stock> store = new ListStore<Stock>();
        store.setMonitorChanges(true);
        store.add(TestData.getStocks());

        ColumnModel cm = new ColumnModel(configs);

        Grid<Stock> grid = new Grid<Stock>(store, cm);
        grid.getView().setEmptyText("sdfd");
        grid.setBorders(false);
        grid.setBorders(true);

        return grid;
    }
}