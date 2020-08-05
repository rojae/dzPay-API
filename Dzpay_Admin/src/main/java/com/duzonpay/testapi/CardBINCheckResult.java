/**
 * CardBINCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.duzonpay.testapi;

public class CardBINCheckResult  implements java.io.Serializable {
    private java.lang.String API_KEY;

    private java.lang.String CARD_CD;

    private java.lang.String CARD_NM;

    private java.lang.String CARD_NO;

    private java.lang.String CARD_ONWER;

    private java.lang.String CARD_TYPE;

    private java.lang.String RESULT_CODE;

    private java.lang.String RESULT_MSG;

    private java.lang.String SITE_CD;

    public CardBINCheckResult() {
    }

    public CardBINCheckResult(
           java.lang.String API_KEY,
           java.lang.String CARD_CD,
           java.lang.String CARD_NM,
           java.lang.String CARD_NO,
           java.lang.String CARD_ONWER,
           java.lang.String CARD_TYPE,
           java.lang.String RESULT_CODE,
           java.lang.String RESULT_MSG,
           java.lang.String SITE_CD) {
           this.API_KEY = API_KEY;
           this.CARD_CD = CARD_CD;
           this.CARD_NM = CARD_NM;
           this.CARD_NO = CARD_NO;
           this.CARD_ONWER = CARD_ONWER;
           this.CARD_TYPE = CARD_TYPE;
           this.RESULT_CODE = RESULT_CODE;
           this.RESULT_MSG = RESULT_MSG;
           this.SITE_CD = SITE_CD;
    }


    /**
     * Gets the API_KEY value for this CardBINCheckResult.
     * 
     * @return API_KEY
     */
    public java.lang.String getAPI_KEY() {
        return API_KEY;
    }


    /**
     * Sets the API_KEY value for this CardBINCheckResult.
     * 
     * @param API_KEY
     */
    public void setAPI_KEY(java.lang.String API_KEY) {
        this.API_KEY = API_KEY;
    }


    /**
     * Gets the CARD_CD value for this CardBINCheckResult.
     * 
     * @return CARD_CD
     */
    public java.lang.String getCARD_CD() {
        return CARD_CD;
    }


    /**
     * Sets the CARD_CD value for this CardBINCheckResult.
     * 
     * @param CARD_CD
     */
    public void setCARD_CD(java.lang.String CARD_CD) {
        this.CARD_CD = CARD_CD;
    }


    /**
     * Gets the CARD_NM value for this CardBINCheckResult.
     * 
     * @return CARD_NM
     */
    public java.lang.String getCARD_NM() {
        return CARD_NM;
    }


    /**
     * Sets the CARD_NM value for this CardBINCheckResult.
     * 
     * @param CARD_NM
     */
    public void setCARD_NM(java.lang.String CARD_NM) {
        this.CARD_NM = CARD_NM;
    }


    /**
     * Gets the CARD_NO value for this CardBINCheckResult.
     * 
     * @return CARD_NO
     */
    public java.lang.String getCARD_NO() {
        return CARD_NO;
    }


    /**
     * Sets the CARD_NO value for this CardBINCheckResult.
     * 
     * @param CARD_NO
     */
    public void setCARD_NO(java.lang.String CARD_NO) {
        this.CARD_NO = CARD_NO;
    }


    /**
     * Gets the CARD_ONWER value for this CardBINCheckResult.
     * 
     * @return CARD_ONWER
     */
    public java.lang.String getCARD_ONWER() {
        return CARD_ONWER;
    }


    /**
     * Sets the CARD_ONWER value for this CardBINCheckResult.
     * 
     * @param CARD_ONWER
     */
    public void setCARD_ONWER(java.lang.String CARD_ONWER) {
        this.CARD_ONWER = CARD_ONWER;
    }


    /**
     * Gets the CARD_TYPE value for this CardBINCheckResult.
     * 
     * @return CARD_TYPE
     */
    public java.lang.String getCARD_TYPE() {
        return CARD_TYPE;
    }


    /**
     * Sets the CARD_TYPE value for this CardBINCheckResult.
     * 
     * @param CARD_TYPE
     */
    public void setCARD_TYPE(java.lang.String CARD_TYPE) {
        this.CARD_TYPE = CARD_TYPE;
    }


    /**
     * Gets the RESULT_CODE value for this CardBINCheckResult.
     * 
     * @return RESULT_CODE
     */
    public java.lang.String getRESULT_CODE() {
        return RESULT_CODE;
    }


    /**
     * Sets the RESULT_CODE value for this CardBINCheckResult.
     * 
     * @param RESULT_CODE
     */
    public void setRESULT_CODE(java.lang.String RESULT_CODE) {
        this.RESULT_CODE = RESULT_CODE;
    }


    /**
     * Gets the RESULT_MSG value for this CardBINCheckResult.
     * 
     * @return RESULT_MSG
     */
    public java.lang.String getRESULT_MSG() {
        return RESULT_MSG;
    }


    /**
     * Sets the RESULT_MSG value for this CardBINCheckResult.
     * 
     * @param RESULT_MSG
     */
    public void setRESULT_MSG(java.lang.String RESULT_MSG) {
        this.RESULT_MSG = RESULT_MSG;
    }


    /**
     * Gets the SITE_CD value for this CardBINCheckResult.
     * 
     * @return SITE_CD
     */
    public java.lang.String getSITE_CD() {
        return SITE_CD;
    }


    /**
     * Sets the SITE_CD value for this CardBINCheckResult.
     * 
     * @param SITE_CD
     */
    public void setSITE_CD(java.lang.String SITE_CD) {
        this.SITE_CD = SITE_CD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardBINCheckResult)) return false;
        CardBINCheckResult other = (CardBINCheckResult) obj;
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
            ((this.CARD_CD==null && other.getCARD_CD()==null) || 
             (this.CARD_CD!=null &&
              this.CARD_CD.equals(other.getCARD_CD()))) &&
            ((this.CARD_NM==null && other.getCARD_NM()==null) || 
             (this.CARD_NM!=null &&
              this.CARD_NM.equals(other.getCARD_NM()))) &&
            ((this.CARD_NO==null && other.getCARD_NO()==null) || 
             (this.CARD_NO!=null &&
              this.CARD_NO.equals(other.getCARD_NO()))) &&
            ((this.CARD_ONWER==null && other.getCARD_ONWER()==null) || 
             (this.CARD_ONWER!=null &&
              this.CARD_ONWER.equals(other.getCARD_ONWER()))) &&
            ((this.CARD_TYPE==null && other.getCARD_TYPE()==null) || 
             (this.CARD_TYPE!=null &&
              this.CARD_TYPE.equals(other.getCARD_TYPE()))) &&
            ((this.RESULT_CODE==null && other.getRESULT_CODE()==null) || 
             (this.RESULT_CODE!=null &&
              this.RESULT_CODE.equals(other.getRESULT_CODE()))) &&
            ((this.RESULT_MSG==null && other.getRESULT_MSG()==null) || 
             (this.RESULT_MSG!=null &&
              this.RESULT_MSG.equals(other.getRESULT_MSG()))) &&
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
        if (getCARD_CD() != null) {
            _hashCode += getCARD_CD().hashCode();
        }
        if (getCARD_NM() != null) {
            _hashCode += getCARD_NM().hashCode();
        }
        if (getCARD_NO() != null) {
            _hashCode += getCARD_NO().hashCode();
        }
        if (getCARD_ONWER() != null) {
            _hashCode += getCARD_ONWER().hashCode();
        }
        if (getCARD_TYPE() != null) {
            _hashCode += getCARD_TYPE().hashCode();
        }
        if (getRESULT_CODE() != null) {
            _hashCode += getRESULT_CODE().hashCode();
        }
        if (getRESULT_MSG() != null) {
            _hashCode += getRESULT_MSG().hashCode();
        }
        if (getSITE_CD() != null) {
            _hashCode += getSITE_CD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardBINCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://testapi.duzonpay.com/", "cardBINCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("API_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "API_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CARD_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_NM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CARD_NM"));
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
        elemField.setFieldName("CARD_ONWER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CARD_ONWER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CARD_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RESULT_CODE"));
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
