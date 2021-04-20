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
 * Define the ASN1 Type TipoHomezone from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Choice
 */

public class TipoHomezone extends Choice {

    /**
     * The default constructor.
     */
    public TipoHomezone()
    {
    }

    public static final  int  codigoPostal_chosen = 1;
    public static final  int  listOfLns_chosen = 2;

    // Methods for field "codigoPostal"
    public static TipoHomezone createTipoHomezoneWithCodigoPostal(long codigoPostal)
    {
	return createTipoHomezoneWithCodigoPostal(new INTEGER(codigoPostal));
    }

    public static TipoHomezone createTipoHomezoneWithCodigoPostal(INTEGER codigoPostal)
    {
	TipoHomezone __object = new TipoHomezone();

	__object.setCodigoPostal(codigoPostal);
	return __object;
    }

    public boolean hasCodigoPostal()
    {
	return getChosenFlag() == codigoPostal_chosen;
    }

    public INTEGER getCodigoPostal()
    {
	if (hasCodigoPostal())
	    return (INTEGER)mChosenValue;
	else
	    return null;
    }

    public void setCodigoPostal(long codigoPostal)
    {
	setCodigoPostal(new INTEGER(codigoPostal));
    }

    public void setCodigoPostal(INTEGER codigoPostal)
    {
	setChosenValue(codigoPostal);
	setChosenFlag(codigoPostal_chosen);
    }


    // Methods for field "listOfLns"
    public static TipoHomezone createTipoHomezoneWithListOfLns(ListOfLns listOfLns)
    {
	TipoHomezone __object = new TipoHomezone();

	__object.setListOfLns(listOfLns);
	return __object;
    }

    public boolean hasListOfLns()
    {
	return getChosenFlag() == listOfLns_chosen;
    }

    public ListOfLns getListOfLns()
    {
	if (hasListOfLns())
	    return (ListOfLns)mChosenValue;
	else
	    return null;
    }

    public void setListOfLns(ListOfLns listOfLns)
    {
	setChosenValue(listOfLns);
	setChosenFlag(listOfLns_chosen);
    }



    /**
     * Define the ASN1 Type ListOfLns from ASN1 Module PPIF_INTERFAZEXTERNA.
     * @see SequenceOf
     */
    public static class ListOfLns extends SequenceOf<LocNum> {

	/**
	 * The default constructor.
	 */
	public ListOfLns()
	{
	}

	/**
	 * Construct from an array of components.
	 */
	public ListOfLns(LocNum[] elements)
	{
	    super(elements);
	}

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new LocNum();
	}

	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"notificacionexternas.ppif_interfazexterna",
		"TipoHomezone$ListOfLns"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    798739,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "notificacionexternas.ppif_interfazexterna",
		    "LocNum"
		)
	    )
	);

	/**
	 * Get the type descriptor (TypeInfo) of 'this' ListOfLns object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ListOfLns object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

    } // End class definition for ListOfLns

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case codigoPostal_chosen:
		return new INTEGER();
	    case listOfLns_chosen:
		return new ListOfLns();
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
	    "TipoHomezone"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "TipoHomezone"
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
		    "codigoPostal",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "notificacionexternas.ppif_interfazexterna",
			    "TipoHomezone$ListOfLns"
			)
		    ),
		    "listOfLns",
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
     * Get the type descriptor (TypeInfo) of 'this' TipoHomezone object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' TipoHomezone object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for TipoHomezone
