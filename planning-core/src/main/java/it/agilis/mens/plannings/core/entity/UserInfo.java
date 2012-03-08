package it.agilis.mens.plannings.core.entity;

import it.agilis.mens.plannings.core.entity.validator.CaseMode;
import it.agilis.mens.plannings.core.entity.validator.CheckCase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 3/10/11
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class UserInfo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Pattern(regexp = "[0-9a-zA-Z\\.]{1,10}$")
    @CheckCase (CaseMode.UPPER)
    private String userName;
    private String password;
    private String nome;
    private String cognome;
    private String ragSociale;
    private String indirizzo;
    private String citta;
    private String provincia;
    private String cap;
    private String pIvaCF;
    private String telefono;
    private String fax;
    private Long supplierId;
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRagSociale() {
        return ragSociale;
    }

    public void setRagSociale(String ragSociale) {
        this.ragSociale = ragSociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getpIvaCF() {
        return pIvaCF;
    }

    public void setpIvaCF(String pIvaCF) {
        this.pIvaCF = pIvaCF;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Long getSupplierID() {
        return supplierId;
    }

    public void setSupplierID(Long supplierID) {
        this.supplierId = supplierID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
