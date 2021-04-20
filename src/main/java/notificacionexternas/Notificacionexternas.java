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


package notificacionexternas;

import com.oss.asn1.*;
import com.oss.metadata.*;

public class Notificacionexternas extends ASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	new PDUDecoder (
	    new PDUDecoderElement[] {
		new PDUDecoderElement (
		    (short)0x8001,
		    new QName (
			"notificacionexternas.ppif_interfazexterna",
			"LeadingType"
		    )
		),
		new PDUDecoderElement (
		    (short)0x0004,
		    new QName (
			"notificacionexternas.ppif_interfazexterna",
			"SessionInformation"
		    )
		)
	    }
	),
	new byte[] {
	    (byte)0x0b, (byte)0x30, (byte)0xb4, (byte)0xda, (byte)0x38,
	    (byte)0x35, (byte)0xb1, (byte)0xc2, (byte)0xb7, (byte)0x34,
	    (byte)0xb1, (byte)0xc2, (byte)0xb7, (byte)0x24, (byte)0x8f,
	    (byte)0x31, (byte)0xb6, (byte)0xf8, (byte)0x13, (byte)0x8b,
	    (byte)0xcd, (byte)0x35, (byte)0x38, (byte)0x1e, (byte)0xff,
	    (byte)0xa5, (byte)0xa5, (byte)0x94, (byte)0xef, (byte)0x17,
	    (byte)0x00, (byte)0xa1, (byte)0xfe, (byte)0x3d, (byte)0xaf,
	    (byte)0x89, (byte)0xcb, (byte)0x59, (byte)0x4d, (byte)0xb2,
	    (byte)0x81, (byte)0x7a, (byte)0xf6, (byte)0x36, (byte)0x1d,
	    (byte)0xe4, (byte)0xbc, (byte)0x24, (byte)0x87, (byte)0x41,
	    (byte)0x79, (byte)0x9f, (byte)0x2e, (byte)0xfa, (byte)0xae,
	    (byte)0x28, (byte)0xeb, (byte)0x61, (byte)0x3e, (byte)0xce,
	    (byte)0x56, (byte)0xb2, (byte)0x78, (byte)0x0d, (byte)0x2c,
	    (byte)0x29, (byte)0xe0, (byte)0xc7, (byte)0xfd, (byte)0x20,
	    (byte)0xe3, (byte)0x97, (byte)0xd6, (byte)0xd9, (byte)0xd7,
	    (byte)0xbc, (byte)0x97, (byte)0xfc, (byte)0xab, (byte)0x2b,
	    (byte)0x22, (byte)0x85, (byte)0x0d, (byte)0x61, (byte)0x09,
	    (byte)0xb7, (byte)0xf9, (byte)0x7a, (byte)0x0a, (byte)0x38,
	    (byte)0x07, (byte)0x61, (byte)0x4e, (byte)0xb7, (byte)0x79,
	    (byte)0x1b, (byte)0x1f, (byte)0x07, (byte)0xd3, (byte)0xf2,
	    (byte)0x98, (byte)0x8b, (byte)0x43, (byte)0xbc, (byte)0x1d,
	    (byte)0x27, (byte)0x7d, (byte)0xfd, (byte)0xfc, (byte)0x6a,
	    (byte)0x78, (byte)0xd7, (byte)0x85, (byte)0x28, (byte)0x46,
	    (byte)0x76, (byte)0x9d, (byte)0xad, (byte)0xda, (byte)0xb6,
	    (byte)0xca, (byte)0x4d, (byte)0x8f, (byte)0x8d, (byte)0x1a,
	    (byte)0xec, (byte)0x35, (byte)0x0c, (byte)0x9d, (byte)0x17,
	    (byte)0x22, (byte)0x15, (byte)0x50, (byte)0xe3, (byte)0xe4,
	    (byte)0x6d, (byte)0xdb, (byte)0xd7, (byte)0x03, (byte)0xc6,
	    (byte)0x83, (byte)0x0e, (byte)0x6f, (byte)0x3e, (byte)0xee,
	    (byte)0xc4, (byte)0x34, (byte)0x87, (byte)0x52, (byte)0xee,
	    (byte)0x4f, (byte)0x27, (byte)0xcd, (byte)0xb9, (byte)0x96,
	    (byte)0x3c, (byte)0x30, (byte)0x82, (byte)0xb7, (byte)0x38,
	    (byte)0x2b, (byte)0x47, (byte)0x9c, (byte)0x84, (byte)0xef,
	    (byte)0x4e, (byte)0x6d, (byte)0x75, (byte)0x19, (byte)0xe8,
	    (byte)0x75, (byte)0xbc, (byte)0xa9, (byte)0xc8, (byte)0x1b,
	    (byte)0x35, (byte)0x46, (byte)0xeb, (byte)0x7c, (byte)0xc6,
	    (byte)0x6f, (byte)0x53, (byte)0x0c, (byte)0x2b, (byte)0x79,
	    (byte)0x14, (byte)0x03, (byte)0x68, (byte)0x94, (byte)0x4f,
	    (byte)0xc6, (byte)0x52, (byte)0xf1, (byte)0x42, (byte)0x43,
	    (byte)0xa1, (byte)0xbc, (byte)0xf4, (byte)0x47, (byte)0x73,
	    (byte)0x41, (byte)0x60, (byte)0x25, (byte)0x04, (byte)0x29,
	    (byte)0x87, (byte)0xbd, (byte)0x44, (byte)0xaf, (byte)0xaa,
	    (byte)0x29, (byte)0x65, (byte)0xc0, (byte)0xb9, (byte)0x91,
	    (byte)0x8e, (byte)0x49, (byte)0xfd, (byte)0xec, (byte)0x29,
	    (byte)0xd5, (byte)0xab, (byte)0x47, (byte)0xae, (byte)0x41,
	    (byte)0x71, (byte)0x41, (byte)0xc0, (byte)0xde, (byte)0x91
	}
    );

    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }

    private static final ASN1Project c_project = new Notificacionexternas();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createBERCoder(c_project);
    }

    public static BERCoder getBERCoder()
    {
	return createBERCoder(c_project);
    }

    public static CERCoder getCERCoder()
    {
	return createCERCoder(c_project);
    }

    public static DERCoder getDERCoder()
    {
	return createDERCoder(c_project);
    }

}
