/**
 * CardBINCheckModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

public class CardBINCheckModel  implements java.io.Serializable {
    private java.lang.String API_KEY;

    private java.lang.String CARD_NO;

    private java.lang.String SITE_CD;

    public CardBINCheckModel() {
    }

    public CardBINCheckModel(
           java.lang.String API_KEY,
           java.lang.String CARD_NO,
           java.lang.String SITE_CD) {
           this.API_KEY = API_KEY;
           this.CARD_NO = CARD_NO;
           this.SITE_CD = SITE_CD;
    }


    /**
     * Gets the API_KEY value for this CardBINCheckModel.
     * 
     * @return API_KEY
     */
    public java.lang.String getAPI_KEY() {
        return API_KEY;
    }


    /**
     * Sets the API_KEY value for this CardBINCheckModel.
     * 
     * @param API_KEY
     */
    public void setAPI_KEY(java.lang.String API_KEY) {
        this.API_KEY = API_KEY;
    }


    /**
     * Gets the CARD_NO value for this CardBINCheckModel.
     * 
     * @return CARD_NO
     */
    public java.lang.String getCARD_NO() {
        return CARD_NO;
    }


    /**
     * Sets the CARD_NO value for this CardBINCheckModel.
     * 
     * @param CARD_NO
     */
    public void setCARD_NO(java.lang.String CARD_NO) {
        this.CARD_NO = CARD_NO;
    }


    /**
     * Gets the SITE_CD value for this CardBINCheckModel.
     * 
     * @return SITE_CD
     */
    public java.lang.String getSITE_CD() {
        return SITE_CD;
    }


    /**
     * Sets the SITE_CD value for this CardBINCheckModel.
     * 
     * @param SITE_CD
     */
    public void setSITE_CD(java.lang.String SITE_CD) {
        this.SITE_CD = SITE_CD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardBINCheckModel)) return false;
        CardBINCheckModel other = (CardBINCheckModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.API_KEY==null && other.getAPI_KEY()==null) || 
             (this.API_KEY!=null &&
              this.API_KEY.equals(other.getAPI_KEY()))) &&
            ((this.CARD_NO==null && other.getCARD_NO()==null) || 
             (this.CARD_NO!=null &&
              this.CARD_NO.equals(other.getCARD_NO()))) &&
            ((this.SITE_CD==null && other.getSITE_CD()==null) || 
             (this.SITE_CD!=null &&
              this.SITE_CD.equals(other.getSITE_CD())));
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
        if (getAPI_KEY() != null) {
            _hashCode += getAPI_KEY().hashCode();
        }
        if (getCARD_NO() != null) {
            _hashCode += getCARD_NO().hashCode();
        }
        if (getSITE_CD() != null) {
            _hashCode += getSITE_CD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardBINCheckModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "cardBINCheckModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("API_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "API_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CARD_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SITE_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SITE_CD"));
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
