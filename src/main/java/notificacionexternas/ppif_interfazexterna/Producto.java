/*************************************************************/
/* Copyright (C) 2017 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: SAS Institute Argentina S.A., Buenos Aires - Project-based, License 16288 16288,
 * only for project "Developed solutions (Products) and services for Customer's Customer A - Telefonica Moviles del Uruguay Sociedad Anonima". */
/* Abstract syntax: notificacionexternas */
/* ASN.1 Java project: notificacionexternas.Notificacionexternas */
/* Created: Mon Dec 11 16:05:39 2017 */
/* ASN.1 Compiler for Java version: 7.0 */
/* ASN.1 compiler options and file names specified:
 * -output notificacionexternas -ber -der -cer -root -noSampleCode
 * -messageFormat msvc /home/osboxes/Mauro/notificacionExternas.asn
 */


package notificacionexternas.ppif_interfazexterna;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Producto from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class Producto extends Sequence {

    /**
     * The default constructor.
     */
    public Producto()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public Producto(PrintableString codProducto,
		    PrintableString fechaInicioProd,
		    PrintableString fechaFinProd, ProdCancelado prodCancelado,
		    ListActBeneficio listActBeneficio,
		    ListActBeneficioFallido listActBeneficioFallido,
		    PrintableString secuenciaActPer, INTEGER64 importeRenta)
    {
	setCodProducto(codProducto);
	setFechaInicioProd(fechaInicioProd);
	setFechaFinProd(fechaFinProd);
	setProdCancelado(prodCancelado);
	setListActBeneficio(listActBeneficio);
	setListActBeneficioFallido(listActBeneficioFallido);
	setSecuenciaActPer(secuenciaActPer);
	setImporteRenta(importeRenta);
    }

    /**
     * Construct with required components.
     */
    public Producto(PrintableString codProducto)
    {
	setCodProducto(codProducto);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new PrintableString();
	mComponents[3] = new ProdCancelado();
	mComponents[4] = new ListActBeneficio();
	mComponents[5] = new ListActBeneficioFallido();
	mComponents[6] = new PrintableString();
	mComponents[7] = new INTEGER64();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrintableString();
	    case 1:
		return new PrintableString();
	    case 2:
		return new PrintableString();
	    case 3:
		return new ProdCancelado();
	    case 4:
		return new ListActBeneficio();
	    case 5:
		return new ListActBeneficioFallido();
	    case 6:
		return new PrintableString();
	    case 7:
		return new INTEGER64();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "codProducto"
    public PrintableString getCodProducto()
    {
	return (PrintableString)mComponents[0];
    }

    public void setCodProducto(PrintableString codProducto)
    {
	mComponents[0] = codProducto;
    }


    // Methods for field "fechaInicioProd"
    public PrintableString getFechaInicioProd()
    {
	return (PrintableString)mComponents[1];
    }

    public void setFechaInicioProd(PrintableString fechaInicioProd)
    {
	mComponents[1] = fechaInicioProd;
    }

    public boolean hasFechaInicioProd()
    {
	return componentIsPresent(1);
    }

    public void deleteFechaInicioProd()
    {
	setComponentAbsent(1);
    }


    // Methods for field "fechaFinProd"
    public PrintableString getFechaFinProd()
    {
	return (PrintableString)mComponents[2];
    }

    public void setFechaFinProd(PrintableString fechaFinProd)
    {
	mComponents[2] = fechaFinProd;
    }

    public boolean hasFechaFinProd()
    {
	return componentIsPresent(2);
    }

    public void deleteFechaFinProd()
    {
	setComponentAbsent(2);
    }


    // Methods for field "prodCancelado"
    public ProdCancelado getProdCancelado()
    {
	return (ProdCancelado)mComponents[3];
    }

    public void setProdCancelado(ProdCancelado prodCancelado)
    {
	mComponents[3] = prodCancelado;
    }

    public boolean hasProdCancelado()
    {
	return componentIsPresent(3);
    }

    public void deleteProdCancelado()
    {
	setComponentAbsent(3);
    }



    /**
     * Define the ASN1 Type ProdCancelado from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ProdCancelado extends SequenceOf<PrintableString> {

	/**
	 * The default constructor.
	 */
	public ProdCancelado()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ProdCancelado(PrintableString[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PrintableString();
	}

	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"Producto$ProdCancelado"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    798739,
	    null,
	    null,
	    new TypeInfoRef (
		new KMCStringInfo (
		    new Tags (
			new short[] {
			    0x0013
			}
		    ),
		    new QName (
			"com.oss.asn1",
			"PrintableString"
		    ),
		    new QName (
			"builtin",
			"PrintableString"
		    ),
		    798739,
		    new Intersection (
			new SizeConstraint (
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(1),
				    new INTEGER(16),
				    0
				)
			    )
			),
			new PermittedAlphabetConstraint (
			    PrintableStringPAInfo.pa
			)
		    ),
		    null,
		    null
		)
	    )
	);

	/**
	 * Get the type descriptor (TypeInfo) of 'this' ProdCancelado object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ProdCancelado object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ProdCancelado

    // Methods for field "listActBeneficio"
    public ListActBeneficio getListActBeneficio()
    {
	return (ListActBeneficio)mComponents[4];
    }

    public void setListActBeneficio(ListActBeneficio listActBeneficio)
    {
	mComponents[4] = listActBeneficio;
    }

    public boolean hasListActBeneficio()
    {
	return componentIsPresent(4);
    }

    public void deleteListActBeneficio()
    {
	setComponentAbsent(4);
    }



    /**
     * Define the ASN1 Type ListActBeneficio from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListActBeneficio extends SequenceOf<PrintableString> {

	/**
	 * The default constructor.
	 */
	public ListActBeneficio()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListActBeneficio(PrintableString[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PrintableString();
	}

	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"Producto$ListActBeneficio"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    798739,
	    null,
	    null,
	    new TypeInfoRef (
		new KMCStringInfo (
		    new Tags (
			new short[] {
			    0x0013
			}
		    ),
		    new QName (
			"com.oss.asn1",
			"PrintableString"
		    ),
		    new QName (
			"builtin",
			"PrintableString"
		    ),
		    798739,
		    new Intersection (
			new SizeConstraint (
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(1),
				    new INTEGER(16),
				    0
				)
			    )
			),
			new PermittedAlphabetConstraint (
			    PrintableStringPAInfo.pa
			)
		    ),
		    null,
		    null
		)
	    )
	);

	/**
	 * Get the type descriptor (TypeInfo) of 'this' ListActBeneficio object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ListActBeneficio object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ListActBeneficio

    // Methods for field "listActBeneficioFallido"
    public ListActBeneficioFallido getListActBeneficioFallido()
    {
	return (ListActBeneficioFallido)mComponents[5];
    }

    public void setListActBeneficioFallido(ListActBeneficioFallido listActBeneficioFallido)
    {
	mComponents[5] = listActBeneficioFallido;
    }

    public boolean hasListActBeneficioFallido()
    {
	return componentIsPresent(5);
    }

    public void deleteListActBeneficioFallido()
    {
	setComponentAbsent(5);
    }



    /**
     * Define the ASN1 Type ListActBeneficioFallido from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListActBeneficioFallido extends SequenceOf<PrintableString> {

	/**
	 * The default constructor.
	 */
	public ListActBeneficioFallido()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListActBeneficioFallido(PrintableString[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PrintableString();
	}

	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"Producto$ListActBeneficioFallido"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    798739,
	    null,
	    null,
	    new TypeInfoRef (
		new KMCStringInfo (
		    new Tags (
			new short[] {
			    0x0013
			}
		    ),
		    new QName (
			"com.oss.asn1",
			"PrintableString"
		    ),
		    new QName (
			"builtin",
			"PrintableString"
		    ),
		    798739,
		    new Intersection (
			new SizeConstraint (
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(1),
				    new INTEGER(16),
				    0
				)
			    )
			),
			new PermittedAlphabetConstraint (
			    PrintableStringPAInfo.pa
			)
		    ),
		    null,
		    null
		)
	    )
	);

	/**
	 * Get the type descriptor (TypeInfo) of 'this' ListActBeneficioFallido object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ListActBeneficioFallido object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ListActBeneficioFallido

    // Methods for field "secuenciaActPer"
    public PrintableString getSecuenciaActPer()
    {
	return (PrintableString)mComponents[6];
    }

    public void setSecuenciaActPer(PrintableString secuenciaActPer)
    {
	mComponents[6] = secuenciaActPer;
    }

    public boolean hasSecuenciaActPer()
    {
	return componentIsPresent(6);
    }

    public void deleteSecuenciaActPer()
    {
	setComponentAbsent(6);
    }


    // Methods for field "importeRenta"
    public INTEGER64 getImporteRenta()
    {
	return (INTEGER64)mComponents[7];
    }

    public void setImporteRenta(INTEGER64 importeRenta)
    {
	mComponents[7] = importeRenta;
    }

    public boolean hasImporteRenta()
    {
	return componentIsPresent(7);
    }

    public void deleteImporteRenta()
    {
	setComponentAbsent(7);
    }


    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "notificacionexternas.ppif_interfazexterna",
	    "Producto"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "Producto"
	),
	798739,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "codProducto",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(16)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "fechaInicioProd",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(16)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "fechaFinProd",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Producto$ProdCancelado"
			)
		    ),
		    "prodCancelado",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Producto$ListActBeneficio"
			)
		    ),
		    "listActBeneficio",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Producto$ListActBeneficioFallido"
			)
		    ),
		    "listActBeneficioFallido",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    798739,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(16),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "secuenciaActPer",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"INTEGER64"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"INTEGER64"
			    ),
			    798739,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(8),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "importeRenta",
		    7,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 1),
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5),
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x800a, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5),
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x800a, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5),
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x800a, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5),
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x800a, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 5),
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x800a, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x800a, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 7)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' Producto object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' Producto object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for Producto
