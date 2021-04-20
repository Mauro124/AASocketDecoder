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
 * Define the ASN1 Type FechaPeriodificacion from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Choice
 */

public class FechaPeriodificacion extends Choice {

    /**
     * The default constructor.
     */
    public FechaPeriodificacion()
    {
    }

    public static final  int  diaReferencia_chosen = 1;
    public static final  int  intervalo_chosen = 2;

    // Methods for field "diaReferencia"
    public static FechaPeriodificacion createFechaPeriodificacionWithDiaReferencia(long diaReferencia)
    {
	return createFechaPeriodificacionWithDiaReferencia(new INTEGER(diaReferencia));
    }

    public static FechaPeriodificacion createFechaPeriodificacionWithDiaReferencia(INTEGER diaReferencia)
    {
	FechaPeriodificacion __object = new FechaPeriodificacion();

	__object.setDiaReferencia(diaReferencia);
	return __object;
    }

    public boolean hasDiaReferencia()
    {
	return getChosenFlag() == diaReferencia_chosen;
    }

    public INTEGER getDiaReferencia()
    {
	if (hasDiaReferencia())
	    return (INTEGER)mChosenValue;
	else
	    return null;
    }

    public void setDiaReferencia(long diaReferencia)
    {
	setDiaReferencia(new INTEGER(diaReferencia));
    }

    public void setDiaReferencia(INTEGER diaReferencia)
    {
	setChosenValue(diaReferencia);
	setChosenFlag(diaReferencia_chosen);
    }


    // Methods for field "intervalo"
    public static FechaPeriodificacion createFechaPeriodificacionWithIntervalo(Intervalo intervalo)
    {
	FechaPeriodificacion __object = new FechaPeriodificacion();

	__object.setIntervalo(intervalo);
	return __object;
    }

    public boolean hasIntervalo()
    {
	return getChosenFlag() == intervalo_chosen;
    }

    public Intervalo getIntervalo()
    {
	if (hasIntervalo())
	    return (Intervalo)mChosenValue;
	else
	    return null;
    }

    public void setIntervalo(Intervalo intervalo)
    {
	setChosenValue(intervalo);
	setChosenFlag(intervalo_chosen);
    }


    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case diaReferencia_chosen:
		return new INTEGER();
	    case intervalo_chosen:
		return new Intervalo();
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
	    "FechaPeriodificacion"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "FechaPeriodificacion"
	),
	798739,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
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
		    "diaReferencia",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"notificacionexternas.ppif_interfazexterna",
				"Intervalo"
			    ),
			    new QName (
				"PPIF-INTERFAZEXTERNA",
				"Intervalo"
			    ),
			    798739,
			    null,
			    new FieldsRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Intervalo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "notificacionexternas.ppif_interfazexterna",
				    "Intervalo"
				)
			    ),
			    0
			)
		    ),
		    "intervalo",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8001, 0),
		new TagDecoderElement((short)0x8002, 1)
	    }
	)
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' FechaPeriodificacion object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' FechaPeriodificacion object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for FechaPeriodificacion
