# AttendanceManagement

 My project name : AttendanceManagement
 
 
 Database and table query:
   
   create database Attendance;
   
 Table design(query);
  
  Register Table:
    create table register(userId int(50),firstname varchar(200),lastname varchar(200),
    email varchar(50),password varchar(50),cfmpassword varchar(50),primary key(userId));

   contants:
     CREATE TABLE `contacts` (
    `contact_id` int(11) NOT NULL auto_increment,
    `firstname` varchar(45) default NULL,
    `lastname` varchar(45) default NULL,
    `photo` mediumblob,
     PRIMARY KEY  (`contact_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1
    
    employee table :
    
    this error coding database table (pls exp nullpointer exception) 
    package Name:detailspackage

    CREATE TABLE `details` (
    `userId` int(50) NOT NULL auto_increment,
    `name` varchar(200) default NULL,
    `email` varchar(50) default NULL,
    `address` varchar(200) default NULL,
    `ctz` varchar(200) default NULL,
    `gschool` varchar(200) default NULL,
    `date` varchar(50) default NULL,
    `photo` blob,
     PRIMARY KEY  (`userId`)
     ) ENGINE=InnoDB DEFAULT CHARSET=latin1
