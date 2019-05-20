/**
 * Caracteristica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public class Caracteristica  implements java.io.Serializable {
    private int codicaracteristica;

    private int codinivell;

    private java.lang.String nomcaracteristicaca;

    private java.lang.String nomcaracteristicaen;

    private java.lang.String nomcaracteristicaes;

    private int tipo;

    public Caracteristica() {
    }

    public Caracteristica(
           int codicaracteristica,
           int codinivell,
           java.lang.String nomcaracteristicaca,
           java.lang.String nomcaracteristicaen,
           java.lang.String nomcaracteristicaes,
           int tipo) {
           this.codicaracteristica = codicaracteristica;
           this.codinivell = codinivell;
           this.nomcaracteristicaca = nomcaracteristicaca;
           this.nomcaracteristicaen = nomcaracteristicaen;
           this.nomcaracteristicaes = nomcaracteristicaes;
           this.tipo = tipo;
    }


    /**
     * Gets the codicaracteristica value for this Caracteristica.
     * 
     * @return codicaracteristica
     */
    public int getCodicaracteristica() {
        return codicaracteristica;
    }


    /**
     * Sets the codicaracteristica value for this Caracteristica.
     * 
     * @param codicaracteristica
     */
    public void setCodicaracteristica(int codicaracteristica) {
        this.codicaracteristica = codicaracteristica;
    }


    /**
     * Gets the codinivell value for this Caracteristica.
     * 
     * @return codinivell
     */
    public int getCodinivell() {
        return codinivell;
    }


    /**
     * Sets the codinivell value for this Caracteristica.
     * 
     * @param codinivell
     */
    public void setCodinivell(int codinivell) {
        this.codinivell = codinivell;
    }


    /**
     * Gets the nomcaracteristicaca value for this Caracteristica.
     * 
     * @return nomcaracteristicaca
     */
    public java.lang.String getNomcaracteristicaca() {
        return nomcaracteristicaca;
    }


    /**
     * Sets the nomcaracteristicaca value for this Caracteristica.
     * 
     * @param nomcaracteristicaca
     */
    public void setNomcaracteristicaca(java.lang.String nomcaracteristicaca) {
        this.nomcaracteristicaca = nomcaracteristicaca;
    }


    /**
     * Gets the nomcaracteristicaen value for this Caracteristica.
     * 
     * @return nomcaracteristicaen
     */
    public java.lang.String getNomcaracteristicaen() {
        return nomcaracteristicaen;
    }


    /**
     * Sets the nomcaracteristicaen value for this Caracteristica.
     * 
     * @param nomcaracteristicaen
     */
    public void setNomcaracteristicaen(java.lang.String nomcaracteristicaen) {
        this.nomcaracteristicaen = nomcaracteristicaen;
    }


    /**
     * Gets the nomcaracteristicaes value for this Caracteristica.
     * 
     * @return nomcaracteristicaes
     */
    public java.lang.String getNomcaracteristicaes() {
        return nomcaracteristicaes;
    }


    /**
     * Sets the nomcaracteristicaes value for this Caracteristica.
     * 
     * @param nomcaracteristicaes
     */
    public void setNomcaracteristicaes(java.lang.String nomcaracteristicaes) {
        this.nomcaracteristicaes = nomcaracteristicaes;
    }


    /**
     * Gets the tipo value for this Caracteristica.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Caracteristica.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Caracteristica)) return false;
        Caracteristica other = (Caracteristica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codicaracteristica == other.getCodicaracteristica() &&
            this.codinivell == other.getCodinivell() &&
            ((this.nomcaracteristicaca==null && other.getNomcaracteristicaca()==null) || 
             (this.nomcaracteristicaca!=null &&
              this.nomcaracteristicaca.equals(other.getNomcaracteristicaca()))) &&
            ((this.nomcaracteristicaen==null && other.getNomcaracteristicaen()==null) || 
             (this.nomcaracteristicaen!=null &&
              this.nomcaracteristicaen.equals(other.getNomcaracteristicaen()))) &&
            ((this.nomcaracteristicaes==null && other.getNomcaracteristicaes()==null) || 
             (this.nomcaracteristicaes!=null &&
              this.nomcaracteristicaes.equals(other.getNomcaracteristicaes()))) &&
            this.tipo == other.getTipo();
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
        _hashCode += getCodicaracteristica();
        _hashCode += getCodinivell();
        if (getNomcaracteristicaca() != null) {
            _hashCode += getNomcaracteristicaca().hashCode();
        }
        if (getNomcaracteristicaen() != null) {
            _hashCode += getNomcaracteristicaen().hashCode();
        }
        if (getNomcaracteristicaes() != null) {
            _hashCode += getNomcaracteristicaes().hashCode();
        }
        _hashCode += getTipo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Caracteristica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Facade/", "caracteristica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codicaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codinivell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codinivell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomcaracteristicaca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomcaracteristicaca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomcaracteristicaen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomcaracteristicaen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomcaracteristicaes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomcaracteristicaes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
