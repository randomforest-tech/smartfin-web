-- begin POLICE_POLICE_RANK
create table POLICE_POLICE_RANK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end POLICE_POLICE_RANK
-- begin POLICE_POLICE_STATION
create table POLICE_POLICE_STATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PROVINCE_ID uuid,
    DISTRICT_ID uuid,
    ADDRESS text,
    CONTACT_NO1 varchar(255),
    CONTACT_NO2 varchar(255),
    --
    primary key (ID)
)^
-- end POLICE_POLICE_STATION
-- begin POLICE_OFFICER
create table POLICE_OFFICER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    POLICE_ID varchar(255),
    FULL_NAME varchar(255),
    RANK_ID uuid,
    POLICE_STATION_ID uuid,
    ADDRESS text,
    MOBILE varchar(255),
    HOME_PHONE varchar(255),
    OFFICE_PHONE1 varchar(255),
    OFFICE_PHONE2 varchar(255),
    --
    primary key (ID)
)^
-- end POLICE_OFFICER
-- begin POLICE_DISTRICT
create table POLICE_DISTRICT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end POLICE_DISTRICT
-- begin POLICE_FINE_TYPES
create table POLICE_FINE_TYPES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    DESCRIPTION varchar(255),
    FINE decimal(19, 2),
    --
    primary key (ID)
)^
-- end POLICE_FINE_TYPES
-- begin POLICE_FINES
create table POLICE_FINES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DRIVING_LICENSE_NO varchar(255),
    ISSUED_BY_ID uuid,
    ISSUED_TIME timestamp,
    FINE_TYPE_ID uuid,
    FINE decimal(19, 2),
    POLICE_STATION_ID uuid,
    PROVINCE_ID uuid,
    DISTRICT_ID uuid,
    LONGITUDE varchar(255),
    LATITUDE varchar(255),
    --
    primary key (ID)
)^
-- end POLICE_FINES
-- begin POLICE_FINE_SHEET
create table POLICE_FINE_SHEET (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BOOK_NO varchar(255),
    SERIAL_START_NO bigint,
    SERIAL_END_NUMBER bigint,
    POLICE_STATION_ID uuid,
    ISSUED_TO_ID uuid,
    ISSUED_DATE timestamp,
    ISSUED_BY_ID uuid,
    --
    primary key (ID)
)^
-- end POLICE_FINE_SHEET
-- begin POLICE_PROVINCE
create table POLICE_PROVINCE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end POLICE_PROVINCE
