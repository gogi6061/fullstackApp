create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id  bigserial not null, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id  bigserial not null, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id  bigserial not null, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id  bigserial not null, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
create table comment (id int8 generated by default as identity, created_date timestamp, message text not null, user_id int8 not null, username varchar(255) not null, post_id int8, primary key (id))
create table image_model (id int8 generated by default as identity, image_bytes LONGBLOB, name varchar(255) not null, post_id int8, user_id int8, primary key (id))
create table post (id int8 generated by default as identity, caption varchar(255), create_date timestamp, likes int4 not null, location varchar(255), title varchar(255), user_id int8, primary key (id))
create table post_linked_users (post_id int8 not null, linked_users varchar(255))
create table user (id int8 generated by default as identity, bio text, create_date timestamp, email varchar(255), lastname varchar(255) not null, name varchar(255) not null, password varchar(3000), username varchar(255), primary key (id))
create table user_role (user_id int8 not null, role int4)
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table if exists user add constraint UK_sb8bbouer5wak8vyiiy4pf2bx unique (username)
alter table if exists comment add constraint FKs1slvnkuemjsq2kj4h3vhx7i1 foreign key (post_id) references post
alter table if exists post add constraint FK72mt33dhhs48hf9gcqrq4fxte foreign key (user_id) references user
alter table if exists post_linked_users add constraint FK80rak124w4qynm5nxkwawi5gj foreign key (post_id) references post
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user
