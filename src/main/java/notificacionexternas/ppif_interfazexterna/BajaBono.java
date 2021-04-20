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
 * Define the ASN1 Type BajaBono from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class BajaBono extends Sequence {

    /**
     * The default constructor.
     */
    public BajaBono()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public BajaBono(PrintableString codBono, PrintableString longBOCode,
		    BOOLEAN autorenewable)
    {
	setCodBono(codBono);
	setLongBOCode(longBOCode);
	setAutorenewable(autorenewable);
    }

    /**
     * Construct with components.
     */
    public BajaBono(PrintableString codBono, PrintableString longBOCode,
		    boolean autorenewable)
    {
	this(codBono, longBOCode, new BOOLEAN(autorenewable));
    }

    /**
     * Construct with required components.
     */
    public BajaBono(PrintableString codBono)
    {
	setCodBono(codBono);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new BOOLEAN();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[3];
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


    // Methods for field "longBOCode"
    public PrintableString getLongBOCode()
    {
	return (PrintableString)mComponents[1];
    }

    public void setLongBOCode(PrintableString longBOCode)
    {
	mComponents[1] = longBOCode;
    }

    public boolean hasLongBOCode()
    {
	return componentIsPresent(1);
    }

    public void deleteLongBOCode()
    {
	setComponentAbsent(1);
    }


    // Methods for field "autorenewable"
    public boolean getAutorenewable()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }

    public void setAutorenewable(boolean autorenewable)
    {
	setAutorenewable(new BOOLEAN(autorenewable));
    }

    public void setAutorenewable(BOOLEAN autorenewable)
    {
	mComponents[2] = autorenewable;
    }

    public boolean hasAutorenewable()
    {
	return componentIsPresent(2);
    }

    public void deleteAutorenewable()
    {
	setComponentAbsent(2);
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
	    "BajaBono"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "BajaBono"
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
		    1,
		    3,
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
		    "autorenewable",
		    2,
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
			new TagDecoderElement((short)0x8003, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' BajaBono object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' BajaBono object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for BajaBono
