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
 * Define the ASN1 Type BalanceRecarga from ASN1 Module PPIF_INTERFAZEXTERNA.
 * @see Sequence
 */

public class BalanceRecarga extends Sequence {

    /**
     * The default constructor.
     */
    public BalanceRecarga()
    {
    }

    /**
     * Construct with AbstractData components.
     */
    public BalanceRecarga(INTEGER walletID, INTEGER walletBalance,
		    INTEGER walletBalanceChange,
		    PrintableString walletNewValidity,
		    INTEGER walletBalanceNoCharged)
    {
	setWalletID(walletID);
	setWalletBalance(walletBalance);
	setWalletBalanceChange(walletBalanceChange);
	setWalletNewValidity(walletNewValidity);
	setWalletBalanceNoCharged(walletBalanceNoCharged);
    }

    /**
     * Construct with components.
     */
    public BalanceRecarga(long walletID, long walletBalance,
		    long walletBalanceChange,
		    PrintableString walletNewValidity,
		    long walletBalanceNoCharged)
    {
	this(new INTEGER(walletID), new INTEGER(walletBalance),
	     new INTEGER(walletBalanceChange), walletNewValidity,
	     new INTEGER(walletBalanceNoCharged));
    }

    /**
     * Construct with required components.
     */
    public BalanceRecarga(long walletID, long walletBalance,
		    long walletBalanceChange,
		    PrintableString walletNewValidity)
    {
	setWalletID(walletID);
	setWalletBalance(walletBalance);
	setWalletBalanceChange(walletBalanceChange);
	setWalletNewValidity(walletNewValidity);
    }

    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new PrintableString();
	mComponents[4] = new INTEGER();
    }

    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }

    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new PrintableString();
	    case 4:
		return new INTEGER();
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
    public long getWalletBalance()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }

    public void setWalletBalance(long walletBalance)
    {
	setWalletBalance(new INTEGER(walletBalance));
    }

    public void setWalletBalance(INTEGER walletBalance)
    {
	mComponents[1] = walletBalance;
    }


    // Methods for field "walletBalanceChange"
    public long getWalletBalanceChange()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }

    public void setWalletBalanceChange(long walletBalanceChange)
    {
	setWalletBalanceChange(new INTEGER(walletBalanceChange));
    }

    public void setWalletBalanceChange(INTEGER walletBalanceChange)
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


    // Methods for field "walletBalanceNoCharged"
    public long getWalletBalanceNoCharged()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }

    public void setWalletBalanceNoCharged(long walletBalanceNoCharged)
    {
	setWalletBalanceNoCharged(new INTEGER(walletBalanceNoCharged));
    }

    public void setWalletBalanceNoCharged(INTEGER walletBalanceNoCharged)
    {
	mComponents[4] = walletBalanceNoCharged;
    }

    public boolean hasWalletBalanceNoCharged()
    {
	return componentIsPresent(4);
    }

    public void deleteWalletBalanceNoCharged()
    {
	setComponentAbsent(4);
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
	    "BalanceRecarga"
	),
	new QName (
	    "PPIF-INTERFAZEXTERNA",
	    "BalanceRecarga"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "walletBalance",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "walletBalanceNoCharged",
		    4,
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
			new TagDecoderElement((short)0x8003, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 4)
		    }
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' BalanceRecarga object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' BalanceRecarga object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

} // End class definition for BalanceRecarga
