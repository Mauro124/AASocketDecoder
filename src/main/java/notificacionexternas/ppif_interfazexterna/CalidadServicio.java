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
 * Define the ASN1 Type CalidadServicio from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class CalidadServicio extends Sequence {

    /**
     * The default constructor.
     */
    public CalidadServicio()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public CalidadServicio(PrintableString idEvento,
		    PrintableString idAplicacion, PrintableString ipUsuario,
		    INTEGER maxBPSup, INTEGER maxBPSDown,
		    INTEGER idAplicacionAF, PrintableString idSesionGy,
		    PrintableString idSesionRx, Msisdn externalclientID)
    {
	setIdEvento(idEvento);
	setIdAplicacion(idAplicacion);
	setIpUsuario(ipUsuario);
	setMaxBPSup(maxBPSup);
	setMaxBPSDown(maxBPSDown);
	setIdAplicacionAF(idAplicacionAF);
	setIdSesionGy(idSesionGy);
	setIdSesionRx(idSesionRx);
	setExternalclientID(externalclientID);
    }

    /**
     * Construct with components.
     */
    public CalidadServicio(PrintableString idEvento,
		    PrintableString idAplicacion, PrintableString ipUsuario,
		    long maxBPSup, long maxBPSDown, long idAplicacionAF,
		    PrintableString idSesionGy, PrintableString idSesionRx,
		    Msisdn externalclientID)
    {
	this(idEvento, idAplicacion, ipUsuario, new INTEGER(maxBPSup),
	     new INTEGER(maxBPSDown), new INTEGER(idAplicacionAF),
	     idSesionGy, idSesionRx, externalclientID);
    }

    /**
     * Construct with required components.
     */
    public CalidadServicio(PrintableString idEvento,
		    PrintableString idAplicacion, long idAplicacionAF)
    {
	setIdEvento(idEvento);
	setIdAplicacion(idAplicacion);
	setIdAplicacionAF(idAplicacionAF);
    }

    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new PrintableString();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new PrintableString();
	mComponents[7] = new PrintableString();
	mComponents[8] = new Msisdn();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[9];
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
		return new PrintableString();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new PrintableString();
	    case 7:
		return new PrintableString();
	    case 8:
		return new Msisdn();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "idEvento"
    public PrintableString getIdEvento()
    {
	return (PrintableString)mComponents[0];
    }

    public void setIdEvento(PrintableString idEvento)
    {
	mComponents[0] = idEvento;
    }


    // Methods for field "idAplicacion"
    public PrintableString getIdAplicacion()
    {
	return (PrintableString)mComponents[1];
    }

    public void setIdAplicacion(PrintableString idAplicacion)
    {
	mComponents[1] = idAplicacion;
    }


    // Methods for field "ipUsuario"
    public PrintableString getIpUsuario()
    {
	return (PrintableString)mComponents[2];
    }

    public void setIpUsuario(PrintableString ipUsuario)
    {
	mComponents[2] = ipUsuario;
    }

    public boolean hasIpUsuario()
    {
	return componentIsPresent(2);
    }

    public void deleteIpUsuario()
    {
	setComponentAbsent(2);
    }


    // Methods for field "maxBPSup"
    public long getMaxBPSup()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }

    public void setMaxBPSup(long maxBPSup)
    {
	setMaxBPSup(new INTEGER(maxBPSup));
    }

    public void setMaxBPSup(INTEGER maxBPSup)
    {
	mComponents[3] = maxBPSup;
    }

    public boolean hasMaxBPSup()
    {
	return componentIsPresent(3);
    }

    public void deleteMaxBPSup()
    {
	setComponentAbsent(3);
    }


    // Methods for field "maxBPSDown"
    public long getMaxBPSDown()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }

    public void setMaxBPSDown(long maxBPSDown)
    {
	setMaxBPSDown(new INTEGER(maxBPSDown));
    }

    public void setMaxBPSDown(INTEGER maxBPSDown)
    {
	mComponents[4] = maxBPSDown;
    }

    public boolean hasMaxBPSDown()
    {
	return componentIsPresent(4);
    }

    public void deleteMaxBPSDown()
    {
	setComponentAbsent(4);
    }


    // Methods for field "idAplicacionAF"
    public long getIdAplicacionAF()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }

    public void setIdAplicacionAF(long idAplicacionAF)
    {
	setIdAplicacionAF(new INTEGER(idAplicacionAF));
    }

    public void setIdAplicacionAF(INTEGER idAplicacionAF)
    {
	mComponents[5] = idAplicacionAF;
    }


    // Methods for field "idSesionGy"
    public PrintableString getIdSesionGy()
    {
	return (PrintableString)mComponents[6];
    }

    public void setIdSesionGy(PrintableString idSesionGy)
    {
	mComponents[6] = idSesionGy;
    }

    public boolean hasIdSesionGy()
    {
	return componentIsPresent(6);
    }

    public void deleteIdSesionGy()
    {
	setComponentAbsent(6);
    }


    // Methods for field "idSesionRx"
    public PrintableString getIdSesionRx()
    {
	return (PrintableString)mComponents[7];
    }

    public void setIdSesionRx(PrintableString idSesionRx)
    {
	mComponents[7] = idSesionRx;
    }

    public boolean hasIdSesionRx()
    {
	return componentIsPresent(7);
    }

    public void deleteIdSesionRx()
    {
	setComponentAbsent(7);
    }


    // Methods for field "externalclientID"
    public Msisdn getExternalclientID()
    {
	return (Msisdn)mComponents[8];
    }

    public void setExternalclientID(Msisdn externalclientID)
    {
	mComponents[8] = externalclientID;
    }

    public boolean hasExternalclientID()
    {
	return componentIsPresent(8);
    }

    public void deleteExternalclientID()
    {
	setComponentAbsent(8);
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
	    "CalidadServicio"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "CalidadServicio"
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
					    new INTEGER(20),
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
		    "idEvento",
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
					    new INTEGER(20),
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
		    "idAplicacion",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
					    new INTEGER(8),
					    new INTEGER(40),
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
		    "ipUsuario",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "maxBPSup",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "maxBPSDown",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "idAplicacionAF",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
					    new INTEGER(100),
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
		    "idSesionGy",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
					    new INTEGER(100),
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
		    "idSesionRx",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
			)
		    ),
		    "externalclientID",
		    8,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 6),
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 7),
			new TagDecoderElement((short)0x8009, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 8)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' CalidadServicio object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' CalidadServicio object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for CalidadServicio
