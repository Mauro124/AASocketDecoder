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
 * Define the ASN1 Type Msisdn from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see NumericString
 */

public class Msisdn extends NumericString {

    /**
     * The default constructor.
     */
    public Msisdn()
    {
    }

    /**
     * Construct from a String type.
     * @param value the String to set this object to.
     */
    public Msisdn(String value)
    {
	super(value);
    }


    /**
     * Construct from a char[] type.
     * @param value the char[] to set this object to.
     */
    public Msisdn(char[] value)
    {
	super(value);
    }

    /**
     * Initialize the type descriptor.
     */
    private static final KMCStringInfo c_typeinfo = new KMCStringInfo (
	new Tags (
	    new short[] {
		0x0012
	    }
	),
	new QName (
	    "notificacionexternas.ppif_interfazexterna",
	    "Msisdn"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "Msisdn"
	),
	798739,
	new Intersection (
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(9),
			new INTEGER(15),
			0
		    )
		)
	    ),
	    new PermittedAlphabetConstraint (
		NumericStringPAInfo.pa
	    )
	),
	null,
	null
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' Msisdn object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' Msisdn object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for Msisdn
