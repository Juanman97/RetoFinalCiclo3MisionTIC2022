drop database if exists veterinaria ;
create schema veterinaria;
use veterinaria;
create table cita(
citaId int primary key auto_increment,
citaFecha datetime not null,
citaDescripcion varchar(180),
mascotaId int references mascota(mascotaId)
);
create table propietario(
propUsuario varchar(30) not null primary key,
propApellido varchar(30) not null default ' ',
propNombre varchar(30) not null,
propTelefono char(25) null
);
create table mascota(
mascotaId int primary key auto_increment,
mascotaNombre char(30) not null,
propUsuario varchar(30) references propietario(propUsuario)
);
insert into cita(citaFecha, citaDescripcion, mascotaId) values ('2021-08-01 15:30:00', "El gato se encuentra con un peso normal y en su cita de control de ojos al parecer la catarata se detuvo", 1);
insert into cita(citaFecha, citaDescripcion, mascotaId) values ('2021-08-02 18:30:00', "Merlín presenta halitosis reflejo de un problema localizado en la boca o incluso de algún problema del aparato digestivo.", 2);
insert into cita(citaFecha, citaDescripcion, mascotaId) values ('2021-06-30 04:30:20', "El pronóstico es reservado. Presenta molestias bucales (gingivitis), vómitos, fiebre. Se deja en hospitalización.", 4);
insert into cita(citaFecha, citaDescripcion, mascotaId) values ('2021-08-13 16:30:20', "Viene para el programa de perritos de la tercera edad", 5);

insert into propietario(propUsuario, propApellido, propNombre, propTelefono) values ("vincent", "Vanghogh", "Vicente", "3221234564");
insert into propietario(propUsuario, propApellido, propNombre, propTelefono) values ("dantonito", "Antony", "Diego", "3133151232");
insert into propietario(propUsuario, propApellido, propNombre, propTelefono) values ("haylee", "Lee", "Hayo", "3192212121");
insert into propietario(propUsuario, propApellido, propNombre, propTelefono) values ("cristop", "Rojas", "Christopher", "2927272 ext 333");
insert into propietario(propUsuario, propApellido, propNombre, propTelefono) values ("JReina", "Reina", "Johan", "+549 4984445413");

insert into mascota(mascotaNombre, propUsuario) values ("Sam", "JReina");
insert into mascota(mascotaNombre, propUsuario) values ("Merlín", "cristop");
insert into mascota(mascotaNombre, propUsuario) values ("Toby", "JReina");
insert into mascota(mascotaNombre, propUsuario) values ("Kira", "dantonito");
insert into mascota(mascotaNombre, propUsuario) values ("Sasha", "vincent");
insert into mascota(mascotaNombre, propUsuario) values ("Tribilín", "dantonito");

insert into mascota(mascotaNombre, propUsuario) values ("Molly", "dantonito");
insert into mascota(mascotaNombre, propUsuario) values ("Max", "JReina");
insert into mascota(mascotaNombre, propUsuario) values ("Thor", "cristop");
insert into mascota(mascotaNombre, propUsuario) values ("Nina", "vincent");
insert into mascota(mascotaNombre, propUsuario) values ("Firulais", "dantonito");
insert into mascota(mascotaNombre, propUsuario) values ("Lola", "vincent");
insert into mascota(mascotaNombre, propUsuario) values ("Tati", "JReina");
insert into mascota(mascotaNombre, propUsuario) values ("Manchas", "haylee");
insert into mascota(mascotaNombre, propUsuario) values ("Jordan", "haylee");
insert into mascota(mascotaNombre, propUsuario) values ("Mimi", "haylee");
insert into mascota(mascotaNombre, propUsuario) values ("Linda", "vincent");
