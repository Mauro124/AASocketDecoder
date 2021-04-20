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
 * Define the ASN1 Type Recarga from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class Recarga extends Sequence {

    /**
     * The default constructor.
     */
    public Recarga()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public Recarga(PrintableString codOrigReca, BOOLEAN flagPromocional,
		    BOOLEAN flagPeriodifica, ListOfBalances listOfBalances,
		    BOOLEAN flagLastCycle, BOOLEAN flagFirstTopUp,
		    InfoAdicionalRecargas infoAdicional,
		    ListaDeudas listaDeudas, Null partialRecharge,
		    PrintableString serialNumber, BOOLEAN flgBlockDebt)
    {
	setCodOrigReca(codOrigReca);
	setFlagPromocional(flagPromocional);
	setFlagPeriodifica(flagPeriodifica);
	setListOfBalances(listOfBalances);
	setFlagLastCycle(flagLastCycle);
	setFlagFirstTopUp(flagFirstTopUp);
	setInfoAdicional(infoAdicional);
	setListaDeudas(listaDeudas);
	setPartialRecharge(partialRecharge);
	setSerialNumber(serialNumber);
	setFlgBlockDebt(flgBlockDebt);
    }

    /**
     * Construct with components.
     */
    public Recarga(PrintableString codOrigReca, boolean flagPromocional,
		    boolean flagPeriodifica, ListOfBalances listOfBalances,
		    boolean flagLastCycle, boolean flagFirstTopUp,
		    InfoAdicionalRecargas infoAdicional,
		    ListaDeudas listaDeudas, Null partialRecharge,
		    PrintableString serialNumber, boolean flgBlockDebt)
    {
	this(codOrigReca, new BOOLEAN(flagPromocional),
	     new BOOLEAN(flagPeriodifica), listOfBalances,
	     new BOOLEAN(flagLastCycle), new BOOLEAN(flagFirstTopUp),
	     infoAdicional, listaDeudas, partialRecharge, serialNumber,
	     new BOOLEAN(flgBlockDebt));
    }

    /**
     * Construct with required components.
     */
    public Recarga(PrintableString codOrigReca, boolean flagPromocional,
		    boolean flagPeriodifica, boolean flagFirstTopUp)
    {
	setCodOrigReca(codOrigReca);
	setFlagPromocional(flagPromocional);
	setFlagPeriodifica(flagPeriodifica);
	setFlagFirstTopUp(flagFirstTopUp);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new ListOfBalances();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new InfoAdicionalRecargas();
	mComponents[7] = new ListaDeudas();
	mComponents[8] = new Null();
	mComponents[9] = new PrintableString();
	mComponents[10] = new BOOLEAN();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrintableString();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new ListOfBalances();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new InfoAdicionalRecargas();
	    case 7:
		return new ListaDeudas();
	    case 8:
		return new Null();
	    case 9:
		return new PrintableString();
	    case 10:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "codOrigReca"
    public PrintableString getCodOrigReca()
    {
	return (PrintableString)mComponents[0];
    }

    public void setCodOrigReca(PrintableString codOrigReca)
    {
	mComponents[0] = codOrigReca;
    }


    // Methods for field "flagPromocional"
    public boolean getFlagPromocional()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }

    public void setFlagPromocional(boolean flagPromocional)
    {
	setFlagPromocional(new BOOLEAN(flagPromocional));
    }

    public void setFlagPromocional(BOOLEAN flagPromocional)
    {
	mComponents[1] = flagPromocional;
    }


    // Methods for field "flagPeriodifica"
    public boolean getFlagPeriodifica()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }

    public void setFlagPeriodifica(boolean flagPeriodifica)
    {
	setFlagPeriodifica(new BOOLEAN(flagPeriodifica));
    }

    public void setFlagPeriodifica(BOOLEAN flagPeriodifica)
    {
	mComponents[2] = flagPeriodifica;
    }


    // Methods for field "listOfBalances"
    public ListOfBalances getListOfBalances()
    {
	return (ListOfBalances)mComponents[3];
    }

    public void setListOfBalances(ListOfBalances listOfBalances)
    {
	mComponents[3] = listOfBalances;
    }

    public boolean hasListOfBalances()
    {
	return componentIsPresent(3);
    }

    public void deleteListOfBalances()
    {
	setComponentAbsent(3);
    }



    /**
     * Define the ASN1 Type ListOfBalances from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListOfBalances extends SequenceOf<BalanceRecarga> {

	/**
	 * The default constructor.
	 */
	public ListOfBalances()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListOfBalances(BalanceRecarga[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new BalanceRecarga();
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
		"Recarga$ListOfBalances"
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
		    "BalanceRecarga"
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

    // Methods for field "flagLastCycle"
    public boolean getFlagLastCycle()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }

    public void setFlagLastCycle(boolean flagLastCycle)
    {
	setFlagLastCycle(new BOOLEAN(flagLastCycle));
    }

    public void setFlagLastCycle(BOOLEAN flagLastCycle)
    {
	mComponents[4] = flagLastCycle;
    }

    public boolean hasFlagLastCycle()
    {
	return componentIsPresent(4);
    }

    public void deleteFlagLastCycle()
    {
	setComponentAbsent(4);
    }


    // Methods for field "flagFirstTopUp"
    public boolean getFlagFirstTopUp()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }

    public void setFlagFirstTopUp(boolean flagFirstTopUp)
    {
	setFlagFirstTopUp(new BOOLEAN(flagFirstTopUp));
    }

    public void setFlagFirstTopUp(BOOLEAN flagFirstTopUp)
    {
	mComponents[5] = flagFirstTopUp;
    }


    // Methods for field "infoAdicional"
    public InfoAdicionalRecargas getInfoAdicional()
    {
	return (InfoAdicionalRecargas)mComponents[6];
    }

    public void setInfoAdicional(InfoAdicionalRecargas infoAdicional)
    {
	mComponents[6] = infoAdicional;
    }

    public boolean hasInfoAdicional()
    {
	return componentIsPresent(6);
    }

    public void deleteInfoAdicional()
    {
	setComponentAbsent(6);
    }


    // Methods for field "listaDeudas"
    public ListaDeudas getListaDeudas()
    {
	return (ListaDeudas)mComponents[7];
    }

    public void setListaDeudas(ListaDeudas listaDeudas)
    {
	mComponents[7] = listaDeudas;
    }

    public boolean hasListaDeudas()
    {
	return componentIsPresent(7);
    }

    public void deleteListaDeudas()
    {
	setComponentAbsent(7);
    }



    /**
     * Define the ASN1 Type ListaDeudas from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListaDeudas extends SequenceOf<Deuda> {

	/**
	 * The default constructor.
	 */
	public ListaDeudas()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListaDeudas(Deuda[] elements)
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
		    (short)0x8008
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"Recarga$ListaDeudas"
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
	 * Get the type descriptor (TypeInfo) of 'this' ListaDeudas object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ListaDeudas object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ListaDeudas

    // Methods for field "partialRecharge"
    public Null getPartialRecharge()
    {
	return (Null)mComponents[8];
    }

    public void setPartialRecharge(Null partialRecharge)
    {
	mComponents[8] = partialRecharge;
    }

    public boolean hasPartialRecharge()
    {
	return componentIsPresent(8);
    }

    public void deletePartialRecharge()
    {
	setComponentAbsent(8);
    }


    // Methods for field "serialNumber"
    public PrintableString getSerialNumber()
    {
	return (PrintableString)mComponents[9];
    }

    public void setSerialNumber(PrintableString serialNumber)
    {
	mComponents[9] = serialNumber;
    }

    public boolean hasSerialNumber()
    {
	return componentIsPresent(9);
    }

    public void deleteSerialNumber()
    {
	setComponentAbsent(9);
    }


    // Methods for field "flgBlockDebt"
    public boolean getFlgBlockDebt()
    {
	return ((BOOLEAN)mComponents[10]).booleanValue();
    }

    public void setFlgBlockDebt(boolean flgBlockDebt)
    {
	setFlgBlockDebt(new BOOLEAN(flgBlockDebt));
    }

    public void setFlgBlockDebt(BOOLEAN flgBlockDebt)
    {
	mComponents[10] = flgBlockDebt;
    }

    public boolean hasFlgBlockDebt()
    {
	return componentIsPresent(10);
    }

    public void deleteFlgBlockDebt()
    {
	setComponentAbsent(10);
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
	    "Recarga"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "Recarga"
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
		    "codOrigReca",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "flagPromocional",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "flagPeriodifica",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Recarga$ListOfBalances"
			)
		    ),
		    "listOfBalances",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "flagLastCycle",
		    4,
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
		    "flagFirstTopUp",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"InfoAdicionalRecargas"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"InfoAdicionalRecargas"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "InfoAdicionalRecargas"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8001, 0)
				}
			    )
			)
		    ),
		    "infoAdicional",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "Recarga$ListaDeudas"
			)
		    ),
		    "listaDeudas",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    1847315,
			    null
			)
		    ),
		    "partialRecharge",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "serialNumber",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    10,
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
			new TagDecoderElement((short)0x8002, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800c, 9),
			new TagDecoderElement((short)0x800d, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800c, 9),
			new TagDecoderElement((short)0x800d, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800c, 9),
			new TagDecoderElement((short)0x800d, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 9),
			new TagDecoderElement((short)0x800d, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 10)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' Recarga object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' Recarga object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for Recarga
