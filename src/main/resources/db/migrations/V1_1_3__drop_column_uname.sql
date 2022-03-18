alter table `user`
drop uname,
add username varchar(40) NOT NULL,
add constraint UNIQUE key `username_UNIQUE` (`username`);
