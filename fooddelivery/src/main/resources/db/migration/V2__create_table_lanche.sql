create table lanche(
    id int primary key auto_increment,
    nome varchar(255),
    descricao varchar (255),
    igredientes varchar(255),
    preco decimal(8,2),
    restaurante_id int,
    FOREIGN KEY (restaurante_id) references restaurante(id)
)