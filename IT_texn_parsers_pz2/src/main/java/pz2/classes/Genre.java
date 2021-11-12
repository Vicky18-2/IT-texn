
package com.ITtexn.pz2.classes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "genre", namespace = "http://nure/it-texn/pz")
@XmlEnum
public enum Genre {

    @XmlEnumValue("Mystery")
    MYSTERY("Mystery"),
    @XmlEnumValue("Comedy")
    COMEDY("Comedy"),
    @XmlEnumValue("Fantasy")
    FANTASY("Fantasy"),
    @XmlEnumValue("Fiction")
    FICTION("Fiction"),
    @XmlEnumValue("Drama")
    DRAMA("Drama"),
    @XmlEnumValue("Horror")
    HORROR("Horror");
    private final String value;

    Genre(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Genre fromValue(String v) {
        for (Genre c: Genre.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
