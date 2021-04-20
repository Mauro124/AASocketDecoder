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
 * Define the ASN1 Type Ajuste from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class Ajuste extends Sequence {

    /**
     * The default constructor.
     */
    public Ajuste()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public Ajuste(ListOfBalances listOfBalances, ListaDeuda listaDeuda,
		    PrintableString codCausaAjuste,
		    PrintableString desCausaAjuste, BOOLEAN flgBlockDebt)
    {
	setListOfBalances(listOfBalances);
	setListaDeuda(listaDeuda);
	setCodCausaAjuste(codCausaAjuste);
	setDesCausaAjuste(desCausaAjuste);
	setFlgBlockDebt(flgBlockDebt);
    }

    /**
     * Construct with components.
     */
    public Ajuste(ListOfBalances listOfBalances, ListaDeuda listaDeuda,
		    PrintableString codCausaAjuste,
		    PrintableString desCausaAjuste, boolean flgBlockDebt)
    {
	this(listOfBalances, listaDeuda, codCausaAjuste, desCausaAjuste,
	     new BOOLEAN(flgBlockDebt));
    }

    public void initComponents()
    {
	mComponents[0] = new ListOfBalances();
	mComponents[1] = new ListaDeuda();
	mComponents[2] = new PrintableString();
	mComponents[3] = new PrintableString();
	mComponents[4] = new BOOLEAN();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ListOfBalances();
	    case 1:
		return new ListaDeuda();
	    case 2:
		return new PrintableString();
	    case 3:
		return new PrintableString();
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "listOfBalances"
    public ListOfBalances getListOfBalances()
    {
	return (ListOfBalances)mComponents[0];
    }

    public void setListOfBalances(ListOfBalances listOfBalances)
    {
	mComponents[0] = listOfBalances;
    }

    public boolean hasListOfBalances()
    {
	return componentIsPresent(0);
    }

    public void deleteListOfBalances()
    {
	setComponentAbsent(0);
    }



    /**
     * Define the ASN1 Type ListOfBalances from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListOfBalances extends SequenceOf<Balance> {

	/**
	 * The default constructor.
	 */
	public ListOfBalances()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListOfBalances(Balance[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Balance();
	}

	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"Ajuste$ListOfBalances"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    798739,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "notificacionexternas.ppif_interfazexterna",
		    "Balance"
		)
	    )
	);

	/**
	 * Get the type descriptor (TypeInfo) of 'this' ListOfBalances object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ListOfBalances object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ListOfBalances

    // Methods for field "listaDeuda"
    public ListaDeuda getListaDeuda()
    {
	return (ListaDeuda)mComponents[1];
    }

    public void setListaDeuda(ListaDeuda listaDeuda)
    {
	mComponents[1] = listaDeuda;
    }

    public boolean hasListaDeuda()
    {
	return componentIsPresent(1);
    }

    public void deleteListaDeuda()
    {
	setComponentAbsent(1);
    }



    /**
     * Define the ASN1 Type ListaDeuda from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListaDeuda extends SequenceOf<Deuda> {

	/**
	 * The default constructor.
	 */
	public ListaDeuda()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListaDeuda(Deuda[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Deuda();
	}

	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"Ajuste$ListaDeuda"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    798739,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "notificacionexternas.ppif_interfazexterna",
		    "Deuda"
		)
	    )
	);

	/**
	 * Get the type descriptor (TypeInfo) of 'this' ListaDeuda object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ListaDeuda object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ListaDeuda

    // Methods for field "codCausaAjuste"
    public PrintableString getCodCausaAjuste()
    {
	return (PrintableString)mComponents[2];
    }

    public void setCodCausaAjuste(PrintableString codCausaAjuste)
    {
	mComponents[2] = codCausaAjuste;
    }

    public boolean hasCodCausaAjuste()
    {
	return componentIsPresent(2);
    }

    public void deleteCodCausaAjuste()
    {
	setComponentAbsent(2);
    }


    // Methods for field "desCausaAjuste"
    public PrintableString getDesCausaAjuste()
    {
	return (PrintableString)mComponents[3];
    }

    public void setDesCausaAjuste(PrintableString desCausaAjuste)
    {
	mComponents[3] = desCausaAjuste;
    }

    public boolean hasDesCausaAjuste()
    {
	return componentIsPresent(3);
    }

    public void deleteDesCausaAjuste()
    {
	setComponentAbsent(3);
    }


    // Methods for field "flgBlockDebt"
    public boolean getFlgBlockDebt()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }

    public void setFlgBlockDebt(boolean flgBlockDebt)
    {
	setFlgBlockDebt(new BOOLEAN(flgBlockDebt));
    }

    public void setFlgBlockDebt(BOOLEAN flgBlockDebt)
    {
	mComponents[4] = flgBlockDebt;
    }

    public boolean hasFlgBlockDebt()
    {
	return componentIsPresent(4);
    }

    public void deleteFlgBlockDebt()
    {
	setComponentAbsent(4);
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
	    "Ajuste"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "Ajuste"
	),
	798739,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Ajuste$ListOfBalances"
			)
		    ),
		    "listOfBalances",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Ajuste$ListaDeuda"
			)
		    ),
		    "listaDeuda",
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(4),
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
		    "codCausaAjuste",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
					    new INTEGER(40),
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
		    "desCausaAjuste",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    798739,
			    null
			)
		    ),
		    "flgBlockDebt",
		    4,
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
			new TagDecoderElement((short)0x8001, 0),
			new TagDecoderElement((short)0x8002, 1),
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8006, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 1),
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8006, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8006, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8006, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 4)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' Ajuste object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' Ajuste object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for Ajuste
