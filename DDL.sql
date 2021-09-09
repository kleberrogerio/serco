create schema serco;

use serco;


create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on loja.* to user@'localhost';
