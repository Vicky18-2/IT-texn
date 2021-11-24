<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tns="http://nure/it-texn/pz">
    <xsl:output method="html" doctype-public="html"/>
    <xsl:template match="tns:tickets">
        <link rel="stylesheet" href="Tickets.css"/>
        <h2>Ticket</h2>
        <hr/>
        <xsl:for-each select="tns:ticket">
            <xsl:sort select="@id"/>
            <h2><xsl:number format="2"/>) id: <xsl:value-of select="@id"/></h2>
            <hr/>
            <p>Ticket price: <xsl:value-of select="tns:ticket_price"/></p>
            <p> Film name: <xsl:value-of select="tns:film/tns:title"/> </p>
            <p> Film director: <xsl:value-of select="tns:film/tns:director"/> </p>
            <p> Session date: <xsl:value-of select="tns:session/tns:session_date"/> </p>
            <p> Session time: <xsl:value-of select="tns:session/tns:session_time"/> </p>
            <xsl:apply-templates select="tns:ticket"/>
        </xsl:for-each>
        <xsl:call-template name="test"/>
    </xsl:template>
    <xsl:template name="test">
        <hr/>
    </xsl:template>

    <xsl:template match="tns:session">
        <ul>
            <li><xsl:value-of select="tns:session_date"/></li>
            <li><xsl:for-each select="tns:session_time">
                <xsl:value-of select="text()"/>

                <xsl:choose>
                    <xsl:when test="position() != last()">, </xsl:when>
                </xsl:choose>
            </xsl:for-each>
            </li>
            <li><xsl:value-of select="tns:film/tns:title"/></li>
        </ul>
    </xsl:template>
</xsl:stylesheet>

