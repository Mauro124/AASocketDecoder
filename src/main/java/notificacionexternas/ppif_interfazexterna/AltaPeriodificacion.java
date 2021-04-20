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
 * Define the ASN1 Type AltaPeriodificacion from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class AltaPeriodificacion extends Sequence {

    /**
     * The default constructor.
     */
    public AltaPeriodificacion()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public AltaPeriodificacion(PrintableString codTipoActPerio,
		    PrintableString fechaPrimeraPeriodificacion,
		    FechaPeriodificacion fechaPeriodificacion,
		    PrintableString longBOCode, PrintableString dateNxtCycle,
		    INTEGER64 costNxtCycle)
    {
	setCodTipoActPerio(codTipoActPerio);
	setFechaPrimeraPeriodificacion(fechaPrimeraPeriodificacion);
	setFechaPeriodificacion(fechaPeriodificacion);
	setLongBOCode(longBOCode);
	setDateNxtCycle(dateNxtCycle);
	setCostNxtCycle(costNxtCycle);
    }

    /**
     * Construct with required components.
     */
    public AltaPeriodificacion(PrintableString codTipoActPerio,
		    PrintableString fechaPrimeraPeriodificacion)
    {
	setCodTipoActPerio(codTipoActPerio);
	setFechaPrimeraPeriodificacion(fechaPrimeraPeriodificacion);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new FechaPeriodificacion();
	mComponents[3] = new PrintableString();
	mComponents[4] = new PrintableString();
	mComponents[5] = new INTEGER64();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[6];
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
		return new FechaPeriodificacion();
	    case 3:
		return new PrintableString();
	    case 4:
		return new PrintableString();
	    case 5:
		return new INTEGER64();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "codTipoActPerio"
    public PrintableString getCodTipoActPerio()
    {
	return (PrintableString)mComponents[0];
    }

    public void setCodTipoActPerio(PrintableString codTipoActPerio)
    {
	mComponents[0] = codTipoActPerio;
    }


    // Methods for field "fechaPrimeraPeriodificacion"
    public PrintableString getFechaPrimeraPeriodificacion()
    {
	return (PrintableString)mComponents[1];
    }

    public void setFechaPrimeraPeriodificacion(PrintableString fechaPrimeraPeriodificacion)
    {
	mComponents[1] = fechaPrimeraPeriodificacion;
    }


    // Methods for field "fechaPeriodificacion"
    public FechaPeriodificacion getFechaPeriodificacion()
    {
	return (FechaPeriodificacion)mComponents[2];
    }

    public void setFechaPeriodificacion(FechaPeriodificacion fechaPeriodificacion)
    {
	mComponents[2] = fechaPeriodificacion;
    }

    public boolean hasFechaPeriodificacion()
    {
	return componentIsPresent(2);
    }

    public void deleteFechaPeriodificacion()
    {
	setComponentAbsent(2);
    }


    // Methods for field "longBOCode"
    public PrintableString getLongBOCode()
    {
	return (PrintableString)mComponents[3];
    }

    public void setLongBOCode(PrintableString longBOCode)
    {
	mComponents[3] = longBOCode;
    }

    public boolean hasLongBOCode()
    {
	return componentIsPresent(3);
    }

    public void deleteLongBOCode()
    {
	setComponentAbsent(3);
    }


    // Methods for field "dateNxtCycle"
    public PrintableString getDateNxtCycle()
    {
	return (PrintableString)mComponents[4];
    }

    public void setDateNxtCycle(PrintableString dateNxtCycle)
    {
	mComponents[4] = dateNxtCycle;
    }

    public boolean hasDateNxtCycle()
    {
	return componentIsPresent(4);
    }

    public void deleteDateNxtCycle()
    {
	setComponentAbsent(4);
    }


    // Methods for field "costNxtCycle"
    public INTEGER64 getCostNxtCycle()
    {
	return (INTEGER64)mComponents[5];
    }

    public void setCostNxtCycle(INTEGER64 costNxtCycle)
    {
	mComponents[5] = costNxtCycle;
    }

    public boolean hasCostNxtCycle()
    {
	return componentIsPresent(5);
    }

    public void deleteCostNxtCycle()
    {
	setComponentAbsent(5);
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
	    "AltaPeriodificacion"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "AltaPeriodificacion"
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
		    "codTipoActPerio",
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
		    "fechaPrimeraPeriodificacion",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"FechaPeriodificacion"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"FechaPeriodificacion"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "FechaPeriodificacion"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8001, 0),
				    new TagDecoderElement((short)0x8002, 1)
				}
			    )
			)
		    ),
		    "fechaPeriodificacion",
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "dateNxtCycle",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    5,
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
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3),
			new TagDecoderElement((short)0x8005, 4),
			new TagDecoderElement((short)0x8006, 5)
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
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' AltaPeriodificacion object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' AltaPeriodificacion object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for AltaPeriodificacion
