package com.ITtexn.pz2.parsers;

public interface Default {
    String field_tickets= "tickets";
    String field_group_ticket = "ticket";
    String field_ticket_price = "ticket_price";
    String attr_id = "id";
    String field_group_session = "session";
    String field_session_date ="session_date";
    String field_session_time = "session_time";
    String field_group_film = "film";
    String field_title = "title";
    String field_director = "director";
    String field_film_duration = "film_duration";
    String field_description = "description";
    String field_genre = "genre";
    String field_language = "language";
    String field_group_hall = "hall";
    String field_hall_type = "hall_type";
    String field_column_id = "column_id";
    String field_seat_id = "seat_id";
    String field_session_date_and_time = "session_date_and_time";
    String attr_lang = "lang";

    String xml_file = "Ticket.xml";
    String xsd_file = "Ticket.xsd";
    Class<?> object_factory = com.ITtexn.pz2.classes.ObjectFactory.class;

    String tickets_namespace_url = "http://nure/it-texn/pz";
    String Sschema_location_attr_name= "schemaLocation";
    String Sschema_location_attr_fqn = "xsi:schemaLocation";
    String xsi_prefix= "xsi";
    String xsd_schema_location_url = "http://nure/it-texn/pz Ticket.xsd";

    // validation features
    public static final String FEATURE__TURN_VALIDATION_ON = "http://xml.org/sax/features/validation";
    public static final String FEATURE__TURN_SCHEMA_VALIDATION_ON = "http://apache.org/xml/features/validation/schema";
}
