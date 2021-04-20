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
 * Define the ASN1 Type ControlGasto from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class ControlGasto extends Sequence {

    /**
     * The default constructor.
     */
    public ControlGasto()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public ControlGasto(INTEGER identControl, INTEGER64 impConsumo,
		    INTEGER valUmbral, PrintableString fechaFinPeriodoAcum)
    {
	setIdentControl(identControl);
	setImpConsumo(impConsumo);
	setValUmbral(valUmbral);
	setFechaFinPeriodoAcum(fechaFinPeriodoAcum);
    }

    /**
     * Construct with components.
     */
    public ControlGasto(long identControl, INTEGER64 impConsumo,
		    long valUmbral, PrintableString fechaFinPeriodoAcum)
    {
	this(new INTEGER(identControl), impConsumo, new INTEGER(valUmbral),
	     fechaFinPeriodoAcum);
    }

    /**
     * Construct with required components.
     */
    public ControlGasto(long identControl)
    {
	setIdentControl(identControl);
    }

    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER64();
	mComponents[2] = new INTEGER();
	mComponents[3] = new PrintableString();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER64();
	    case 2:
		return new INTEGER();
	    case 3:
		return new PrintableString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "identControl"
    public long getIdentControl()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }

    public void setIdentControl(long identControl)
    {
	setIdentControl(new INTEGER(identControl));
    }

    public void setIdentControl(INTEGER identControl)
    {
	mComponents[0] = identControl;
    }


    // Methods for field "impConsumo"
    public INTEGER64 getImpConsumo()
    {
	return (INTEGER64)mComponents[1];
    }

    public void setImpConsumo(INTEGER64 impConsumo)
    {
	mComponents[1] = impConsumo;
    }

    public boolean hasImpConsumo()
    {
	return componentIsPresent(1);
    }

    public void deleteImpConsumo()
    {
	setComponentAbsent(1);
    }


    // Methods for field "valUmbral"
    public long getValUmbral()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }

    public void setValUmbral(long valUmbral)
    {
	setValUmbral(new INTEGER(valUmbral));
    }

    public void setValUmbral(INTEGER valUmbral)
    {
	mComponents[2] = valUmbral;
    }

    public boolean hasValUmbral()
    {
	return componentIsPresent(2);
    }

    public void deleteValUmbral()
    {
	setComponentAbsent(2);
    }


    // Methods for field "fechaFinPeriodoAcum"
    public PrintableString getFechaFinPeriodoAcum()
    {
	return (PrintableString)mComponents[3];
    }

    public void setFechaFinPeriodoAcum(PrintableString fechaFinPeriodoAcum)
    {
	mComponents[3] = fechaFinPeriodoAcum;
    }

    public boolean hasFechaFinPeriodoAcum()
    {
	return componentIsPresent(3);
    }

    public void deleteFechaFinPeriodoAcum()
    {
	setComponentAbsent(3);
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
	    "ControlGasto"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "ControlGasto"
	),
	798739,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "identControl",
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
		    "impConsumo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "valUmbral",
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
		    "fechaFinPeriodoAcum",
		    3,
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
			new TagDecoderElement((short)0x8004, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2),
			new TagDecoderElement((short)0x8004, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 3)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' ControlGasto object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' ControlGasto object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for ControlGasto
