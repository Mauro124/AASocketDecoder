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
 * Define the ASN1 Type Bono from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class Bono extends Sequence {

    /**
     * The default constructor.
     */
    public Bono()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public Bono(PrintableString codBono, OctetString cantidad,
		    PrintableString fechaInicio, PrintableString fechaFin,
		    BOOLEAN flagBonoPeriodi, BOOLEAN flagLastCycle,
		    PrintableString longBOCode, PrintableString endCurrCycle,
		    PrintableString dateNxtCycle, INTEGER64 costNxtCycle,
		    PrintableString boltOnState, INTEGER renewalNumber,
		    BOOLEAN autorenewable)
    {
	setCodBono(codBono);
	setCantidad(cantidad);
	setFechaInicio(fechaInicio);
	setFechaFin(fechaFin);
	setFlagBonoPeriodi(flagBonoPeriodi);
	setFlagLastCycle(flagLastCycle);
	setLongBOCode(longBOCode);
	setEndCurrCycle(endCurrCycle);
	setDateNxtCycle(dateNxtCycle);
	setCostNxtCycle(costNxtCycle);
	setBoltOnState(boltOnState);
	setRenewalNumber(renewalNumber);
	setAutorenewable(autorenewable);
    }

    /**
     * Construct with components.
     */
    public Bono(PrintableString codBono, OctetString cantidad,
		    PrintableString fechaInicio, PrintableString fechaFin,
		    boolean flagBonoPeriodi, boolean flagLastCycle,
		    PrintableString longBOCode, PrintableString endCurrCycle,
		    PrintableString dateNxtCycle, INTEGER64 costNxtCycle,
		    PrintableString boltOnState, long renewalNumber,
		    boolean autorenewable)
    {
	this(codBono, cantidad, fechaInicio, fechaFin,
	     new BOOLEAN(flagBonoPeriodi), new BOOLEAN(flagLastCycle),
	     longBOCode, endCurrCycle, dateNxtCycle, costNxtCycle,
	     boltOnState, new INTEGER(renewalNumber),
	     new BOOLEAN(autorenewable));
    }

    /**
     * Construct with required components.
     */
    public Bono(PrintableString codBono, OctetString cantidad,
		    PrintableString fechaInicio, PrintableString fechaFin,
		    boolean flagBonoPeriodi)
    {
	setCodBono(codBono);
	setCantidad(cantidad);
	setFechaInicio(fechaInicio);
	setFechaFin(fechaFin);
	setFlagBonoPeriodi(flagBonoPeriodi);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new OctetString();
	mComponents[2] = new PrintableString();
	mComponents[3] = new PrintableString();
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new PrintableString();
	mComponents[7] = new PrintableString();
	mComponents[8] = new PrintableString();
	mComponents[9] = new INTEGER64();
	mComponents[10] = new PrintableString();
	mComponents[11] = new INTEGER();
	mComponents[12] = new BOOLEAN();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrintableString();
	    case 1:
		return new OctetString();
	    case 2:
		return new PrintableString();
	    case 3:
		return new PrintableString();
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new PrintableString();
	    case 7:
		return new PrintableString();
	    case 8:
		return new PrintableString();
	    case 9:
		return new INTEGER64();
	    case 10:
		return new PrintableString();
	    case 11:
		return new INTEGER();
	    case 12:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "codBono"
    public PrintableString getCodBono()
    {
	return (PrintableString)mComponents[0];
    }

    public void setCodBono(PrintableString codBono)
    {
	mComponents[0] = codBono;
    }


    // Methods for field "cantidad"
    public OctetString getCantidad()
    {
	return (OctetString)mComponents[1];
    }

    public void setCantidad(OctetString cantidad)
    {
	mComponents[1] = cantidad;
    }


    // Methods for field "fechaInicio"
    public PrintableString getFechaInicio()
    {
	return (PrintableString)mComponents[2];
    }

    public void setFechaInicio(PrintableString fechaInicio)
    {
	mComponents[2] = fechaInicio;
    }


    // Methods for field "fechaFin"
    public PrintableString getFechaFin()
    {
	return (PrintableString)mComponents[3];
    }

    public void setFechaFin(PrintableString fechaFin)
    {
	mComponents[3] = fechaFin;
    }


    // Methods for field "flagBonoPeriodi"
    public boolean getFlagBonoPeriodi()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }

    public void setFlagBonoPeriodi(boolean flagBonoPeriodi)
    {
	setFlagBonoPeriodi(new BOOLEAN(flagBonoPeriodi));
    }

    public void setFlagBonoPeriodi(BOOLEAN flagBonoPeriodi)
    {
	mComponents[4] = flagBonoPeriodi;
    }


    // Methods for field "flagLastCycle"
    public boolean getFlagLastCycle()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }

    public void setFlagLastCycle(boolean flagLastCycle)
    {
	setFlagLastCycle(new BOOLEAN(flagLastCycle));
    }

    public void setFlagLastCycle(BOOLEAN flagLastCycle)
    {
	mComponents[5] = flagLastCycle;
    }

    public boolean hasFlagLastCycle()
    {
	return componentIsPresent(5);
    }

    public void deleteFlagLastCycle()
    {
	setComponentAbsent(5);
    }


    // Methods for field "longBOCode"
    public PrintableString getLongBOCode()
    {
	return (PrintableString)mComponents[6];
    }

    public void setLongBOCode(PrintableString longBOCode)
    {
	mComponents[6] = longBOCode;
    }

    public boolean hasLongBOCode()
    {
	return componentIsPresent(6);
    }

    public void deleteLongBOCode()
    {
	setComponentAbsent(6);
    }


    // Methods for field "endCurrCycle"
    public PrintableString getEndCurrCycle()
    {
	return (PrintableString)mComponents[7];
    }

    public void setEndCurrCycle(PrintableString endCurrCycle)
    {
	mComponents[7] = endCurrCycle;
    }

    public boolean hasEndCurrCycle()
    {
	return componentIsPresent(7);
    }

    public void deleteEndCurrCycle()
    {
	setComponentAbsent(7);
    }


    // Methods for field "dateNxtCycle"
    public PrintableString getDateNxtCycle()
    {
	return (PrintableString)mComponents[8];
    }

    public void setDateNxtCycle(PrintableString dateNxtCycle)
    {
	mComponents[8] = dateNxtCycle;
    }

    public boolean hasDateNxtCycle()
    {
	return componentIsPresent(8);
    }

    public void deleteDateNxtCycle()
    {
	setComponentAbsent(8);
    }


    // Methods for field "costNxtCycle"
    public INTEGER64 getCostNxtCycle()
    {
	return (INTEGER64)mComponents[9];
    }

    public void setCostNxtCycle(INTEGER64 costNxtCycle)
    {
	mComponents[9] = costNxtCycle;
    }

    public boolean hasCostNxtCycle()
    {
	return componentIsPresent(9);
    }

    public void deleteCostNxtCycle()
    {
	setComponentAbsent(9);
    }


    // Methods for field "boltOnState"
    public PrintableString getBoltOnState()
    {
	return (PrintableString)mComponents[10];
    }

    public void setBoltOnState(PrintableString boltOnState)
    {
	mComponents[10] = boltOnState;
    }

    public boolean hasBoltOnState()
    {
	return componentIsPresent(10);
    }

    public void deleteBoltOnState()
    {
	setComponentAbsent(10);
    }


    // Methods for field "renewalNumber"
    public long getRenewalNumber()
    {
	return ((INTEGER)mComponents[11]).longValue();
    }

    public void setRenewalNumber(long renewalNumber)
    {
	setRenewalNumber(new INTEGER(renewalNumber));
    }

    public void setRenewalNumber(INTEGER renewalNumber)
    {
	mComponents[11] = renewalNumber;
    }

    public boolean hasRenewalNumber()
    {
	return componentIsPresent(11);
    }

    public void deleteRenewalNumber()
    {
	setComponentAbsent(11);
    }


    // Methods for field "autorenewable"
    public boolean getAutorenewable()
    {
	return ((BOOLEAN)mComponents[12]).booleanValue();
    }

    public void setAutorenewable(boolean autorenewable)
    {
	setAutorenewable(new BOOLEAN(autorenewable));
    }

    public void setAutorenewable(BOOLEAN autorenewable)
    {
	mComponents[12] = autorenewable;
    }

    public boolean hasAutorenewable()
    {
	return componentIsPresent(12);
    }

    public void deleteAutorenewable()
    {
	setComponentAbsent(12);
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
	    "Bono"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "Bono"
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
					    new INTEGER(9),
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
		    "codBono",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    798739,
			    null,
			    null
			)
		    ),
		    "cantidad",
		    1,
		    2,
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
		    "fechaInicio",
		    2,
		    2,
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
		    "fechaFin",
		    3,
		    2,
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
		    "flagBonoPeriodi",
		    4,
		    2,
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
		    "flagLastCycle",
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
		    "longBOCode",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "endCurrCycle",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "dateNxtCycle",
		    8,
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
		    "costNxtCycle",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
					new INTEGER(2)
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
		    "boltOnState",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    798739,
			    null,
			    null,
			    null
			)
		    ),
		    "renewalNumber",
		    11,
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
		    "autorenewable",
		    12,
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
			new TagDecoderElement((short)0x8004, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 5),
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800a, 9),
			new TagDecoderElement((short)0x800b, 10),
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800a, 9),
			new TagDecoderElement((short)0x800b, 10),
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800a, 9),
			new TagDecoderElement((short)0x800b, 10),
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 8),
			new TagDecoderElement((short)0x800a, 9),
			new TagDecoderElement((short)0x800b, 10),
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 9),
			new TagDecoderElement((short)0x800b, 10),
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 10),
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 11),
			new TagDecoderElement((short)0x800d, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 12)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' Bono object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' Bono object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for Bono
