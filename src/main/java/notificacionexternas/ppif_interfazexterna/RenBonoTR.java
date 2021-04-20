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
 * Define the ASN1 Type RenBonoTR from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class RenBonoTR extends Sequence {

    /**
     * The default constructor.
     */
    public RenBonoTR()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public RenBonoTR(PrintableString codBono, OctetString cantidad,
		    PrintableString fechaInicio, PrintableString fechaFin,
		    INTEGER tipoRenovacion, PrintableString longBOCode,
		    INTEGER renewalNumber, PrintableString endCurrPeriod,
		    PrintableString expirCurrPeriod)
    {
	setCodBono(codBono);
	setCantidad(cantidad);
	setFechaInicio(fechaInicio);
	setFechaFin(fechaFin);
	setTipoRenovacion(tipoRenovacion);
	setLongBOCode(longBOCode);
	setRenewalNumber(renewalNumber);
	setEndCurrPeriod(endCurrPeriod);
	setExpirCurrPeriod(expirCurrPeriod);
    }

    /**
     * Construct with components.
     */
    public RenBonoTR(PrintableString codBono, OctetString cantidad,
		    PrintableString fechaInicio, PrintableString fechaFin,
		    long tipoRenovacion, PrintableString longBOCode,
		    long renewalNumber, PrintableString endCurrPeriod,
		    PrintableString expirCurrPeriod)
    {
	this(codBono, cantidad, fechaInicio, fechaFin,
	     new INTEGER(tipoRenovacion), longBOCode,
	     new INTEGER(renewalNumber), endCurrPeriod, expirCurrPeriod);
    }

    /**
     * Construct with required components.
     */
    public RenBonoTR(PrintableString codBono, OctetString cantidad,
		    PrintableString fechaInicio, PrintableString fechaFin,
		    long tipoRenovacion)
    {
	setCodBono(codBono);
	setCantidad(cantidad);
	setFechaInicio(fechaInicio);
	setFechaFin(fechaFin);
	setTipoRenovacion(tipoRenovacion);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new OctetString();
	mComponents[2] = new PrintableString();
	mComponents[3] = new PrintableString();
	mComponents[4] = new INTEGER();
	mComponents[5] = new PrintableString();
	mComponents[6] = new INTEGER();
	mComponents[7] = new PrintableString();
	mComponents[8] = new PrintableString();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[9];
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
		return new INTEGER();
	    case 5:
		return new PrintableString();
	    case 6:
		return new INTEGER();
	    case 7:
		return new PrintableString();
	    case 8:
		return new PrintableString();
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


    // Methods for field "tipoRenovacion"
    public long getTipoRenovacion()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }

    public void setTipoRenovacion(long tipoRenovacion)
    {
	setTipoRenovacion(new INTEGER(tipoRenovacion));
    }

    public void setTipoRenovacion(INTEGER tipoRenovacion)
    {
	mComponents[4] = tipoRenovacion;
    }


    // Methods for field "longBOCode"
    public PrintableString getLongBOCode()
    {
	return (PrintableString)mComponents[5];
    }

    public void setLongBOCode(PrintableString longBOCode)
    {
	mComponents[5] = longBOCode;
    }

    public boolean hasLongBOCode()
    {
	return componentIsPresent(5);
    }

    public void deleteLongBOCode()
    {
	setComponentAbsent(5);
    }


    // Methods for field "renewalNumber"
    public long getRenewalNumber()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }

    public void setRenewalNumber(long renewalNumber)
    {
	setRenewalNumber(new INTEGER(renewalNumber));
    }

    public void setRenewalNumber(INTEGER renewalNumber)
    {
	mComponents[6] = renewalNumber;
    }

    public boolean hasRenewalNumber()
    {
	return componentIsPresent(6);
    }

    public void deleteRenewalNumber()
    {
	setComponentAbsent(6);
    }


    // Methods for field "endCurrPeriod"
    public PrintableString getEndCurrPeriod()
    {
	return (PrintableString)mComponents[7];
    }

    public void setEndCurrPeriod(PrintableString endCurrPeriod)
    {
	mComponents[7] = endCurrPeriod;
    }

    public boolean hasEndCurrPeriod()
    {
	return componentIsPresent(7);
    }

    public void deleteEndCurrPeriod()
    {
	setComponentAbsent(7);
    }


    // Methods for field "expirCurrPeriod"
    public PrintableString getExpirCurrPeriod()
    {
	return (PrintableString)mComponents[8];
    }

    public void setExpirCurrPeriod(PrintableString expirCurrPeriod)
    {
	mComponents[8] = expirCurrPeriod;
    }

    public boolean hasExpirCurrPeriod()
    {
	return componentIsPresent(8);
    }

    public void deleteExpirCurrPeriod()
    {
	setComponentAbsent(8);
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
	    "RenBonoTR"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "RenBonoTR"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "tipoRenovacion",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "endCurrPeriod",
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
		    "expirCurrPeriod",
		    8,
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
			new TagDecoderElement((short)0x8009, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 8)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' RenBonoTR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' RenBonoTR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for RenBonoTR
