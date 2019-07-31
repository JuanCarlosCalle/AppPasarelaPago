package com.udea.modelo;

import com.udea.modelo.Transaccion;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-30T20:49:53")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, String> descripcion;
    public static volatile SingularAttribute<Articulo, Integer> existencia;
    public static volatile SingularAttribute<Articulo, String> codigo;
    public static volatile SingularAttribute<Articulo, BigDecimal> precioCliente;
    public static volatile SingularAttribute<Articulo, BigDecimal> precioProveedor;
    public static volatile SingularAttribute<Articulo, String> nombre;
    public static volatile CollectionAttribute<Articulo, Transaccion> transaccionCollection;

}