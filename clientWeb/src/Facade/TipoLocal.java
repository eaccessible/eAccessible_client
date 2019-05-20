/**
 * TipoLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public class TipoLocal  implements java.io.Serializable {
    private int coditipolocal;

    private java.lang.String nomtipolocalca;

    private java.lang.String nomtipolocalen;

    private java.lang.String nomtipolocales;

    public TipoLocal() {
    }

    public TipoLocal(
           int coditipolocal,
           java.lang.String nomtipolocalca,
           java.lang.String nomtipolocalen,
           java.lang.String nomtipolocales) {
           this.coditipolocal = coditipolocal;
           this.nomtipolocalca = nomtipolocalca;
           this.nomtipolocalen = nomtipolocalen;
           this.nomtipolocales = nomtipolocales;
    }


    /**
     * Gets the coditipolocal value for this TipoLocal.
     * 
     * @return coditipolocal
     */
    public int getCoditipolocal() {
        return coditipolocal;
    }


    /**
     * Sets the coditipolocal value for this TipoLocal.
     * 
     * @param coditipolocal
     */
    public void setCoditipolocal(int coditipolocal) {
        this.coditipolocal = coditipolocal;
    }


    /**
     * Gets the nomtipolocalca value for this TipoLocal.
     * 
     * @return nomtipolocalca
     */
    public java.lang.String getNomtipolocalca() {
        return nomtipolocalca;
    }


    /**
     * Sets the nomtipolocalca value for this TipoLocal.
     * 
     * @param nomtipolocalca
     */
    public void setNomtipolocalca(java.lang.String nomtipolocalca) {
        this.nomtipolocalca = nomtipolocalca;
    }


    /**
     * Gets the nomtipolocalen value for this TipoLocal.
     * 
     * @return nomtipolocalen
     */
    public java.lang.String getNomtipolocalen() {
        return nomtipolocalen;
    }


    /**
     * Sets the nomtipolocalen value for this TipoLocal.
     * 
     * @param nomtipolocalen
     */
    public void setNomtipolocalen(java.lang.String nomtipolocalen) {
        this.nomtipolocalen = nomtipolocalen;
    }


    /**
     * Gets the nomtipolocales value for this TipoLocal.
     * 
     * @return nomtipolocales
     */
    public java.lang.String getNomtipolocales() {
        return nomtipolocales;
    }


    /**
     * Sets the nomtipolocales value for this TipoLocal.
     * 
     * @param nomtipolocales
     */
    public void setNomtipolocales(java.lang.String nomtipolocales) {
        this.nomtipolocales = nomtipolocales;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoLocal)) return false;
        TipoLocal other = (TipoLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.coditipolocal == other.getCoditipolocal() &&
            ((this.nomtipolocalca==null && other.getNomtipolocalca()==null) || 
             (this.nomtipolocalca!=null &&
              this.nomtipolocalca.equals(other.getNomtipolocalca()))) &&
            ((this.nomtipolocalen==null && other.getNomtipolocalen()==null) || 
             (this.nomtipolocalen!=null &&
              this.nomtipolocalen.equals(other.getNomtipolocalen()))) &&
            ((this.nomtipolocales==null && other.getNomtipolocales()==null) || 
             (this.nomtipolocales!=null &&
              this.nomtipolocales.equals(other.getNomtipolocales())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCoditipolocal();
        if (getNomtipolocalca() != null) {
            _hashCode += getNomtipolocalca().hashCode();
        }
        if (getNomtipolocalen() != null) {
            _hashCode += getNomtipolocalen().hashCode();
        }
        if (getNomtipolocales() != null) {
            _hashCode += getNomtipolocales().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Facade/", "tipoLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coditipolocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coditipolocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomtipolocalca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomtipolocalca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomtipolocalen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomtipolocalen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomtipolocales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomtipolocales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
