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
 * Define the ASN1 Type PromocionEBC from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class PromocionEBC extends Sequence {

    /**
     * The default constructor.
     */
    public PromocionEBC()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public PromocionEBC(INTEGER codigoCompra)
    {
	setCodigoCompra(codigoCompra);
    }

    /**
     * Construct with components.
     */
    public PromocionEBC(long codigoCompra)
    {
	this(new INTEGER(codigoCompra));
    }

    public void initComponents()
    {
	mComponents[0] = new INTEGER();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "codigoCompra"
    public long getCodigoCompra()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }

    public void setCodigoCompra(long codigoCompra)
    {
	setCodigoCompra(new INTEGER(codigoCompra));
    }

    public void setCodigoCompra(INTEGER codigoCompra)
    {
	mComponents[0] = codigoCompra;
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
	    "PromocionEBC"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "PromocionEBC"
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
		    "codigoCompra",
		    0,
		    2,
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
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' PromocionEBC object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' PromocionEBC object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for PromocionEBC
