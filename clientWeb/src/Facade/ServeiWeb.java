/**
 * ServeiWeb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public interface ServeiWeb extends java.rmi.Remote {
    public Facade.Local[] infoLocalPerTipoLocal(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController;
    public void altaLocal(Facade.Local arg0, Facade.Accessibilitat[] arg1) throws java.rmi.RemoteException, Facade.ExceptionController;
    public Facade.Local[] localnoVerificat() throws java.rmi.RemoteException, Facade.ExceptionController;
    public Facade.Local[] infoLocalPerNomLocal(java.lang.String arg0) throws java.rmi.RemoteException, Facade.ExceptionController;
    public void validaLocal(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController;
    public Facade.TipoLocal[] cercaTipoLocal() throws java.rmi.RemoteException, Facade.ExceptionController;
    public void baixaLocal(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController;
    public Facade.Local[] localsAccessibles(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController;
}
