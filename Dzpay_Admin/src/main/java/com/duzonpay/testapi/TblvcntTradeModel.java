/**
 * TblvcntTradeModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

public class TblvcntTradeModel  implements java.io.Serializable {
    private java.lang.String ACCOUNT_NO;

    private java.lang.String API_KEY;

    private java.lang.String CORP_ID;

    private java.lang.String SITE_CD;

    private java.lang.String v_TRADE_NO;

    public TblvcntTradeModel() {
    }

    public TblvcntTradeModel(
           java.lang.String ACCOUNT_NO,
           java.lang.String API_KEY,
           java.lang.String CORP_ID,
           java.lang.String SITE_CD,
           java.lang.String v_TRADE_NO) {
           this.ACCOUNT_NO = ACCOUNT_NO;
           this.API_KEY = API_KEY;
           this.CORP_ID = CORP_ID;
           this.SITE_CD = SITE_CD;
           this.v_TRADE_NO = v_TRADE_NO;
    }


    /**
     * Gets the ACCOUNT_NO value for this TblvcntTradeModel.
     * 
     * @return ACCOUNT_NO
     */
    public java.lang.String getACCOUNT_NO() {
        return ACCOUNT_NO;
    }


    /**
     * Sets the ACCOUNT_NO value for this TblvcntTradeModel.
     * 
     * @param ACCOUNT_NO
     */
    public void setACCOUNT_NO(java.lang.String ACCOUNT_NO) {
        this.ACCOUNT_NO = ACCOUNT_NO;
    }


    /**
     * Gets the API_KEY value for this TblvcntTradeModel.
     * 
     * @return API_KEY
     */
    public java.lang.String getAPI_KEY() {
        return API_KEY;
    }


    /**
     * Sets the API_KEY value for this TblvcntTradeModel.
     * 
     * @param API_KEY
     */
    public void setAPI_KEY(java.lang.String API_KEY) {
        this.API_KEY = API_KEY;
    }


    /**
     * Gets the CORP_ID value for this TblvcntTradeModel.
     * 
     * @return CORP_ID
     */
    public java.lang.String getCORP_ID() {
        return CORP_ID;
    }


    /**
     * Sets the CORP_ID value for this TblvcntTradeModel.
     * 
     * @param CORP_ID
     */
    public void setCORP_ID(java.lang.String CORP_ID) {
        this.CORP_ID = CORP_ID;
    }


    /**
     * Gets the SITE_CD value for this TblvcntTradeModel.
     * 
     * @return SITE_CD
     */
    public java.lang.String getSITE_CD() {
        return SITE_CD;
    }


    /**
     * Sets the SITE_CD value for this TblvcntTradeModel.
     * 
     * @param SITE_CD
     */
    public void setSITE_CD(java.lang.String SITE_CD) {
        this.SITE_CD = SITE_CD;
    }


    /**
     * Gets the v_TRADE_NO value for this TblvcntTradeModel.
     * 
     * @return v_TRADE_NO
     */
    public java.lang.String getV_TRADE_NO() {
        return v_TRADE_NO;
    }


    /**
     * Sets the v_TRADE_NO value for this TblvcntTradeModel.
     * 
     * @param v_TRADE_NO
     */
    public void setV_TRADE_NO(java.lang.String v_TRADE_NO) {
        this.v_TRADE_NO = v_TRADE_NO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TblvcntTradeModel)) return false;
        TblvcntTradeModel other = (TblvcntTradeModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACCOUNT_NO==null && other.getACCOUNT_NO()==null) || 
             (this.ACCOUNT_NO!=null &&
              this.ACCOUNT_NO.equals(other.getACCOUNT_NO()))) &&
            ((this.API_KEY==null && other.getAPI_KEY()==null) || 
             (this.API_KEY!=null &&
              this.API_KEY.equals(other.getAPI_KEY()))) &&
            ((this.CORP_ID==null && other.getCORP_ID()==null) || 
             (this.CORP_ID!=null &&
              this.CORP_ID.equals(other.getCORP_ID()))) &&
            ((this.SITE_CD==null && other.getSITE_CD()==null) || 
             (this.SITE_CD!=null &&
              this.SITE_CD.equals(other.getSITE_CD()))) &&
            ((this.v_TRADE_NO==null && other.getV_TRADE_NO()==null) || 
             (this.v_TRADE_NO!=null &&
              this.v_TRADE_NO.equals(other.getV_TRADE_NO())));
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
        if (getACCOUNT_NO() != null) {
            _hashCode += getACCOUNT_NO().hashCode();
        }
        if (getAPI_KEY() != null) {
            _hashCode += getAPI_KEY().hashCode();
        }
        if (getCORP_ID() != null) {
            _hashCode += getCORP_ID().hashCode();
        }
        if (getSITE_CD() != null) {
            _hashCode += getSITE_CD().hashCode();
        }
        if (getV_TRADE_NO() != null) {
            _hashCode += getV_TRADE_NO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TblvcntTradeModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "tblvcntTradeModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACCOUNT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("API_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "API_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CORP_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CORP_ID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v_TRADE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v_TRADE_NO"));
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
