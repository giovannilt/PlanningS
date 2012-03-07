package it.agilis.mens.plannings.core.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Ture
 * Date: 2/29/12
 * Time: 12:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class OrderLine implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String Week;
    private String SupplierName;
    private Long SupplierID;
    private String InvoiceCompany;
    private String Structure;
    private String OrderNumber;
    private String PONumber;
    private String ProductLine;
    private String CodeNumber;              
    private String Model;
    private Integer Quantity;
    private String ContainerNumber;
    private String Status;
    private String ProductionFinishDate;
    private String InspectionDate;
    private String LoadingDate;
    private String ETD;
    private String ETAConfirmed_Old;
    private String ETAConfirmed_New;
    private String ETARequested;
    private Integer Variance;
    private String CountryDestination;
    private String PortDestination;
    private String FinalDestination;


    public String getWeek() {
        return Week;
    }

    public void setWeek(String week) {
        this.Week = week;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        this.SupplierName = supplierName;
    }

    public Long getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Long supplierID) {
        this.SupplierID = SupplierID;
    }

    public String getInvoiceCompany() {
        return InvoiceCompany;
    }

    public void setInvoiceCompany(String invoiceCompany) {
        this.InvoiceCompany = invoiceCompany;
    }

    public String getStructure() {
        return Structure;
    }

    public void setStructure(String structure) {
        this.Structure = structure;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.OrderNumber = orderNumber;
    }

    public String getPONumber() {
        return PONumber;
    }

    public void setPONumber(String PONumber) {
        this.PONumber = PONumber;
    }

    public String getProductLine() {
        return ProductLine;
    }

    public void setProductLine(String productLine) {
        this.ProductLine = productLine;
    }

    public String getCodeNumber() {
        return CodeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.CodeNumber = codeNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = Model;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity (Integer quantity) {
        this.Quantity = quantity;
    }

    public String getContainerNumber() {
        return ContainerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.ContainerNumber = containerNumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getProductionFinishDate() {
        return ProductionFinishDate;
    }

    public void setProductionFinishDate(String productionFinishDate) {
        this.ProductionFinishDate = productionFinishDate;
    }

    public String getInspectionDate() {
        return InspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.InspectionDate = inspectionDate;
    }

    public String getLoadingDate() {
        return LoadingDate;
    }

    public void setLoadingDate(String loadingDate) {
        this.LoadingDate = loadingDate;
    }

    public String getETD() {
        return ETD;
    }

    public void setETD(String ETD) {
        this.ETD = ETD;
    }

    public String getETAConfirmed_Old() {
        return ETAConfirmed_Old;
    }

    public void setETAConfirmed_Old(String ETAConfirmed_Old) {
        this.ETAConfirmed_Old = ETAConfirmed_Old;
    }

    public String getETAConfirmed_New() {
        return ETAConfirmed_New;
    }

    public void setETAConfirmed_New(String ETAConfirmed_New) {
        this.ETAConfirmed_New = ETAConfirmed_New;
    }

    public String getETARequested() {
        return ETARequested;
    }

    public void setETARequested(String ETARequested) {
        this.ETARequested = ETARequested;
    }

    public Integer getVariance() {
        return Variance;
    }

    public void setVariance(Integer variance) {
        this.Variance = variance;
    }

    public String getCountryDestination() {
        return CountryDestination;
    }

    public void setCountryDestination(String countryDestination) {
        this.CountryDestination = countryDestination;
    }

    public String getPortDestination() {
        return PortDestination;
    }

    public void setPortDestination(String portDestination) {
        this.PortDestination = portDestination;
    }

    public String getFinalDestination() {
        return FinalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.FinalDestination = finalDestination;
    }
}
