package Facade;

public class ServeiWebProxy implements Facade.ServeiWeb {
  private String _endpoint = null;
  private Facade.ServeiWeb serveiWeb = null;
  
  public ServeiWebProxy() {
    _initServeiWebProxy();
  }
  
  public ServeiWebProxy(String endpoint) {
    _endpoint = endpoint;
    _initServeiWebProxy();
  }
  
  private void _initServeiWebProxy() {
    try {
      serveiWeb = (new Facade.ServeiWebServiceLocator()).getServeiWebPort();
      if (serveiWeb != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serveiWeb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serveiWeb)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serveiWeb != null)
      ((javax.xml.rpc.Stub)serveiWeb)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Facade.ServeiWeb getServeiWeb() {
    if (serveiWeb == null)
      _initServeiWebProxy();
    return serveiWeb;
  }
  
  public Facade.Local[] localsAccessibles(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    return serveiWeb.localsAccessibles(arg0);
  }
  
  public Facade.Local[] localnoVerificat() throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    return serveiWeb.localnoVerificat();
  }
  
  public Facade.TipoLocal[] cercaTipoLocal() throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    return serveiWeb.cercaTipoLocal();
  }
  
  public void validaLocal(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    serveiWeb.validaLocal(arg0);
  }
  
  public Facade.Local[] infoLocalPerTipoLocal(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    return serveiWeb.infoLocalPerTipoLocal(arg0);
  }
  
  public void altaLocal(Facade.Local arg0, Facade.Accessibilitat[] arg1) throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    serveiWeb.altaLocal(arg0, arg1);
  }
  
  public void baixaLocal(int arg0) throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    serveiWeb.baixaLocal(arg0);
  }
  
  public Facade.Local[] infoLocalPerNomLocal(java.lang.String arg0) throws java.rmi.RemoteException, Facade.ExceptionController{
    if (serveiWeb == null)
      _initServeiWebProxy();
    return serveiWeb.infoLocalPerNomLocal(arg0);
  }
  
  
}