<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
                xmlns="http://nure/it-texn/pz"
                xmlns:tns="http://nure/it-texn/pz">
    <xsl:output method="html" doctype-public="html"/>
    <xsl:template match="tns:tickets/tns:ticket[@id ='1']">
        <html>
            <body>
                <head>
                    <title>Tickets</title>
                    <link rel="stylesheet" href="Ticket.css"/>
                </head>
                <xsl:apply-templates select="tns:tickets"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="tns:tickets">
        <h1>Tickets</h1>
        <table border="1">

            <th>id</th>
            <th>ticket_price</th>
            <th>session_date</th>
            <th>session_time</th>
            <th>title</th>
            <th>director</th>
            <th>film_duration</th>
            <th>description</th>
            <th>genre</th>
            <th>language</th>
            <th>hall_type</th>
            <th>column_id</th>
            <th>seat_id</th>


            <xsl:apply-templates select="tns:ticket"/>

        </table>

    </xsl:template>

    <xsl:template match="tns:ticket">

        <tr>

            <td>
                <xsl:value-of select="@id"/>
            </td>

            <td>
                <xsl:value-of select="tns:ticket_price"/>
            </td>


            <td>
                <xsl:value-of select="tns:session/tns:session_date"/>
            </td>

            <td>
                <xsl:value-of select="tns:session/tns:session_time"/>
            </td>

            <td>
                <xsl:value-of select="tns:film/tns:title"/>
            </td>

            <td>
                <xsl:value-of select="tns:film/tns:director"/>
            </td>

            <td>
                <xsl:value-of select="tns:film/tns:film_duration"/>
            </td>

            <td>
                <xsl:value-of select="tns:film/tns:description"/>
            </td>

            <td>
                <xsl:value-of select="tns:film/tns:genre"/>
            </td>

            <td>
                <xsl:value-of select="tns:film/tns:language"/>
            </td>

            <td>
                <xsl:value-of select="tns:hall/tns:hall_type"/>
            </td>

            <td>
                <xsl:value-of select="tns:hall/tns:column_id"/>
            </td>

            <td>
                <xsl:value-of select="tns:hall/tns:seat_id"/>
            </td>

        </tr>

    </xsl:template>

</xsl:stylesheet>
