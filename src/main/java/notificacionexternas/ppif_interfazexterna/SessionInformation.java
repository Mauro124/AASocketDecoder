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
 * Define the ASN1 Type SessionInformation from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see OctetString
 */

public class SessionInformation extends OctetString {

    /**
     * The default constructor.
     */
    public SessionInformation()
    {
    }

    /**
     * Construct from a byte[] type.
     * @param value the byte[] to set this object to.
     */

    public SessionInformation(byte[] value)
    {
	super(value);
    }

    /**
     * Initialize the type descriptor.
     */
    private static final VectorInfo c_typeinfo = new VectorInfo (
	new Tags (
	    new short[] {
		0x0004
	    }
	),
	new QName (
	    "notificacionexternas.ppif_interfazexterna",
	    "SessionInformation"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "SessionInformation"
	),
	798739,
	new SizeConstraint (
	    new SingleValueConstraint (
		new INTEGER(1)
	    )
	),
	null
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' SessionInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' SessionInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }

} // End class definition for SessionInformation
