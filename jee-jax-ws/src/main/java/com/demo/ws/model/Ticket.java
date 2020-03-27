package com.demo.ws.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Ticket {

    private Integer id;

    private String title;
    private String description;
    private String status;

    public Ticket() {
    }

    public Ticket(Integer id, String title, String description, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void toXml() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Ticket.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.marshal(this, System.out);
        }
        catch (Exception exception) {
            //catch exception
            exception.printStackTrace();
        }
    }

}
