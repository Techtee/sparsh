package com.gwtapps.gwtspring.shared.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EmployeeServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.gwtapps.gwtspring.shared.services.EmployeeService
     */
    void findEmployee( long employeeId, AsyncCallback<com.gwtapps.gwtspring.shared.dto.EmployeeDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.gwtapps.gwtspring.shared.services.EmployeeService
     */
    void saveEmployee( long employeeId, java.lang.String name, java.lang.String surname, java.lang.String jobDescription, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.gwtapps.gwtspring.shared.services.EmployeeService
     */
    void updateEmployee( long employeeId, java.lang.String name, java.lang.String surname, java.lang.String jobDescription, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.gwtapps.gwtspring.shared.services.EmployeeService
     */
    void saveOrUpdateEmployee( long employeeId, java.lang.String name, java.lang.String surname, java.lang.String jobDescription, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.gwtapps.gwtspring.shared.services.EmployeeService
     */
    void deleteEmployee( long employeeId, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static EmployeeServiceAsync instance;

        public static final EmployeeServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (EmployeeServiceAsync) GWT.create( EmployeeService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
