/**
 * Local.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Facade;

public class Local  implements java.io.Serializable {
    private int codicarrer;

    private int codilocal;

    private int coditipolocal;

    private java.lang.String nomcarrer;

    private java.lang.String nomlocal;

    private java.lang.String nomvia;

    private int numero;

    private java.lang.String observacions;

    private java.lang.String verificat;

    public Local() {
    }

    public Local(
           int codicarrer,
           int codilocal,
           int coditipolocal,
           java.lang.String nomcarrer,
           java.lang.String nomlocal,
           java.lang.String nomvia,
           int numero,
           java.lang.String observacions,
           java.lang.String verificat) {
           this.codicarrer = codicarrer;
           this.codilocal = codilocal;
           this.coditipolocal = coditipolocal;
           this.nomcarrer = nomcarrer;
           this.nomlocal = nomlocal;
           this.nomvia = nomvia;
           this.numero = numero;
           this.observacions = observacions;
           this.verificat = verificat;
    }


    /**
     * Gets the codicarrer value for this Local.
     * 
     * @return codicarrer
     */
    public int getCodicarrer() {
        return codicarrer;
    }


    /**
     * Sets the codicarrer value for this Local.
     * 
     * @param codicarrer
     */
    public void setCodicarrer(int codicarrer) {
        this.codicarrer = codicarrer;
    }


    /**
     * Gets the codilocal value for this Local.
     * 
     * @return codilocal
     */
    public int getCodilocal() {
        return codilocal;
    }


    /**
     * Sets the codilocal value for this Local.
     * 
     * @param codilocal
     */
    public void setCodilocal(int codilocal) {
        this.codilocal = codilocal;
    }


    /**
     * Gets the coditipolocal value for this Local.
     * 
     * @return coditipolocal
     */
    public int getCoditipolocal() {
        return coditipolocal;
    }


    /**
     * Sets the coditipolocal value for this Local.
     * 
     * @param coditipolocal
     */
    public void setCoditipolocal(int coditipolocal) {
        this.coditipolocal = coditipolocal;
    }


    /**
     * Gets the nomcarrer value for this Local.
     * 
     * @return nomcarrer
     */
    public java.lang.String getNomcarrer() {
        return nomcarrer;
    }


    /**
     * Sets the nomcarrer value for this Local.
     * 
     * @param nomcarrer
     */
    public void setNomcarrer(java.lang.String nomcarrer) {
        this.nomcarrer = nomcarrer;
    }


    /**
     * Gets the nomlocal value for this Local.
     * 
     * @return nomlocal
     */
    public java.lang.String getNomlocal() {
        return nomlocal;
    }


    /**
     * Sets the nomlocal value for this Local.
     * 
     * @param nomlocal
     */
    public void setNomlocal(java.lang.String nomlocal) {
        this.nomlocal = nomlocal;
    }


    /**
     * Gets the nomvia value for this Local.
     * 
     * @return nomvia
     */
    public java.lang.String getNomvia() {
        return nomvia;
    }


    /**
     * Sets the nomvia value for this Local.
     * 
     * @param nomvia
     */
    public void setNomvia(java.lang.String nomvia) {
        this.nomvia = nomvia;
    }


    /**
     * Gets the numero value for this Local.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Local.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Gets the observacions value for this Local.
     * 
     * @return observacions
     */
    public java.lang.String getObservacions() {
        return observacions;
    }


    /**
     * Sets the observacions value for this Local.
     * 
     * @param observacions
     */
    public void setObservacions(java.lang.String observacions) {
        this.observacions = observacions;
    }


    /**
     * Gets the verificat value for this Local.
     * 
     * @return verificat
     */
    public java.lang.String getVerificat() {
        return verificat;
    }


    /**
     * Sets the verificat value for this Local.
     * 
     * @param verificat
     */
    public void setVerificat(java.lang.String verificat) {
        this.verificat = verificat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Local)) return false;
        Local other = (Local) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codicarrer == other.getCodicarrer() &&
            this.codilocal == other.getCodilocal() &&
            this.coditipolocal == other.getCoditipolocal() &&
            ((this.nomcarrer==null && other.getNomcarrer()==null) || 
             (this.nomcarrer!=null &&
              this.nomcarrer.equals(other.getNomcarrer()))) &&
            ((this.nomlocal==null && other.getNomlocal()==null) || 
             (this.nomlocal!=null &&
              this.nomlocal.equals(other.getNomlocal()))) &&
            ((this.nomvia==null && other.getNomvia()==null) || 
             (this.nomvia!=null &&
              this.nomvia.equals(other.getNomvia()))) &&
            this.numero == other.getNumero() &&
            ((this.observacions==null && other.getObservacions()==null) || 
             (this.observacions!=null &&
              this.observacions.equals(other.getObservacions()))) &&
            ((this.verificat==null && other.getVerificat()==null) || 
             (this.verificat!=null &&
              this.verificat.equals(other.getVerificat())));
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
        _hashCode += getCodicarrer();
        _hashCode += getCodilocal();
        _hashCode += getCoditipolocal();
        if (getNomcarrer() != null) {
            _hashCode += getNomcarrer().hashCode();
        }
        if (getNomlocal() != null) {
            _hashCode += getNomlocal().hashCode();
        }
        if (getNomvia() != null) {
            _hashCode += getNomvia().hashCode();
        }
        _hashCode += getNumero();
        if (getObservacions() != null) {
            _hashCode += getObservacions().hashCode();
        }
        if (getVerificat() != null) {
            _hashCode += getVerificat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Local.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Facade/", "local"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicarrer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codicarrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codilocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codilocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coditipolocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coditipolocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomcarrer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomcarrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomlocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomlocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomvia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomvia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verificat"));
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
