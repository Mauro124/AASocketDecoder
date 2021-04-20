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
 * Define the ASN1 Type InfoAdicionalRecargas from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Choice
 */

public class InfoAdicionalRecargas extends Choice {

    /**
     * The default constructor.
     */
    public InfoAdicionalRecargas()
    {
    }

    public static final  int  recargasBancarias_chosen = 1;

    // Methods for field "recargasBancarias"
    public static InfoAdicionalRecargas createInfoAdicionalRecargasWithRecargasBancarias(InfoAdicionalRCBancarias recargasBancarias)
    {
	InfoAdicionalRecargas __object = new InfoAdicionalRecargas();

	__object.setRecargasBancarias(recargasBancarias);
	return __object;
    }

    public boolean hasRecargasBancarias()
    {
	return getChosenFlag() == recargasBancarias_chosen;
    }

    public InfoAdicionalRCBancarias getRecargasBancarias()
    {
	if (hasRecargasBancarias())
	    return (InfoAdicionalRCBancarias)mChosenValue;
	else
	    return null;
    }

    public void setRecargasBancarias(InfoAdicionalRCBancarias recargasBancarias)
    {
	setChosenValue(recargasBancarias);
	setChosenFlag(recargasBancarias_chosen);
    }


    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case recargasBancarias_chosen:
		return new InfoAdicionalRCBancarias();
	    default:
		throw new InternalError("Choice.createInstance()");
	}

    }

    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
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
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"InfoAdicionalRCBancarias"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"InfoAdicionalRCBancarias"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "InfoAdicionalRCBancarias"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "InfoAdicionalRCBancarias"
				)
			    ),
			    0
			)
		    ),
		    "recargasBancarias",
		    0,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8001, 0)
	    }
	)
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' InfoAdicionalRecargas object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' InfoAdicionalRecargas object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for InfoAdicionalRecargas
