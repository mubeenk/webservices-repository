package com.demo.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.demo.model.Application;

@WebService
public interface IApplicationService {

    @WebMethod
    public List<Application> getAll();

    @WebMethod
    public Application getApplication(int id);

    @WebMethod
    public boolean addApplication(Application application);

    @WebMethod
    public boolean updateApplication(Application application);

    @WebMethod
    public boolean deleteApplication(int id);

}
