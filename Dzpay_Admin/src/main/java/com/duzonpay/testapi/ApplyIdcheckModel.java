/**
 * ApplyIdcheckModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

public class ApplyIdcheckModel  implements java.io.Serializable {
    private java.lang.String adminId;

    public ApplyIdcheckModel() {
    }

    public ApplyIdcheckModel(
           java.lang.String adminId) {
           this.adminId = adminId;
    }


    /**
     * Gets the adminId value for this ApplyIdcheckModel.
     * 
     * @return adminId
     */
    public java.lang.String getAdminId() {
        return adminId;
    }


    /**
     * Sets the adminId value for this ApplyIdcheckModel.
     * 
     * @param adminId
     */
    public void setAdminId(java.lang.String adminId) {
        this.adminId = adminId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyIdcheckModel)) return false;
        ApplyIdcheckModel other = (ApplyIdcheckModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adminId==null && other.getAdminId()==null) || 
             (this.adminId!=null &&
              this.adminId.equals(other.getAdminId())));
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
        if (getAdminId() != null) {
            _hashCode += getAdminId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyIdcheckModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "applyIdcheckModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adminId"));
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
