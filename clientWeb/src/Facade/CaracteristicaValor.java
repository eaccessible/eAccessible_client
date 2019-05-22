/**
 * CaracteristicaValor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public class CaracteristicaValor  implements java.io.Serializable {
    private java.lang.String nomcaracteristicaca;

    private int valor;

    public CaracteristicaValor() {
    }

    public CaracteristicaValor(
           java.lang.String nomcaracteristicaca,
           int valor) {
           this.nomcaracteristicaca = nomcaracteristicaca;
           this.valor = valor;
    }


    /**
     * Gets the nomcaracteristicaca value for this CaracteristicaValor.
     * 
     * @return nomcaracteristicaca
     */
    public java.lang.String getNomcaracteristicaca() {
        return nomcaracteristicaca;
    }


    /**
     * Sets the nomcaracteristicaca value for this CaracteristicaValor.
     * 
     * @param nomcaracteristicaca
     */
    public void setNomcaracteristicaca(java.lang.String nomcaracteristicaca) {
        this.nomcaracteristicaca = nomcaracteristicaca;
    }


    /**
     * Gets the valor value for this CaracteristicaValor.
     * 
     * @return valor
     */
    public int getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this CaracteristicaValor.
     * 
     * @param valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaracteristicaValor)) return false;
        CaracteristicaValor other = (CaracteristicaValor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomcaracteristicaca==null && other.getNomcaracteristicaca()==null) || 
             (this.nomcaracteristicaca!=null &&
              this.nomcaracteristicaca.equals(other.getNomcaracteristicaca()))) &&
            this.valor == other.getValor();
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
        if (getNomcaracteristicaca() != null) {
            _hashCode += getNomcaracteristicaca().hashCode();
        }
        _hashCode += getValor();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaracteristicaValor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Facade/", "caracteristicaValor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomcaracteristicaca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomcaracteristicaca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
