alter table role
add constraint primary key(roles);

alter table `user`
add role varchar(10) not null,
add constraint FOREIGN KEY(role) references role(roles);
