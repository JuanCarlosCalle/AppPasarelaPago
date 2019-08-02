package com.udea.modelo;

import com.udea.modelo.Articulo;
import com.udea.modelo.Comprobante;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-31T10:15:10")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Integer> idTransaccion;
    public static volatile SingularAttribute<Transaccion, String> tipoTCredito;
    public static volatile SingularAttribute<Transaccion, String> fVenceTCredito;
    public static volatile SingularAttribute<Transaccion, String> duiCliente;
    public static volatile SingularAttribute<Transaccion, String> nombreCliente;
    public static volatile SingularAttribute<Transaccion, String> cvvTCredito;
    public static volatile CollectionAttribute<Transaccion, Articulo> articuloCollection;
    public static volatile SingularAttribute<Transaccion, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Transaccion, Comprobante> comprobante;
    public static volatile SingularAttribute<Transaccion, String> numTCredito;
    public static volatile SingularAttribute<Transaccion, String> email;

}