	 /*1*/
	 select c.codigocliente, c.limitecredito, p.cantidad from clientes c, pagos p where c.limitecredito > p.cantidad;
	 /*2*/
	 select c.nombrecliente as 'Nombre Cliente', e.nombre as 'Nombre Empleado', o.ciudad as 'Ciudad' from clientes c, empleados e, oficinas o where e.codigoempleado = c.codigoempleadorepventas;
	 /*3*/
	 select c.nombrecliente as 'Nombre Cliente', e.nombre as 'Nombre Empleado', o.ciudad as 'Ciudad' from clientes c inner join  empleados e inner join oficinas o on e.codigoempleado = c.codigoempleadorepventas;
	 /*4*/
	 select c.nombrecliente, count(p.codigopedido) from clientes c inner join pedidos p on c.codigocliente = p.codigocliente group by 1;
	 /*5*/
	 select c.nombrecliente, count(p.codigopedido) from clientes c inner join pedidos p group by 1;
	 /*6*/
	 select e.nombre as 'Nombre empleado', e.apellido1 as 'Apellido empleado', c.nombrecliente as 'Cliente' from empleados e inner join clientes c inner join pagos p on p.formapago = 'Paypal' where c.codigoempleadorepventas = e.codigoempleado group by 3; select e.nombre as 'Nombre empleado', e.apellido1 as 'Apellido empleado', c.nombrecliente as 'Cliente', p.formapago from empleados e inner join clientes c inner join pagos p on p.formapago = 'Paypal' where c.codigoempleadorepventas = e.codigoempleado group by 3;
	 /*7*/
	 select o.ciudad, count(e.codigoempleado) as numero from oficinas o inner join empleados e on o.codigooficina = e.codigooficina group by 1;
	 /*8*/
	 /*mala pero valida por ahora*/
	 select e.nombre, e.apellido1, o.ciudad, e.puesto from empleados e inner join oficinas o on e.codigoOficina = o.codigooficina where e.puesto != 'representante ventas';
	 /*buena con subconsultas*/
	 select e.nombre, e.apellido1, o.ciudad, e.puesto from empleados e inner join oficinas o on e.codigoOficina = o.codigooficina where e.codigoempleado not in (select codigoempleadorepventas from clientes);
	 /*9*/
	 select c.nombrecliente, p.idtransaccion, p.fechapago from clientes c inner join pagos p on c.codigocliente = p.codigocliente where year(fechapago) = 2007;
	 /*10*/
	 /*funciona por el left join que se centra en la primera tabla, con inner join saldrían también los clientes que han pagado.*/
	 select c.nombrecliente, e.nombre, e.apellido1, e.apellido2 from clientes c inner join empleados e on c.codigoempleadorepventas = e.codigoempleado left join pagos p on c.codigocliente = p.codigocliente where p.codigocliente is null;
	 /*con subconsulta*/
	 select c.nombrecliente, e.nombre, e.apellido1, e.apellido2 from clientes c inner join empleados e on c.codigoempleadorepventas = e.codigoempleado where c.codigocliente not in (select codigocliente from pagos);
	 /*11*/
	 select p.codigoproducto, p.nombre, p.gama, substring(p.descripcion, 1, 10) as descripcion from productos p left join detallepedidos d on p.codigoproducto = d.codigoproducto where d.codigoproducto is null;
	 /*con subconsulta*/
	 select p.codigoproducto, p.nombre, p.gama, substring(p.descripcion, 1, 10) as descripcion from productos p left join detallepedidos d on p.codigoproducto = d.codigoproducto where p.codigoproducto not in (select codigoproducto from detallepedidos);
	 /*12*/
	 select e.nombre, e.apellido1, e.apellido2, o.codigopostal, o.ciudad from empleados e inner join oficinas o on e.codigooficina = o.codigooficina where o.ciudad = 'barcelona';
	 /*13*/
	 select p.codigoproducto, substring(p.descripcion, 1, 10) as descripcion, sum(d.cantidad) as cantidad from productos p inner join detallepedidos d on p.codigoproducto = d.codigoproducto group by 1;