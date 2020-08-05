/**
 * ApplyIdcheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

public class ApplyIdcheckResult  implements java.io.Serializable {
    private java.lang.String adminId;

    private java.lang.String RESULT_CD;

    private java.lang.String RESULT_MSG;

    public ApplyIdcheckResult() {
    }

    public ApplyIdcheckResult(
           java.lang.String adminId,
           java.lang.String RESULT_CD,
           java.lang.String RESULT_MSG) {
           this.adminId = adminId;
           this.RESULT_CD = RESULT_CD;
           this.RESULT_MSG = RESULT_MSG;
    }


    /**
     * Gets the adminId value for this ApplyIdcheckResult.
     * 
     * @return adminId
     */
    public java.lang.String getAdminId() {
        return adminId;
    }


    /**
     * Sets the adminId value for this ApplyIdcheckResult.
     * 
     * @param adminId
     */
    public void setAdminId(java.lang.String adminId) {
        this.adminId = adminId;
    }


    /**
     * Gets the RESULT_CD value for this ApplyIdcheckResult.
     * 
     * @return RESULT_CD
     */
    public java.lang.String getRESULT_CD() {
        return RESULT_CD;
    }


    /**
     * Sets the RESULT_CD value for this ApplyIdcheckResult.
     * 
     * @param RESULT_CD
     */
    public void setRESULT_CD(java.lang.String RESULT_CD) {
        this.RESULT_CD = RESULT_CD;
    }


    /**
     * Gets the RESULT_MSG value for this ApplyIdcheckResult.
     * 
     * @return RESULT_MSG
     */
    public java.lang.String getRESULT_MSG() {
        return RESULT_MSG;
    }


    /**
     * Sets the RESULT_MSG value for this ApplyIdcheckResult.
     * 
     * @param RESULT_MSG
     */
    public void setRESULT_MSG(java.lang.String RESULT_MSG) {
        this.RESULT_MSG = RESULT_MSG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyIdcheckResult)) return false;
        ApplyIdcheckResult other = (ApplyIdcheckResult) obj;
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
              this.adminId.equals(other.getAdminId()))) &&
            ((this.RESULT_CD==null && other.getRESULT_CD()==null) || 
             (this.RESULT_CD!=null &&
              this.RESULT_CD.equals(other.getRESULT_CD()))) &&
            ((this.RESULT_MSG==null && other.getRESULT_MSG()==null) || 
             (this.RESULT_MSG!=null &&
              this.RESULT_MSG.equals(other.getRESULT_MSG())));
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
        if (getRESULT_CD() != null) {
            _hashCode += getRESULT_CD().hashCode();
        }
        if (getRESULT_MSG() != null) {
            _hashCode += getRESULT_MSG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyIdcheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "applyIdcheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adminId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESULT_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT_MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESULT_MSG"));
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
