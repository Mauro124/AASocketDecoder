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
 * Define the ASN1 Type Balance from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class Balance extends Sequence {

    /**
     * The default constructor.
     */
    public Balance()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public Balance(INTEGER walletID, INTEGER64 walletBalance,
		    INTEGER64 walletBalanceChange,
		    PrintableString walletNewValidity)
    {
	setWalletID(walletID);
	setWalletBalance(walletBalance);
	setWalletBalanceChange(walletBalanceChange);
	setWalletNewValidity(walletNewValidity);
    }

    /**
     * Construct with components.
     */
    public Balance(long walletID, INTEGER64 walletBalance,
		    INTEGER64 walletBalanceChange,
		    PrintableString walletNewValidity)
    {
	this(new INTEGER(walletID), walletBalance, walletBalanceChange,
	     walletNewValidity);
    }

    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER64();
	mComponents[2] = new INTEGER64();
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
		return new INTEGER64();
	    case 3:
		return new PrintableString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}

    }


    // Methods for field "walletID"
    public long getWalletID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }

    public void setWalletID(long walletID)
    {
	setWalletID(new INTEGER(walletID));
    }

    public void setWalletID(INTEGER walletID)
    {
	mComponents[0] = walletID;
    }


    // Methods for field "walletBalance"
    public INTEGER64 getWalletBalance()
    {
	return (INTEGER64)mComponents[1];
    }

    public void setWalletBalance(INTEGER64 walletBalance)
    {
	mComponents[1] = walletBalance;
    }


    // Methods for field "walletBalanceChange"
    public INTEGER64 getWalletBalanceChange()
    {
	return (INTEGER64)mComponents[2];
    }

    public void setWalletBalanceChange(INTEGER64 walletBalanceChange)
    {
	mComponents[2] = walletBalanceChange;
    }


    // Methods for field "walletNewValidity"
    public PrintableString getWalletNewValidity()
    {
	return (PrintableString)mComponents[3];
    }

    public void setWalletNewValidity(PrintableString walletNewValidity)
    {
	mComponents[3] = walletNewValidity;
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
	    "Balance"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "Balance"
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
		    "walletID",
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
		    "walletBalance",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "walletBalanceChange",
		    2,
		    2,
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
		    "walletNewValidity",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' Balance object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' Balance object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for Balance
