
package com.ITtexn.pz3.client.film_cl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="genre">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MYSTERY"/>
 *     &lt;enumeration value="COMEDY"/>
 *     &lt;enumeration value="FANTASY"/>
 *     &lt;enumeration value="FICTION"/>
 *     &lt;enumeration value="DRAMA"/>
 *     &lt;enumeration value="HORROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genre")
@XmlEnum
public enum Genre {

    MYSTERY,
    COMEDY,
    FANTASY,
    FICTION,
    DRAMA,
    HORROR;

    public String value() {
        return name();
    }

    public static Genre fromValue(String v) {
        return valueOf(v);
    }

}
