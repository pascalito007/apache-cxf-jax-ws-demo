
package com.pluralsigt.schema.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour OrderInquiryType complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OrderInquiryType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="uniqueOrderId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="orderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="ean13" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInquiryType", propOrder = {
    "uniqueOrderId",
    "orderQuantity",
    "accountId",
    "ean13"
})
public class OrderInquiryType {

    protected int uniqueOrderId;
    protected int orderQuantity;
    protected int accountId;
    protected long ean13;

    /**
     * Obtient la valeur de la propriété uniqueOrderId.
     * 
     */
    public int getUniqueOrderId() {
        return uniqueOrderId;
    }

    /**
     * Définit la valeur de la propriété uniqueOrderId.
     * 
     */
    public void setUniqueOrderId(int value) {
        this.uniqueOrderId = value;
    }

    /**
     * Obtient la valeur de la propriété orderQuantity.
     * 
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Définit la valeur de la propriété orderQuantity.
     * 
     */
    public void setOrderQuantity(int value) {
        this.orderQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété accountId.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Définit la valeur de la propriété accountId.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Obtient la valeur de la propriété ean13.
     * 
     */
    public long getEan13() {
        return ean13;
    }

    /**
     * Définit la valeur de la propriété ean13.
     * 
     */
    public void setEan13(long value) {
        this.ean13 = value;
    }

}
