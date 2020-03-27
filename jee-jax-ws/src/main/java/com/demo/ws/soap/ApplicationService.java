package com.demo.ws.soap;

import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.demo.ws.model.Application;
import com.demo.ws.utils.Database;

@WebService(
        endpointInterface = "com.demo.ws.soap.IApplicationService",
        serviceName = "ApplicationServiceSOAP")
@SOAPBinding(style= SOAPBinding.Style.DOCUMENT)
public class ApplicationService implements IApplicationService {

    public ApplicationService() {
    }

    @Override
    @SuppressWarnings("Duplicates")
    public Application getApplication(int id) {
        Application application = new Application();

        try {
            Statement statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from tza_application where id = " + id);

            while(resultSet.next()) {
                application = new Application(resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getString(3));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

       // return Response.status(200).entity(application).build();
        return application;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public List<Application> getAll() {

        List<Application> applications = new ArrayList<>();

        try {
            Statement statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from tza_application");

            while(resultSet.next()) {
                applications.add(new Application(resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getString(3)));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return applications;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public boolean addApplication(Application application) {
        try {
            Statement statement = Database.getConnection().createStatement();
            statement.executeUpdate("INSERT INTO TZA_APPLICATION " +
                    " VALUES (" + application.getId() + ",'" + application.getName() +
                    "','" + application.getDescription() + "')");
        } catch (SQLIntegrityConstraintViolationException exception) {
            exception.printStackTrace();
            return false;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public boolean updateApplication(Application application) {
        try {
            Statement statement = Database.getConnection().createStatement();
            statement.executeUpdate("UPDATE TZA_APPLICATION " +
                    " SET name = '" + application.getName() + "', " +
                    " description = '" + application.getDescription() + "'" +
                    " WHERE id=" + application.getId());
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public boolean deleteApplication(int id) {
        try {
            Statement statement = Database.getConnection().createStatement();
            statement.executeUpdate("DELETE FROM TZA_APPLICATION " +
                    " WHERE id=" + id);
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }

        return true;
    }


}
