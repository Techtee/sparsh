package com.gwtapps.gwtspring.shared.services;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/loginService")
public interface LoginService extends RemoteService {

 /**
 * @param user
 * @param password
 * @return boolean
 */
boolean login(String user, String password);

}

