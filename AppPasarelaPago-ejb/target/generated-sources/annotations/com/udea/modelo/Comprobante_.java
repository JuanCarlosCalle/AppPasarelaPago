package com.udea.modelo;

import com.udea.modelo.Transaccion;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-28T23:40:22")
@StaticMetamodel(Comprobante.class)
public class Comprobante_ { 

    public static volatile SingularAttribute<Comprobante, String> duiCliente;
    public static volatile SingularAttribute<Comprobante, BigDecimal> valorTransaccion;
    public static volatile SingularAttribute<Comprobante, Integer> idComprobante;
    public static volatile SingularAttribute<Comprobante, Transaccion> transaccion;
    public static volatile SingularAttribute<Comprobante, Date> fechaPago;

}