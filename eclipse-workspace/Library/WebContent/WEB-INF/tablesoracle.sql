CREATE TABLE  "E_BOOK" 
   (	"LIBNO" VARCHAR(4000),	
   "CALLNO" VARCHAR2(4000), 
	"NAME" VARCHAR2(4000), 
	"AUTHOR" VARCHAR2(4000), 
	"PUBLISHER" VARCHAR2(4000), 
	"QUANTITY" NUMBER, 
	"ISSUED" NUMBER, 
	 CONSTRAINT "E_BOOK_PK" PRIMARY KEY ("CALLNO") ENABLE
   )
/
CREATE TABLE  "E_LIBRARIAN" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(4000), 
	"PASSWORD" VARCHAR2(4000), 
	"EMAIL" VARCHAR2(4000), 
	"ALTERNATE EMAILID" VARCHAR2(4000),
	"PASSWORD" VARCHAR2(4000),
	"MOBILE" NUMBER, 
	 CONSTRAINT "E_LIBRARIAN_PK" PRIMARY KEY ("ID") ENABLE
   )
/
Note: ID must be generated through sequence in E_LIBRARIAN table.

CREATE TABLE  "E_ISSUEBOOK" 
   (	"CALLNO" VARCHAR2(4000) NOT NULL ENABLE, 
	"STUDENTID" VARCHAR2(4000) NOT NULL ENABLE, 
	"STUDENTNAME" VARCHAR2(4000), 
	"STUDENTMOBILE" NUMBER,
	"ISBN" VARCHAR2(4000),
	"MAILID" VARCHAR2(4000),
	"ISSUEDDATE" DATE, 
	"RETURNSTATUS" VARCHAR2(4000)
   )
/


