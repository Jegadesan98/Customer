create database customer_db;

use customer_db;

create table customer (
  CustId int auto_increment not null ,
  Custname varchar(20),
  CustLoc varchar(20),
  CustEmailId varchar(20),
  CustAadharNum varchar(20),
  CustContactNum varchar(10),
  constraint customer_pk primary key (CustId)
);

insert into customer values (100,'steven','dindigul','steven@gmaill.com', '123843938439','1234567890');
insert into customer values (102,'kevin','maduari','kevin@gmail.com', '123843938009','1234567891');
insert into customer values (103,'john','coimbatore','john@gmail.com', '123843938499','1234567895');
insert into customer values (104,'chan','chennai','chan@gmail.com','123843938400','1234567893' );
insert into customer values (105,'jill','trichy','jill@gmail.com', '123843938411','1234567892');

create table Contact(
  custPersonId int not null,
  FrndName varchar(20),
  FrndEmailId varchar(20),
  FrndphoneNumber varchar(10),
  CustomerID int,
  constraint Contact_pk primary key(custPersonId),
  constraint fk_Contact_Customer foreign key (CustomerID) references customer(CustId)
);



insert into Contact values(120,'jack','jack@gmail.com','1234567893' ,100);
insert into Contact values(121,'vick','vick@gmail.com','1234567809'  ,100);
insert into Contact values(122,'mark','mark@gmail.com','1234567223'  ,104);
insert into Contact values(123,'ent','ent@gmail.com','1234567111'  ,103);


commit;


select * from Contact;
select * from customer;
