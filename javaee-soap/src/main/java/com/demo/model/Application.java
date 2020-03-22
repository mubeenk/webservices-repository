package com.demo.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Application {


    private Integer id;
    private String name;
    private String description;

    public Application() { }

    public Application(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Application(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @XmlElement
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void toXml() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Application.class);
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
